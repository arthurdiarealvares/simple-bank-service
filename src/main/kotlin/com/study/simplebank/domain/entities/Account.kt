package com.study.simplebank.domain.entities

import de.huxhorn.sulky.ulid.ULID
import javax.persistence.*

@Entity
@Table(name = "account")
data class Account(
    @Id
    @Column(name = "account_number", nullable = false, length = 26)
    val accountNumber: String = ULID().nextULID(),

    @Column(name = "balance", nullable = false)
    val balance: Double = 0.0,

    @Column(name = "user_id", nullable = false)
    val client: Long
)