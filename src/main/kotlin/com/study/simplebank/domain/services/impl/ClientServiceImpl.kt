package com.study.simplebank.domain.services.impl

import com.study.simplebank.application.web.dtos.request.ClientRequestDTO
import com.study.simplebank.application.web.dtos.response.RegisterClientResponseDTO
import com.study.simplebank.domain.entities.Account
import com.study.simplebank.domain.entities.Client
import com.study.simplebank.domain.repositories.AccountRepository
import com.study.simplebank.domain.repositories.ClientRepository
import com.study.simplebank.domain.services.ClientService
import org.springframework.stereotype.Service

@Service
class ClientServiceImpl(
    val clientRepository: ClientRepository,
    val accountRepository: AccountRepository
) : ClientService {
    override fun register(request: ClientRequestDTO): RegisterClientResponseDTO {
        val client = clientRepository.save(Client(name = request.name, cpf = request.cpf))
        val account = accountRepository.save(Account(client = client.id!!))
        return RegisterClientResponseDTO(client.name, client.cpf, account.accountNumber)
    }
}