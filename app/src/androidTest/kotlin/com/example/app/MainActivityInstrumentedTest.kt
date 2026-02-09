package com.example.app

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test for MainActivity, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test is available here
        val context = androidx.test.platform.app.InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.app", context.packageName)
    }

    @Test
    fun mainActivityLaunches() {
        activityRule.scenario.onActivity { activity ->
            assertNotNull(activity)
        }
    }

    @Test
    fun textViewDisplaysCorrectText() {
        onView(withId(R.id.text_view_welcome))
            .check(matches(withText("Hello, World!")))
    }
}
