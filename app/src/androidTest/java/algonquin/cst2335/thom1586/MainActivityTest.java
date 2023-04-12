//package algonquin.cst2335.thom1586;
//
//
//import static androidx.test.espresso.Espresso.onView;
//import static androidx.test.espresso.action.ViewActions.click;
//import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
//import static androidx.test.espresso.action.ViewActions.replaceText;
//import static androidx.test.espresso.assertion.ViewAssertions.matches;
//import static androidx.test.espresso.matcher.ViewMatchers.withId;
//import static androidx.test.espresso.matcher.ViewMatchers.withText;
//
//import androidx.test.espresso.ViewInteraction;
//import androidx.test.ext.junit.rules.ActivityScenarioRule;
//import androidx.test.ext.junit.runners.AndroidJUnit4;
//import androidx.test.filters.LargeTest;
//
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//@LargeTest
//@RunWith(AndroidJUnit4.class)
//public class MainActivityTest {
//
//    @Rule
//    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
//            new ActivityScenarioRule<>(MainActivity.class);
//
//    @Test
//    /**
//     * MainActivityTest test the password with 12345
//     */
//    public void mainActivityTest() {
//
//        ViewInteraction appCompatEditText2 = onView(withId(R.id.editTextTextPassword));
//        appCompatEditText2.perform(replaceText("12345"), closeSoftKeyboard());
//
//        ViewInteraction materialButton = onView(withId(R.id.button));
//        materialButton.perform(click());
//
//        ViewInteraction textView = onView(withId(R.id.HelloWorld));
//        textView.check(matches(withText("You shall not pass!")));
//    }
//
//    /**
//     * Testing function for Finding Missing Upper case
//     */
//    @Test
//    public void testFindMissingUpperCase(){
//        ViewInteraction appCompactEditText = onView(withId(R.id.editTextTextPassword));
//        appCompactEditText.perform(replaceText("password123#$*"));
//
//        ViewInteraction materialButton = onView(withId(R.id.button));
//        materialButton.perform(click());
//
//        ViewInteraction textView = onView(withId(R.id.HelloWorld));
//        textView.check(matches(withText("You shall not pass!")));
//    }
//
//
//    /**
//     * Testing function for Finding Missing Lower case
//     */
//    @Test
//    public void testFindMissingLowerCase(){
//        ViewInteraction appCompactEditText = onView(withId(R.id.editTextTextPassword));
//        appCompactEditText.perform(replaceText("PASSWORD123#$*"));
//
//        ViewInteraction materialButton = onView(withId(R.id.button));
//        materialButton.perform(click());
//
//        ViewInteraction textView = onView(withId(R.id.HelloWorld));
//        textView.check(matches(withText("You shall not pass!")));
//    }
//
//    /**
//     * Testing function for Finding Missing Special Character
//     */
//    @Test
//    public void testFindMissingSpecialCharacter(){
//        ViewInteraction appCompactEditText = onView(withId(R.id.editTextTextPassword));
//        appCompactEditText.perform(replaceText("Password123"));
//
//        ViewInteraction materialButton = onView(withId(R.id.button));
//        materialButton.perform(click());
//
//        ViewInteraction textView = onView(withId(R.id.HelloWorld));
//        textView.check(matches(withText("You shall not pass!")));
//    }
//
//    /**
//     * Testing function for Finding Missing Digit
//     */
//    @Test
//    public void testFindMissingDigit(){
//        ViewInteraction appCompactEditText = onView(withId(R.id.editTextTextPassword));
//        appCompactEditText.perform(replaceText("Password@"));
//
//        ViewInteraction materialButton = onView(withId(R.id.button));
//        materialButton.perform(click());
//
//        ViewInteraction textView = onView(withId(R.id.HelloWorld));
//        textView.check(matches(withText("You shall not pass!")));
//    }
//
//    /**
//     * Testing function for Finding Missing Upper case
//     */
//    @Test
//    public void testPasswordIsComplexEnough(){
//        ViewInteraction appCompactEditText = onView(withId(R.id.editTextTextPassword));
//        appCompactEditText.perform(replaceText("Password123#$*"));
//
//        ViewInteraction materialButton = onView(withId(R.id.button));
//        materialButton.perform(click());
//
//        ViewInteraction textView = onView(withId(R.id.HelloWorld));
//        textView.check(matches(withText("Your password meets the requirement")));
//    }
//
//}
