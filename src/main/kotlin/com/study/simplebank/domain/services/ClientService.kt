package com.study.simplebank.domain.services

import com.study.simplebank.application.web.dtos.request.ClientRequestDTO
import com.study.simplebank.application.web.dtos.response.RegisterClientResponseDTO
import com.study.simplebank.domain.entities.Client

interface ClientService {
    fun register(request: ClientRequestDTO): RegisterClientResponseDTO
}