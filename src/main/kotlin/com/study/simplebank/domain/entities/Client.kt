package com.study.simplebank.domain.entities

import javax.persistence.*

@Entity
@Table(name = "client")
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    val id: Long? = null,

    @Column(name = "name", nullable = false, length = 120)
    val name: String,

    @Column(name = "cpf", nullable = false, length = 11)
    val cpf: String
)