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
    val members: MutableList<Member> = mutableListOf(),

    val name: String,
) {
    fun addMember(member: Member) {
        //무한루프 주의
        members.add(member)
        member.team?.let {
            if (it != this) member.team = this
        }
    }

    fun removeMember(member: Member) {
        members.remove(member)
    }
}
