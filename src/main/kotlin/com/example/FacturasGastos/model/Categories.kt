package com.example.FacturasGastos.model

import jakarta.persistence.*


@Entity
@Table(name = "categories")
class Categories  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @Column(nullable = false)
    val name: String? = null
}