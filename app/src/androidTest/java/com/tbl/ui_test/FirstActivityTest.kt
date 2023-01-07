package com.tbl.ui_test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class FirstActivityTest {

    @get:Rule
    val activityScenarioRule = activityScenarioRule<FirstActivity>()

    @Test
    fun testSubmitButton_expectedCorrectValue(){
        onView(withId(R.id.tv_title)).perform(typeText("hello"))
        onView(withId(R.id.tv_decsription)).perform(typeText("fahamin"), closeSoftKeyboard())

        onView(withId(R.id.submitButton)).perform(click())

    }
}