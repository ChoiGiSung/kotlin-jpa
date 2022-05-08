package com.jpa.book.chapter4

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
) {
}
