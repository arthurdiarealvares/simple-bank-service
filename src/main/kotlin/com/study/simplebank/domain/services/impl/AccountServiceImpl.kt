package com.study.simplebank.domain.services.impl

import com.study.simplebank.commons.exceptions.AccountNotFoundException
import com.study.simplebank.domain.repositories.AccountRepository
import com.study.simplebank.domain.services.AccountService
import org.springframework.stereotype.Service

@Service
class AccountServiceImpl(
    val accountRepository: AccountRepository
): AccountService {
    override fun getBalance(id: String): Double {
        validateAccountByNumber(id)
        return 0.0
    }

    private fun validateAccountByNumber(id: String){
        if(accountRepository.findById(id).isEmpty){
            throw AccountNotFoundException("Could not find any account using Account Number: $id")
        }
    }
}