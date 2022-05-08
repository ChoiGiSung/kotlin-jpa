package com.jpa.book.chapter5

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Team(
    @Id
    @GeneratedValue
    val id: Long,

    @OneToMany(mappedBy = "team")
    val members: List<Member> = mutableListOf(),

    val name: String,
) {
}
