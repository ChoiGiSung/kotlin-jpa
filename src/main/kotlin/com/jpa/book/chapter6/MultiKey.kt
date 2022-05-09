package com.jpa.book.chapter6

import java.io.Serializable

data class MultiKey(
    val key: Long,
    val key2: Long,
) : Serializable {
}
