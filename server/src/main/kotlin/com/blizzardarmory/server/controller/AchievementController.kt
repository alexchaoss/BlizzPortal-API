package com.blizzardarmory.server.controller

import com.blizzardarmory.server.model.Achievement
import com.blizzardarmory.server.model.Category
import com.blizzardarmory.server.repository.AchievementRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AchievementController(val repository: AchievementRepository) {

    @RequestMapping("/achievements/{locale}")
    fun achievements(@PathVariable locale: String): List<Achievement> {
        return repository.getAllAchievements(locale)
    }
}