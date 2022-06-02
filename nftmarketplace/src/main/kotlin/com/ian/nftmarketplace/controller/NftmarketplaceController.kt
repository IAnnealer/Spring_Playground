package com.ian.nftmarketplace.controller

import com.ian.nftmarketplace.exception.NFTNotFoundException
import com.ian.nftmarketplace.model.NFT
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/nfts")
class NftmarketplaceController {

    @Value("\${company_name}")
    private lateinit var name: String

    private var NFTs = mutableListOf<NFT>(
        NFT(1, "CryptoPunks", 100.0),
        NFT(2, "Sneaky Vampire Syndicate", 36.9),
        NFT(3, "The Sevens (Official)", 0.6),
        NFT(4, "Art Blocks Curated", 1.1),
        NFT(5, "Pudgy Penguins", 2.5),
    )

    @GetMapping("/homepage")
    fun getHomePage() = "$name: NFTs Marketplace"

    @GetMapping("")
    fun getNFTs() = NFTs

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    fun postNFT(@RequestBody nft: NFT): NFT {
        val nextId = (NFTs.map { it.id }.maxOrNull() ?: 0) + 1
        val newNft = NFT(id = nextId, name = nft.name, floor_price = nft.floor_price)

        NFTs.add(nft)
        return newNft
    }

    @GetMapping("/{id}")
    fun getNFTById(@PathVariable id: Int): NFT? {
        val nft = NFTs.firstOrNull { it.id == id }
        return nft ?: throw NFTNotFoundException()
    }
}