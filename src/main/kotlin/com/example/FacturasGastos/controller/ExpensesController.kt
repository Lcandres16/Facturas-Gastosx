package com.example.FacturasGastos.controller

import com.example.FacturasGastos.model.Expenses
import com.example.FacturasGastos.service.ExpensesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/expenses")   //endpoint
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class ExpensesController {
    @Autowired
    lateinit var expensesService: ExpensesService

    @GetMapping
    fun list(): List<Expenses> {
        return expensesService.list()
    }

    @PostMapping
    fun save(@RequestBody expenses: Expenses): ResponseEntity<Expenses> {
        return ResponseEntity(expensesService.save(expenses), HttpStatus.OK)
    }

}