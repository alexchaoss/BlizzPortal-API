package com.blizzardarmory.repository

import com.blizzardarmory.model.Instances
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface InstancesRepository : JpaRepository<Instances, Long> {

    @Query(value = "select " +
            "id, " +
            "name->> :locale as name, " +
            "expansion_id " +
            "from journal_instances " +
            "where category_id = \"DUNGEON\" " +
            "order by expansion_id",
            nativeQuery = true)
    fun getAllInstances(@Param("locale") locale: String): List<Instances>
}