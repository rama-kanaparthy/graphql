package com.example.app

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.assertEquals // Missing import fixed
import org.junit.Assert.assertNotNull // Missing import fixed

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {

    // Use createAndroidComposeRule for Compose projects
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun useAppContext() {
        val context = androidx.test.platform.app.InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.app", context.packageName)
    }

    @Test
    fun mainActivityLaunches() {
        assertNotNull(composeTestRule.activity)
    }

    @Test
    fun textViewDisplaysCorrectText() {
        // Compose equivalent of checking for text
        composeTestRule.onNodeWithText("Hello, World!").assertIsDisplayed()
    }
}