package com.jpa.book.chapter13

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional

class OrderFacade(
    @Autowired
    val sampleService : SampleService
) {

    @Transactional
    fun findOrder(id : Long){
        //비즈니스 로직
        sampleService.logic()
    }

    //osiv
}
