package com.blizzardarmory.repository

import com.blizzardarmory.model.AchievementQuery
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface AchievementRepository : JpaRepository<AchievementQuery, Long> {

    @Query(value = "select av.id," +
            "       av.name->>:locale as \"name\"," +
            "       av.description->>:locale as \"description\"," +
            "       av.points," +
            "       av.display_order," +
            "       av.is_account_wide," +
            "       av.category_id," +
            "       ac.name->>:locale as \"category\"," +
            "       ac.parent_category_id," +
            "       acc.name->>:locale as \"parent_category_name\"," +
            "       aa.value as \"icon\"" +
            "  from achievements av " +
            "  inner join achievement_categories ac" +
            "    on ac.id = av.category_id" +
            "  inner join achievement_categories acc" +
            "    on acc.id = ac.parent_category_id" +
            "  left join achievement_media am" +
            "    on am.achievement_id = av.id" +
            "  left join achievement_assets aa" +
            "    on aa.achievement_media_id = am.id",
            nativeQuery = true)
    fun getAllAchievements(@Param("locale") locale: String): List<AchievementQuery>
}