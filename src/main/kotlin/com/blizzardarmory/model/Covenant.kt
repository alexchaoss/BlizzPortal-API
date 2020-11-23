package com.blizzardarmory.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Covenant {
    @Id
    val covenant_id: Int? = null
    val playable_class_id: Int? = null
    val spell_tooltip_id: Int? = null
    val icon: String? = null
    val name: String? = null
    val description: String? = null
    val cooldown: String? = null
    val cast_time: String? = null
    val range: String? = null
    val power_cost: String? = null
}