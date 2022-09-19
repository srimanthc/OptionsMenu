package com.example.optionsmenuexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ClassesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}