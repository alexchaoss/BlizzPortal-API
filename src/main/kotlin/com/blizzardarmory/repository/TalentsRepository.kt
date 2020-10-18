package com.blizzardarmory.repository

import com.blizzardarmory.model.Achievement
import com.blizzardarmory.model.Talent
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.math.BigDecimal
import java.math.BigInteger

@Repository
interface TalentsRepository : JpaRepository<Talent, Long> {

    @Query(value = "select t.id," +
            "       t.column_index," +
            "       t.description->>:locale as \"description\"," +
            "       t.tier_index," +
            "       t.level," +
            "       t.playable_class_id," +
            "       s.value as icon" +
            " from talents t " +
            " left join spell_media sm " +
            "   on sm.spell_id = t.spell_id" +
            " left join spell_assets s " +
            "   on s.spell_media_id = sm.spell_id" +
            " where t.playable_class_id = :class_id",
            nativeQuery = true)
    fun getTalents(@Param("class_id") class_id: Long,@Param("locale") locale: String): List<Talent>
}