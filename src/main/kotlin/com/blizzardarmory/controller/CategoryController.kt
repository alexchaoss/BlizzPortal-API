package com.blizzardarmory.controller

import com.blizzardarmory.model.Category
import com.blizzardarmory.repository.CategoryRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CategoryController(val repository: CategoryRepository) {

    @RequestMapping("/categories/{locale}")
    fun categories(@PathVariable locale: String): List<Category> {
        return repository.getAllCategories(locale)
    }
}