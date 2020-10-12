package com.blizzardarmory.model

import org.springframework.boot.autoconfigure.domain.EntityScan
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Category {
    val alliancePoints: Int? = null
    val allianceQuantity: Int? = null
    val displayOrder: Int? = null
    val hordePoints: Int? = null
    val hordeQuantity: Int? = null
    @Id
    val id: Long? = null
    val isGuildCategory: Boolean? = null
    val name: String? = null
    val parentCategoryId: Long? = null
}
