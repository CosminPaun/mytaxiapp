package com.mytaxi.android_demo;

import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.AuthenticationActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import android.support.test.rule.ActivityTestRule;


@RunWith(AndroidJUnit4.class)
public class AuthenticationActivityTest {

    @Rule
    public ActivityTestRule<AuthenticationActivity> mActivityRule = new ActivityTestRule<>(AuthenticationActivity.class);


    @Test
    public void testLogin() {
        onView(withId(R.id.edt_username))
                .check(matches(isDisplayed()))
                .perform(typeText("crazydog335"));

        onView(withId(R.id.edt_password))
                .check(matches(isDisplayed()))
                .perform(typeText("venture"));

        onView(withId(R.id.btn_login))
                .check(matches(isDisplayed()))
                .perform(click());
    }
}