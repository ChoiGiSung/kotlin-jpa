package com.jpa.book.chapter7

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
open class SingleItem(
    @Id
    @GeneratedValue
    open var id: Long,
) {
}
