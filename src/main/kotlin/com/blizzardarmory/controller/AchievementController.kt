package com.blizzardarmory.controller

import com.blizzardarmory.model.AchievementQuery
import com.blizzardarmory.repository.AchievementRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AchievementController(val repository: AchievementRepository) {

    @RequestMapping("/achievements/{locale}")
    fun achievements(@PathVariable locale: String): List<AchievementQuery> {
        return repository.getAllAchievements(locale)
    }
}