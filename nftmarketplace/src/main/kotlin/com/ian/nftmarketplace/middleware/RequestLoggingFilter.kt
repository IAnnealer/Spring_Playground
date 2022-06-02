package com.ian.nftmarketplace.middleware

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

@Component
class RequestLoggingFilter : Filter {
    val loggerFactory = LoggerFactory.getLogger("NFT Logger")

    override fun doFilter(
        request: ServletRequest?,
        response: ServletResponse?,
        chain: FilterChain?
    ) {
        val utmSource = request?.getParameter("utm_source")
        loggerFactory.info("Logging UTM source: $utmSource")
        chain?.doFilter(request, response)
    }
}