package com.tests;
import android.test.ActivityInstrumentationTestCase2;
import com.example.user.lab3.MainActivity;
import com.example.user.lab3.R;
import android.widget.TextView;


/**
 * Created by user on 4/18/16.
 */

public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }
    public void test_first()
    {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.textView);
        String tester = textView.getText().toString();


        assertEquals("100", tester);
    }
}
