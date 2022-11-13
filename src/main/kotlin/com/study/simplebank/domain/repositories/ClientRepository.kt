package com.study.simplebank.domain.repositories

import com.study.simplebank.domain.entities.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository: JpaRepository<Client, Long>