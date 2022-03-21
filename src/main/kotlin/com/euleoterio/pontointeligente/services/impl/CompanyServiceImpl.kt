package com.euleoterio.pontointeligente.services.impl

import com.euleoterio.pontointeligente.documents.Company
import com.euleoterio.pontointeligente.repositories.CompanyRepository
import com.euleoterio.pontointeligente.services.CompanyService
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl(val companyRepository: CompanyRepository) : CompanyService {

    override fun findByCnpj(cnpj: String): Company? = companyRepository.findByCnpj(cnpj)

    override fun create(company: Company): Company = companyRepository.save(company)

}