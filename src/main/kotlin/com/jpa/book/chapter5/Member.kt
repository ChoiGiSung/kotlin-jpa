package com.jpa.book.chapter5

import javax.persistence.*

@Entity
class Member(
    @Id
    @GeneratedValue
    val id: Long,

    val username: String,

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    var team: Team? = null,
) {
}
