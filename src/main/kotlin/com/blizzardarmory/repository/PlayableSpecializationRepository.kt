package com.blizzardarmory.repository

import com.blizzardarmory.model.Instances
import com.blizzardarmory.model.PlayableSpecialization
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface PlayableSpecializationRepository : JpaRepository<PlayableSpecialization, Long> {

    @Query(value = "select " +
            "id, " +
            "role_id" +
            "playable_class_id " +
            "from playable_specializations ", nativeQuery = true)
    fun getAllPlayableSpecializations(): List<PlayableSpecialization>
}