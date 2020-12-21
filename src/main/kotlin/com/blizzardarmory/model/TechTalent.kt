package com.blizzardarmory.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TechTalent {
    @Id
    val id: Long? = null
    val icon: String? = null
    val name: String? = null
    val description: String? = null
    val cast_time: String? = null
    val tier: Long? = null
    val display_order: Long? = null
}