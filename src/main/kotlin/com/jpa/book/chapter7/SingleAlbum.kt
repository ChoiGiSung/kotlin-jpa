package com.jpa.book.chapter7

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@DiscriminatorValue("A")
class SingleAlbum(
    @Id
    override var id: Long,
):SingleItem(id){
}
