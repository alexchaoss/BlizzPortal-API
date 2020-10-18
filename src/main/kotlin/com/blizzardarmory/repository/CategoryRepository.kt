package com.blizzardarmory.repository

import com.blizzardarmory.model.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<Category, Long> {

    @Query(value = "select " +
            "id, " +
            "name->> :locale as name, " +
            "is_guild_category, " +
            "display_order, " +
            "parent_category_id, " +
            "horde_quantity, " +
            "horde_points, " +
            "alliance_quantity, " +
            "alliance_points " +
            "from achievement_categories",
            nativeQuery = true)
    fun getAllCategories(@Param("locale") locale: String): List<Category>
}