package com.jpa.book.chapter7

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Board(
    @Id
    @GeneratedValue
    val id: Long,
) {
}
