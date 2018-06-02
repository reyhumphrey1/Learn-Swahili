package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //declare an array called words, to store 10 string elements
        String[] words = new String[10];

        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.v("Numbers Activity", "Word at index 0: " + words[0]);
        Log.v("Numbers Activity", "Word at index two" + words[1]);
        Log.v("Numbers Activity", "Word at index three" + words[2]);
        Log.v("Numbers Activity", "Word at index four" + words[3]);
        Log.v("Numbers Activity", "Word at index five" + words[4]);
        Log.v("Numbers Activity", "Word at index six" + words[5]);
        Log.v("Numbers Activity", "Word at index seven" + words[6]);
        Log.v("Numbers Activity", "Word at index eight" + words[7]);
        Log.v("Numbers Activity", "Word at index nine" + words[8]);
        Log.v("Numbers Activity", "Word at index ten" + words[9]);
    }
}
