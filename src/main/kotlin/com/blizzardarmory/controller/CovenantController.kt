package com.blizzardarmory.controller

import com.blizzardarmory.model.Covenant
import com.blizzardarmory.model.TechTalent
import com.blizzardarmory.repository.CovenantRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CovenantController (val repository: CovenantRepository) {

    @RequestMapping("/covenant/class/{class_id}/{locale}")
    fun covenantClassSpells(@PathVariable class_id: Long, @PathVariable locale: String): List<Covenant> {
        return repository.getCovenantClassSpells(class_id, locale)
    }

    @RequestMapping("/covenant/{cov_id}/{locale}")
    fun covenantSpells(@PathVariable cov_id: Long, @PathVariable locale: String): List<Covenant> {
        return repository.getCovenantSpells(cov_id, locale)
    }
}