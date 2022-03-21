package com.euleoterio.pontointeligente.documents

import com.euleoterio.pontointeligente.enums.TypeEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document
data class Posting (
    val date: Date,
    val type: TypeEnum,
    val employeeId: String,
    val description: String? = "",
    val location: String? = "",
    @Id val id: String? = null
)