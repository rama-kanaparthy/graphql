package com.example.app

import org.junit.Before
import org.junit.Test
import org.junit.Assert.*

class MainActivityTest {

    @Before
    fun setUp() {
        // Setup code before each test
    }

    @Test
    fun testMainActivityNotNull() {
        assertNotNull(MainActivity())
    }

    @Test
    fun testSimpleAddition() {
        val result = 2 + 2
        assertEquals(4, result)
    }

    @Test
    fun testStringEquality() {
        val expected = "Hello, World!"
        val actual = "Hello, World!"
        assertEquals(expected, actual)
    }
}
