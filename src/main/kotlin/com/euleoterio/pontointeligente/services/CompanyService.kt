package com.euleoterio.pontointeligente.services

import com.euleoterio.pontointeligente.documents.Company

interface CompanyService {

    fun findByCnpj(cnpj: String): Company?
    fun create(company: Company): Company
}