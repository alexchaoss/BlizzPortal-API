package com.blizzardarmory.model

import javax.persistence.*

@Entity
//@Table(name = "achievements")
class Achievements{
    @Id
    val id: Long? = null
    /*@OneToOne
    @JoinColumn(name  = "category_id")
    val category: Category? = null*/
    val category_id: Long? = null
    val name: Long? = null
    val description: Long? = null
    val points: Long? = null
    val is_account_wide: Long? = null
    /*@OneToOne
    @JoinColumn(name  = "faction_id")
    val faction: Faction? = null*/
    val faction_id: Long? = null
    val prerequisite_achievement_id: Long? = null
    val next_achievement_id: Long? = null
    val display_order: Long? = null
    val reward_description: Long? = null
    val reward_item_id: Long? = null
}