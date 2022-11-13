package com.study.simplebank.application.web.controller

import com.study.simplebank.application.web.dtos.request.ClientRequestDTO
import com.study.simplebank.application.web.dtos.response.RegisterClientResponseDTO
import com.study.simplebank.domain.services.ClientService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/client")
class ClientController(
    val clientService: ClientService
) {
    @PostMapping
    fun register(
        @RequestBody body: ClientRequestDTO
    ): ResponseEntity<RegisterClientResponseDTO>{
        return ResponseEntity.ok().body(clientService.register(body))
    }
}