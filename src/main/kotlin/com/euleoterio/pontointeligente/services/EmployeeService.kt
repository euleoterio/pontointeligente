package com.euleoterio.pontointeligente.services

import com.euleoterio.pontointeligente.documents.Employee
import java.util.*

interface EmployeeService {

    fun create(employee: Employee): Employee
    fun findByCpf(cpf: String): Employee?
    fun findByEmail(email: String): Employee?
    fun findById(id: String): Optional<Employee>?
}