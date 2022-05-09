package com.jpa.book.chapter6

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.ManyToOne

@Entity
@IdClass(MultiKey::class)
class Person() {
    @Id
    @ManyToOne
    var sam: Sample? = null

    @Id
    @ManyToOne
    var sam2: Sample? = null

}

data class Sample(val key: Long)
