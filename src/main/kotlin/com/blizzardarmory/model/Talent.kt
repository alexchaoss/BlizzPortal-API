package com.blizzardarmory.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Talent {
    @Id
    val id: Long? = null
    val description: String? = null
    val column_index: Long? = null
    val tier_index: Long? = null
    val level: Int? = null
    val playable_class_id: Long? = null
    val icon: String? = null
}