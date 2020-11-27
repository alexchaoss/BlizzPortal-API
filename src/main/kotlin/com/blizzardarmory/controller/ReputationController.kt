package com.blizzardarmory.controller

import com.blizzardarmory.model.Reputation
import com.blizzardarmory.repository.ReputationRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ReputationController (val repository: ReputationRepository) {

    @RequestMapping("/reputations/{locale}")
    fun categories(@PathVariable locale: String): List<Reputation> {
        return repository.getReputations(locale)
    }
}