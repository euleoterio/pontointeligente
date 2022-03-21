package com.euleoterio.pontointeligente.services.impl

import com.euleoterio.pontointeligente.documents.Employee
import com.euleoterio.pontointeligente.enums.ProfileEnum
import com.euleoterio.pontointeligente.repositories.EmployeeRepository
import com.euleoterio.pontointeligente.services.EmployeeService
import com.euleoterio.pontointeligente.utils.PasswordUtils
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import java.util.*

@SpringBootTest
class EmployeeServiceTest {

    @MockBean
    private val employeeRepository: EmployeeRepository? = null

    @Autowired
    private val employeeService: EmployeeService? = null

    private val email: String = "email@email.com"
    private val cpf: String = "34234855948"
    private val id: String = "1"

    @BeforeEach
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(employeeRepository?.save(Mockito.any(Employee::class.java))).willReturn(employee())
        BDDMockito.given(employeeRepository?.findById(id)).willReturn(Optional.of(employee()))
        BDDMockito.given(employeeRepository?.findByEmail(email)).willReturn(employee())
        BDDMockito.given(employeeRepository?.findByCpf(cpf)).willReturn(employee())
    }

    @Test
    fun testCreateEmployee() {
        val employee: Employee? = this.employeeService?.create(employee())
        Assertions.assertNotNull(employee)
    }

    @Test
    fun testFindEmployeeByCpf() {
        val employee: Employee? = this.employeeService?.findByCpf(cpf)
        Assertions.assertNotNull(employee)
    }

    @Test
    fun testFindEmployeeByEmail() {
        val employee: Employee? = this.employeeService?.findByEmail(email)
        Assertions.assertNotNull(employee)
    }

    @Test
    fun testFindEmployeeById() {
        val employee: Optional<Employee>? = this.employeeService?.findById(id)
        Assertions.assertNotNull(employee)
    }

    fun employee(): Employee =
        Employee("Nome", email, PasswordUtils().generateBcrypt("123456"), cpf, ProfileEnum.ROLE_USER, id)

}