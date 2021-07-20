package com.blizzardarmory.controller

import com.blizzardarmory.model.Instances
import com.blizzardarmory.model.PlayableSpecialization
import com.blizzardarmory.repository.InstancesRepository
import com.blizzardarmory.repository.PlayableSpecializationRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PlayableSpecializationController(val repository: PlayableSpecializationRepository) {

    @RequestMapping("/playableSpecialization")
    fun instances(): List<PlayableSpecialization> {
        return repository.getAllPlayableSpecializations()
    }
}