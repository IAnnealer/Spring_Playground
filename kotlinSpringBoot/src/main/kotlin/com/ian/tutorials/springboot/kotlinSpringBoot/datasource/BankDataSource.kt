package com.ian.tutorials.springboot.kotlinSpringBoot.datasource

import com.ian.tutorials.springboot.kotlinSpringBoot.model.Bank

interface BankDataSource {

//    fun getBanks(): Collection<Bank>

    fun retrieveBanks(): Collection<Bank>
}