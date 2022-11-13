package com.study.simplebank.domain.repositories

import com.study.simplebank.domain.entities.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository: JpaRepository<Account, String>