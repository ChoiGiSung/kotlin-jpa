package com.jpa.book.chapter8

import javax.persistence.*

@Entity
class Member(
    @Id
    @GeneratedValue
    val id: Long,

    val username: String,

    team: Team? = null,
) {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID", nullable = false)
    var team: Team? = team
        set(value) {
            //무한루프 주의
            field?.removeMember(this)
            field = value
            field?.addMember(this)
        }

}
