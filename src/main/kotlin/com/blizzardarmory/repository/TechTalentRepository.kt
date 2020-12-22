package com.blizzardarmory.repository


import com.blizzardarmory.model.TechTalent
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface TechTalentRepository : JpaRepository<TechTalent, Long> {

    @Query(value = "SELECT tal.id," +
            "       sa.value as icon," +
            "       tal.name->>:locale as \"name\"," +
            "       tal.description->>:locale as \"description\"," +
            "       tal.cast_time->>:locale as \"cast_time\"," +
            "       tal.tier," +
            "       ttt.tree_id," +
            "       tal.display_order" +
            " FROM" +
            "  (SELECT cast(tt.spell_tooltip->'spell'->'id' as BIGINT) AS spell_id," +
            "             tt.spell_tooltip->'description' as description," +
            "             tt.spell_tooltip->'cast_time' as cast_time," +
            "          tt.id," +
            "             tt.tier," +
            "             tt.display_order," +
            "             tt.name" +
            "   FROM tech_talents tt) tal" +
            " LEFT JOIN" +
            "  (SELECT cast(jsonb_array_elements(tech.talents)->'id' AS BIGINT) AS talent_id," +
            "          tech.id AS tree_id" +
            "   FROM tech_talent_trees tech) ttt ON tal.id = ttt.talent_id" +
            " LEFT JOIN spells sp ON sp.id = spell_id" +
            " LEFT JOIN spell_media sm ON sm.id = sp.id" +
            " LEFT JOIN spell_assets sa ON sa.spell_media_id = sm.id" +
            " LEFT JOIN soulbinds sb ON sb.tech_talent_tree_id = ttt.tree_id" +
            " WHERE sb.id = :sb_id",
        nativeQuery = true)
    fun getTechTalents(@Param("sb_id") soulbind_id: Long, @Param("locale") locale: String): List<TechTalent>
}