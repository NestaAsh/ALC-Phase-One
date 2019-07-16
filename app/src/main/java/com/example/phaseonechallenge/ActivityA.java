package com.example.phaseonechallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {
Button alc_btn,profile_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        //bind button views
       alc_btn=findViewById(R.id.alc_btn);
       profile_btn=findViewById(R.id.profile_btn);

        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoToActivityC = new Intent(ActivityA.this,ActivityC.class);
                startActivity(intentGoToActivityC);
            }
        });
        Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("ALC4 Phase 1");
        setSupportActionBar(toolbar);

        alc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToGoToActivityB = new Intent(ActivityA.this,ActivityB.class);
                startActivity(intentToGoToActivityB);

            }
        });
    }

//    public void  SayHi(View view){
//        //when button is clicked say Hiiiiiii
//        Toast.makeText(ActivityA.this,"SayHiiiiiiiiiiiii",Toast.LENGTH_SHORT).show();
//    }

}
