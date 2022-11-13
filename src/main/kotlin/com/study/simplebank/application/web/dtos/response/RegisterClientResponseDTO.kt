package com.study.simplebank.application.web.dtos.response

import com.study.simplebank.domain.entities.Account

data class RegisterClientResponseDTO(
    val name: String,
    val cpf: String,
    val accountNumber: String
)
