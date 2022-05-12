package com.jpa.book.chapter15

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Member(
    @Id
    @GeneratedValue
    val id:Long
) {
}


interface MemberRepository : JpaRepository<Member,Long>
