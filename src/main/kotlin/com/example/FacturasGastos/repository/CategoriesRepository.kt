package com.example.FacturasGastos.repository

import com.example.FacturasGastos.model.Categories
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository



@Repository
interface CategoriesRepository: JpaRepository<Categories, Long?> {
    fun findById (id: Long?): Categories?
}