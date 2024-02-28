package com.example.FacturasGastos.model

import jakarta.persistence.*
import jakarta.persistence.JoinColumn
import java.math.BigDecimal


@Suppress("JpaAttributeTypeInspection")
@Entity
@Table(name = "expenses")
class Expenses{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(nullable = false)
    var description: String? = null

    @Column(nullable = false)
    var amount: BigDecimal? = null

    @Column(name="categories_id")
    var categoriesId: Long? = null
}
