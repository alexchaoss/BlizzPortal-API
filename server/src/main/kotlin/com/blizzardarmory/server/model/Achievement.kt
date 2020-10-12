package com.blizzardarmory.server.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Achievement {
    @Id
    val id: Long? = null
    val name: String? = null
    val description: String? = null
    val points: Int? = null
    val is_account_wide: Boolean? = null
    val display_order: Int? = null
    val category_id: Long? = null
    /*val category: String? = null
    val parent_category_id: Long? = null
    val parent_category_name: String? = null
    val icon: String? = null*/
}