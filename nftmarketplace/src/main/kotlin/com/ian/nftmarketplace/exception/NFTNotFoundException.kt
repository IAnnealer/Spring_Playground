package com.ian.nftmarketplace.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import javax.servlet.http.HttpServletRequest

class NFTNotFoundException: Exception() {

    // Spring Boot scans and registers this class as ControllerAdvice
    @ControllerAdvice
    class NFTErrorHandler {
        @ExceptionHandler(NFTNotFoundException::class)      // this method can handle that exception
        fun handleNFTNotFoundException(
            servletRequest: HttpServletRequest,
            excepiton: Exception): ResponseEntity<String> {
            return ResponseEntity("NFT not found", HttpStatus.NOT_FOUND)
        }
    }
}