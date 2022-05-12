package com.jpa.book.chapter16

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Version

@Entity
class Board(
    @Id
    @GeneratedValue
    val id: Long,

    @Version
    var version: Int,
) {
}
