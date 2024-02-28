package com.example.FacturasGastos.controller


import com.example.FacturasGastos.model.Categories
import com.example.FacturasGastos.model.Expenses
import com.example.FacturasGastos.service.CategoriesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/categories")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class CategoriesController {
    @Autowired
    lateinit var categoriesService: CategoriesService

    @GetMapping
    fun list(): List<Categories> {
        return categoriesService.list()
    }

    @PostMapping
    fun save(@RequestBody categories: Categories): ResponseEntity<Categories> {
        return ResponseEntity(categoriesService.save(categories), HttpStatus.OK)
    }

    @GetMapping("/{categoryId}/expenses")
    fun getExpensesByCategory(@PathVariable categoryId: Long): List<Expenses> {
        return categoriesService.getExpensesByCategory(categoryId)
    }
}