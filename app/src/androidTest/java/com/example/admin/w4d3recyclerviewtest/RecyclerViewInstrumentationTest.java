package com.example.admin.w4d3recyclerviewtest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 * Created by admin on 11/9/2016.
 */

@RunWith(AndroidJUnit4.class)
public class RecyclerViewInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkRecycler(){
        onView(allOf(withId(R.id.r_item_text),withText("Beto"))).perform(click());

        onView(withId(R.id.secondTxt))
                .check(matches(withText("Beto")));
    }

}
