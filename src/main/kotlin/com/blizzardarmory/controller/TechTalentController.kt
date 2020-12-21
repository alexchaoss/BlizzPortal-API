package com.blizzardarmory.controller

import com.blizzardarmory.model.TechTalent
import com.blizzardarmory.repository.TechTalentRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TechTalentController (val repository: TechTalentRepository){

    @RequestMapping("/tech_talents/{soulbind_id}/{locale}")
    fun techTalents(@PathVariable soulbind_id: Long, @PathVariable locale: String): List<TechTalent> {
        return repository.getTechTalents(soulbind_id, locale)
    }
}