package com.blizzardarmory.model

import org.springframework.boot.autoconfigure.domain.EntityScan
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Category {
    val alliance_points: Int? = null
    val alliance_quantity: Int? = null
    val display_order: Int? = null
    val horde_points: Int? = null
    val horde_quantity: Int? = null
    @Id
    val id: Long? = null
    val is_guild_category: Boolean? = null
    val name: String? = null
    val parent_category_id: Long? = null
}
