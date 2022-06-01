package com.ian.tutorials.springboot.kotlinSpringBoot.service

import com.ian.tutorials.springboot.kotlinSpringBoot.datasource.BankDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk()
    private val bankService = BankService(dataSource)

    @Test
    fun `should call datasource to retrieve banks`() {
        // when

        val banks = bankService.getBanks()
        // then
    }
}