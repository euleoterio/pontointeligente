package com.euleoterio.pontointeligente.documents

import com.euleoterio.pontointeligente.enums.ProfileEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Employee (
    val name: String,
    val email: String,
    val password: String,
    val cpf: String,
    val profile: ProfileEnum,
    val employeeId: String,
    val valueHour: Double? = 0.0,
    val hoursWorkDay: Float? = 0.0f,
    val hoursLaunch: Float? = 0.0f,
    @Id val id: String? = null
)