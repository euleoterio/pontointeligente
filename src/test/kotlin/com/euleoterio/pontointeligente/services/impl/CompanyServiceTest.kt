package com.euleoterio.pontointeligente.services.impl

import com.euleoterio.pontointeligente.documents.Company
import com.euleoterio.pontointeligente.repositories.CompanyRepository
import com.euleoterio.pontointeligente.services.CompanyService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest
class CompanyServiceTest {

    @Autowired
    val companyService: CompanyService? = null

    @MockBean
    private val companyRepository: CompanyRepository? = null

    private val cnpj = "51463645000100"

    @BeforeEach
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(companyRepository?.findByCnpj(cnpj)).willReturn(company())
        BDDMockito.given(companyRepository?.save(company())).willReturn(company())
    }

    @Test
    fun testFindCompanyByCnpj() {
        val company: Company? = companyService?.findByCnpj(cnpj)
        Assertions.assertNotNull(company)
    }

    @Test
    fun testCreateCompany() {
        val company: Company? = companyService?.create(company())
        Assertions.assertNotNull(company)
    }

    private fun company(): Company = Company("Social Reason", cnpj, "1")
}