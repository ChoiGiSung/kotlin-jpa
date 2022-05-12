package com.jpa.book.chapter15

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.*

@Entity
class Member(
    @Id
    @GeneratedValue
    val id: Long,
) {
}

@Entity
class Team(
    @Id
    @GeneratedValue
    val id: Long,

    @OneToMany(fetch = FetchType.LAZY)
    val member: List<Member>,
) {

}


interface MemberRepository : JpaRepository<Member, Long>
