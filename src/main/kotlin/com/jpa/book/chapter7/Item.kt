package com.jpa.book.chapter7

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
open class Item(
    @Id
    @GeneratedValue
    open var id: Long,
) {
}
