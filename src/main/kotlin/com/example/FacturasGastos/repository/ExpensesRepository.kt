package com.example.FacturasGastos.repository


import com.example.FacturasGastos.model.Expenses
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface ExpensesRepository : JpaRepository<Expenses, Long> {
    fun findById (id: Long?): Expenses?
}