package com.example.app

import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(0, 2 - 2)
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(6, 2 * 3)
    }

    @Test
    fun division_isCorrect() {
        assertEquals(2, 4 / 2)
    }

    @Test
    fun testStringOperations() {
        val text = "Android"
        assertTrue(text.contains("Android"))
        assertEquals(7, text.length)
        assertEquals("ANDROID", text.uppercase())
    }

    @Test
    fun testListOperations() {
        val list = listOf(1, 2, 3, 4, 5)
        assertEquals(5, list.size)
        assertTrue(list.contains(3))
        assertFalse(list.contains(10))
    }
}
