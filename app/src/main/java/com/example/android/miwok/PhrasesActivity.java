package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Good Morning?", "Habari ya asubuhi"));
        words.add(new Word("What is your name?", "Jina lako ni?"));
        words.add(new Word("I am happy to see you", "Nimefurahi kukuona"));
        words.add(new Word("Where are you going?", "Je, unaenda wapi?"));
        words.add(new Word("I have cooked a delicious meal for you", "Nimekupikia chakula kitamu mno"));
        words.add(new Word("Tell me when you get home", "Niambie ukifika nyumbani"));
        words.add(new Word("Have a safe journey", "Kuwa na safari njema"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
