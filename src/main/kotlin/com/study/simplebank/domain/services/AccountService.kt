package com.study.simplebank.domain.services

interface AccountService {
    fun getBalance(id: String): Double
}