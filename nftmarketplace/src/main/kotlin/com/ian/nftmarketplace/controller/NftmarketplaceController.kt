package com.ian.nftmarketplace.controller

import com.ian.nftmarketplace.model.NFT
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NftmarketplaceController {

    private var NFTs = mutableListOf<NFT>(
        NFT(1, "CryptoPunks", 100.0),
        NFT(2, "Sneaky Vampire Syndicate", 36.9),
        NFT(3, "The Sevens (Official)", 0.6),
        NFT(4, "Art Blocks Curated", 1.1),
        NFT(5, "Pudgy Penguins", 2.5),
    )

    @GetMapping("/homepage")
    fun getHomePage() = "NFTs Marketplace"

    @GetMapping("")
    fun getNFTs() = NFTs
}