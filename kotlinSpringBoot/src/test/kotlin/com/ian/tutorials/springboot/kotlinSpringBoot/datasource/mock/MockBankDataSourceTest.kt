package com.ian.tutorials.springboot.kotlinSpringBoot.datasource.mock

import org.junit.jupiter.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource: MockBankDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        // when
        val banks = mockDataSource.getBanks()

        // then
        assertThat(banks).isNotEmpty
    }

    @Test
    fun `should provide some mock data`() {
        // when
        val banks = mockDataSource.getBanks()

        // then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).allMatch { it.transactionFee != 0 }
    }
}