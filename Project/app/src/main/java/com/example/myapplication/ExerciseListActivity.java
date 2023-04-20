package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

public class ExerciseListActivity extends AppCompatActivity {
    ListView listView;
    String[] exerciseNames;
    String[] exerciseDescriptions;
    String[] exerciseWeights;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);

        Resources res = getResources();
        listView = (ListView) findViewById(R.id.exerciseView);
        exerciseNames = res.getStringArray(R.array.exercises);
        exerciseDescriptions = res.getStringArray(R.array.descriptions);
        exerciseWeights = res.getStringArray(R.array.weights);

        ItemAdapter itemAdapter = new ItemAdapter(this, exerciseNames, exerciseDescriptions, exerciseWeights);
        listView.setAdapter(itemAdapter);


    }
}