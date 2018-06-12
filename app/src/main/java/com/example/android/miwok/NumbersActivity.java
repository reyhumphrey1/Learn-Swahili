package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //declare an array called words, to store 10 string elements
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One","Moja", R.drawable.number_one));
        words.add(new Word("Two","Mbili", R.drawable.number_two));
        words.add(new Word("Three","Tatu", R.drawable.number_three));
        words.add(new Word("Four","Nne", R.drawable.number_four));
        words.add(new Word("Five","Tano", R.drawable.number_five));
        words.add(new Word("Six","Sita", R.drawable.number_six));
        words.add(new Word("Seven","Saba", R.drawable.number_seven));
        words.add(new Word("Eight","Nane", R.drawable.number_eight));
        words.add(new Word("Nine","Tisa", R.drawable.number_nine));
        words.add(new Word("Ten","Kumi", R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
