package com.example.FacturasGastos.service

import com.example.FacturasGastos.model.Expenses
import com.example.FacturasGastos.repository.CategoriesRepository
import com.example.FacturasGastos.repository.ExpensesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class ExpensesService {

    @Autowired
    lateinit var categoriesRepository: CategoriesRepository

    @Autowired
    lateinit var expensesRepository: ExpensesRepository

    fun list ():List<Expenses>{
        return expensesRepository.findAll()
    }

    fun save(expenses: Expenses):Expenses{
        try {
            categoriesRepository.findById(expenses.categoriesId)
                ?: throw Exception("Id del cliente no encontrados")
            return expensesRepository.save(expenses)
        }catch (ex : Exception){
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message, ex)
        }
    }
}