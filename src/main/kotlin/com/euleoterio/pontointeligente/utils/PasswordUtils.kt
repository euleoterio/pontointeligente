package com.euleoterio.pontointeligente.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtils {

    fun generateBcrypt(password: String): String = BCryptPasswordEncoder().encode(password)
}