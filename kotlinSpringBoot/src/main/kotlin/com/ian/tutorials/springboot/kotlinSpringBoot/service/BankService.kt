package com.ian.tutorials.springboot.kotlinSpringBoot.service

import com.ian.tutorials.springboot.kotlinSpringBoot.datasource.BankDataSource
import com.ian.tutorials.springboot.kotlinSpringBoot.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.getBanks()
}