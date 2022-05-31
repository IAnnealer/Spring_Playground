package com.ian.tutorials.springboot.kotlinSpringBoot.datasource.mock

import com.ian.tutorials.springboot.kotlinSpringBoot.datasource.BankDataSource
import com.ian.tutorials.springboot.kotlinSpringBoot.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(Bank("", 0.0, 1))

    override fun getBanks(): Collection<Bank> = banks
}