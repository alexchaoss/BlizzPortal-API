package com.blizzardarmory.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Instances {
    @Id
    val id: Long? = null
    val name: String? = null
    val expansionId: Long? = null
}