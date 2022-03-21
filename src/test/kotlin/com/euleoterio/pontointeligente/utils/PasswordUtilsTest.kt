package com.euleoterio.pontointeligente.utils

import org.junit.jupiter.api.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.junit.jupiter.api.Assertions

class PasswordUtilsTest {

    private val password = "12345"
    private val bCryptEncoder = BCryptPasswordEncoder()

    @Test
    fun testGenerateHashPassword() {
        val hash = PasswordUtils().generateBcrypt(password)
        Assertions.assertTrue(bCryptEncoder.matches(password, hash))
    }
}