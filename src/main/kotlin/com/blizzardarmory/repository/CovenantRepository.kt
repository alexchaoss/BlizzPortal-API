package com.blizzardarmory.repository

import com.blizzardarmory.model.Covenant
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CovenantRepository : JpaRepository<Covenant, Long> {

    @Query(value = "select co.id," +
            "       co.covenant_id," +
            "       co.playable_class_id," +
            "       co.spell_tooltip_id," +
            "       s.value as icon," +
            "       sp.name->>:locale as \"name\"," +
            "       st.description->>:locale as \"description\"," +
            "       st.cast_time->>:locale as \"cast_time\"," +
            "       st.cooldown->>:locale as \"cooldown\"," +
            "       st.range->>:locale as \"range\"," +
            "       st.power_cost->>:locale as \"power_cost\"" +
            " from covenant_abilities co " +
            " left join spells sp" +
            "   on sp.id = co.spell_tooltip_id" +
            " left join spell_tooltips st" +
            "   on st.id = co.spell_tooltip_id" +
            " left join spell_media sm" +
            "   on sm.spell_id = co.spell_tooltip_id" +
            " left join spell_assets s" +
            "   on s.spell_media_id = sm.spell_id" +
            " where co.playable_class_id = :class_id",
            nativeQuery = true)
    fun getCovenant(@Param("class_id") class_id: Long, @Param("locale") locale: String): List<Covenant>
}