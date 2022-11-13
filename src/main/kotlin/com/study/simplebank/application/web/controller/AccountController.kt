package com.study.simplebank.application.web.controller

import com.study.simplebank.domain.services.AccountService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class AccountController(val accountService: AccountService) {
    @GetMapping
    fun getBalance(@RequestParam id: String): ResponseEntity<Double>{
        return ResponseEntity.ok(accountService.getBalance(id))
    }
}