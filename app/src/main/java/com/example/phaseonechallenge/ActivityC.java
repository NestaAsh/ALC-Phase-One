package com.example.phaseonechallenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class ActivityC extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        //geting actionbar by it view id
        toolbar=findViewById(R.id.TBar);
        toolbar.setTitle("My profile");

        //converting toolbar to actionbar
        setSupportActionBar(toolbar);

        //enabling upButton
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }


}

