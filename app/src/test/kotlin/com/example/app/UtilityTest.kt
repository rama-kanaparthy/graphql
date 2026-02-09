package com.example.app

import org.junit.Test
import org.junit.Assert.*

/**
 * Unit tests for utility functions
 */
class UtilityTest {

    @Test
    fun testIsValidEmail_validEmail_returnsTrue() {
        val email = "test@example.com"
        assertTrue(isValidEmail(email))
    }

    @Test
    fun testIsValidEmail_invalidEmail_returnsFalse() {
        val invalidEmails = listOf(
            "plainaddress",
            "@example.com",
            "test@",
            "test@.com",
            "test..test@example.com"
        )
        invalidEmails.forEach { email ->
            assertFalse(isValidEmail(email))
        }
    }

    @Test
    fun testIsNotEmpty_nonEmptyString_returnsTrue() {
        assertTrue(isNotEmpty("hello"))
    }

    @Test
    fun testIsNotEmpty_emptyString_returnsFalse() {
        assertFalse(isNotEmpty(""))
    }

    @Test
    fun testIsNotEmpty_nullString_returnsFalse() {
        assertFalse(isNotEmpty(null))
    }

    private fun isValidEmail(email: String): Boolean {
        val emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}".toRegex()
        return email.matches(emailPattern)
    }

    private fun isNotEmpty(text: String?): Boolean {
        return !text.isNullOrEmpty()
    }
}
