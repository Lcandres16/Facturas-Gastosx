package com.example.FacturasGastos.service

import com.example.FacturasGastos.model.Categories
import com.example.FacturasGastos.repository.CategoriesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class CategoriesService {
    @Autowired
    lateinit var categoriesRepository: CategoriesRepository

    fun list(): List<Categories> {
        return categoriesRepository.findAll()
    }

    fun save(categories: Categories): Categories {
        try {
            categories.name?.takeIf { it.trim().isNotEmpty() }
                ?: throw Exception("Nombres no debe ser vacio")
            return categoriesRepository.save(categories)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}