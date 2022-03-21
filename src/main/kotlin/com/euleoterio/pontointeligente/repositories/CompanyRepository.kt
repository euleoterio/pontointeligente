package com.euleoterio.pontointeligente.repositories

import com.euleoterio.pontointeligente.documents.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String> {

    fun findByCnpj(cnpj: String): Company?
}