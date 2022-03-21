package com.euleoterio.pontointeligente.services.impl

import com.euleoterio.pontointeligente.documents.Employee
import com.euleoterio.pontointeligente.repositories.EmployeeRepository
import com.euleoterio.pontointeligente.services.EmployeeService
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class EmployeeServiceImpl(val employeeRepository: EmployeeRepository) : EmployeeService {
    override fun create(employee: Employee): Employee = employeeRepository.save(employee)

    override fun findByCpf(cpf: String): Employee? = employeeRepository.findByCpf(cpf)

    override fun findByEmail(email: String): Employee? = employeeRepository.findByEmail(email)

    override fun findById(id: String): Optional<Employee> = employeeRepository.findById(id)
}