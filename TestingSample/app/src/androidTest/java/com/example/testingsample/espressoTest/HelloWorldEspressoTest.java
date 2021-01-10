package com.example.testingsample.espressoTest;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.example.testingsample.R;
import com.example.testingsample.TestActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class HelloWorldEspressoTest {

    @Rule
    public ActivityTestRule<TestActivity> mActivityRule = new ActivityTestRule(TestActivity.class);

    @Test
    public void listGoesOverTheFold() {

        //editText 에 Hello World! 입력하고 키보드를 내립니다.
        Espresso.onView(withId(R.id.editText)).perform(typeText("Hello World!"), closeSoftKeyboard());

        //textView 의 값이 "Hello World!" 인지 확인합니다.
        Espresso.onView(withId(R.id.textView)).check(matches(withText("Hello World!")));

        //button 을 클릭합니다.
        Espresso.onView(withId(R.id.button)).perform(click());
    }
}