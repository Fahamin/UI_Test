package com.tbl.ui_test

import android.content.Intent
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import org.hamcrest.core.AllOf.allOf
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    //for lunch in mainactivity this role deffined
    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun testButton_expectedtrue() {
        onView(withId(R.id.btn_ShowTost))
            .perform(click())
// this for textview settex
        onView(
            allOf(
                withId(R.id.tv_ShowTost),
                withText("hello text")
            )
        ).check(matches(isDisplayed()));
    }

    @Test
    fun testShareButton_expectedIntentChooser() {
        Intents.init()
        val expected = allOf(hasAction(Intent.ACTION_SEND))
        onView(withId(R.id.btn_share)).perform(click())
        intended(expected)
        Intents.release()
    }

}