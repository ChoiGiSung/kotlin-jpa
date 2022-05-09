package com.jpa.book.chapter7

import javax.persistence.*

@Entity
class BoardDetail(
    @Id
    val boardId: Long,

    @MapsId
    @OneToOne
    @JoinColumn(name = "BOARD_ID")
    var board: Board? = null,
) {
}
