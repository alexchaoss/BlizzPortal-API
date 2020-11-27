package com.blizzardarmory.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Reputation {
    @Id
    val id: Long? = null
    val parent_faction_id: Long? = null
    val name: String? = null
    val is_header: Boolean? = null
}