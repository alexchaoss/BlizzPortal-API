package com.blizzardarmory.repository

import com.blizzardarmory.model.Reputation
import com.blizzardarmory.model.Talent
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ReputationRepository : JpaRepository<Reputation, Long> {

    @Query(value = "select id," +
            "       parent_faction_id," +
            "       name->>:locale as \"name\"," +
            "       is_header" +
            " from reputation_factions " +
            " order by parent_faction_id",
            nativeQuery = true)
    fun getReputations(@Param("locale") locale: String): List<Reputation>
}