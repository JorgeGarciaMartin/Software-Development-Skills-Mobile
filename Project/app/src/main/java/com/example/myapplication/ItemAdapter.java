package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] exerciseNames;
    String[] exerciseDescriptions;
    String[] exerciseWeights;

    public ItemAdapter(Context context, String[] exerciseNames, String[] exerciseDescriptions, String[] exerciseWeights) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.exerciseNames = exerciseNames;
        this.exerciseDescriptions = exerciseDescriptions;
        this.exerciseWeights = exerciseWeights;
    }

    @Override
    public int getCount() {
        return exerciseNames.length;
    }

    @Override
    public Object getItem(int i) {
        return exerciseNames[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.listview_detail, null);
        TextView exerciseNameTextView = (TextView) v.findViewById(R.id.name);
        TextView exerciseDescriptionTextView = (TextView) v.findViewById(R.id.description);
        TextView exerciseWeightTextView = (TextView) v.findViewById(R.id.weight);

        String exerciseName = exerciseNames[i];
        String exerciseDescription = exerciseDescriptions[i];
        String exerciseWeight = exerciseWeights[i];

        exerciseNameTextView.setText(exerciseName);
        exerciseDescriptionTextView.setText(exerciseDescription);
        exerciseWeightTextView.setText(exerciseWeight);

        return v;
    }

}
