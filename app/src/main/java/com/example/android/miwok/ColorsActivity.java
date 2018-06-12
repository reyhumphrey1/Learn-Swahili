package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Black", "Nyeusi", R.drawable.color_black));
        words.add(new Word("Brown", "Kahawia", R.drawable.color_brown));
        words.add(new Word("Dusty Yellow", "Hudhurungi", R.drawable.color_dusty_yellow));
        words.add(new Word("Gray", "Kijivu", R.drawable.color_gray));
        words.add(new Word("Green", "Kijani", R.drawable.color_green));
        words.add(new Word("Mustard Yellow", "Manjano", R.drawable.color_mustard_yellow));
        words.add(new Word("Red", "Nyekundu", R.drawable.color_red));
        words.add(new Word("White", "Nyeupe", R.drawable.color_white));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
