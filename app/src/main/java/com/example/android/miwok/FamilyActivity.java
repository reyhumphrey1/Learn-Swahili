package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father", "Baba", R.drawable.family_father));
        words.add(new Word("Mother", "Mama", R.drawable.family_mother));
        words.add(new Word("Son", "Mwana", R.drawable.family_son));
        words.add(new Word("Daughter", "Binti", R.drawable.family_daughter));
        words.add(new Word("Older Brother", "Ndugu Mkubwa", R.drawable.family_older_brother));
        words.add(new Word("Older Sister", "Dada Mkubwa", R.drawable.family_older_sister));
        words.add(new Word("Younger Brother", "Nugu Mdogo", R.drawable.family_younger_brother));
        words.add(new Word("Younger Sister", "Dada Mdogo", R.drawable.family_younger_sister));
        words.add(new Word("GrandFather", "Babu", R.drawable.family_grandfather));
        words.add(new Word("GrandMother", "Nyanya", R.drawable.family_grandmother));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
