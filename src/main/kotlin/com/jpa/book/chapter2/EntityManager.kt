package com.jpa.book.chapter2

import javax.persistence.Persistence

class EntityManager {

    fun getManager(){
        val createEntityManagerFactory = Persistence.createEntityManagerFactory("jpabook")
        val createEntityManager = createEntityManagerFactory.createEntityManager()
        val transaction = createEntityManager.transaction
    }
}
