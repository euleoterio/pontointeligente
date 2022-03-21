package com.euleoterio.pontointeligente.repositories

import com.euleoterio.pontointeligente.documents.Posting
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface PostingRepository : MongoRepository<Posting, String> {

    fun findByEmployeeId(employeeId: String, pageable: Pageable): Page<Posting>
}