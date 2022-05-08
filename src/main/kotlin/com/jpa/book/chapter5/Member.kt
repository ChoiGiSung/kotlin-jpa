package com.jpa.book.chapter5

import javax.persistence.*

@Entity
class Member(
    @Id
    @GeneratedValue
    val id: Long,

    val username: String,

    team: Team? = null,
) {

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    var team: Team? = team
        set(value) {
            field?.removeMember(this)
            field = value
            field?.addMember(this)
        }

}
