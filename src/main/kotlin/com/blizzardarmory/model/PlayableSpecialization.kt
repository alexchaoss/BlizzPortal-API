package com.blizzardarmory.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class PlayableSpecialization {
    @Id
    val id: Long? = null
    val playable_class_id: Long? = null
    val role_id: String? = null
}