package com.blizzardarmory.controller

import com.blizzardarmory.model.Instances
import com.blizzardarmory.repository.InstancesRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InstancesController(val repository: InstancesRepository) {

    @RequestMapping("/instances/{locale}")
    fun instances(@PathVariable locale: String): List<Instances> {
        return repository.getAllInstances(locale)
    }
}