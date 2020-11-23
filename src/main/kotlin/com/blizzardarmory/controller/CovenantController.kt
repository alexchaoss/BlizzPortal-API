package com.blizzardarmory.controller

import com.blizzardarmory.model.Covenant
import com.blizzardarmory.repository.CovenantRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CovenantController (val repository: CovenantRepository) {

    @RequestMapping("/covenant/{class_id}/{locale}")
    fun categories(@PathVariable class_id: Long, @PathVariable locale: String): List<Covenant> {
        return repository.getCovenant(class_id, locale)
    }
}