package com.blizzardarmory.controller

import com.blizzardarmory.model.Talent
import com.blizzardarmory.repository.TalentsRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
class TalentController (val repository: TalentsRepository) {

    @RequestMapping("/talents/{class_id}/{locale}")
    fun categories(@PathVariable class_id: Long, @PathVariable locale: String): List<Talent> {
        return repository.getTalents(class_id, locale)
    }
}