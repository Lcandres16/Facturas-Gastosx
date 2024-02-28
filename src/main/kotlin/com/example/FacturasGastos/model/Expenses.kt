package com.example.FacturasGastos.model

import jakarta.persistence.*


@Entity
@Table(name = "expenses")
class Expenses {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)

    var id: Long? = null

    @Column(name = "fecha")
    var date: java.sql.Date? = null

    @Column(name = "descripcion")
    var description: String? = null

    @Column(name = "monto")
    var amount: Double? = null

    @Column(name = "categoria_id")
    var categoryId: Int? = null
}