package com.example.em;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class studylist extends AppCompatActivity {

    private Button school,versity,college;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studylist);


        school = (Button) findViewById(R.id.school);
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(studylist.this,schoollist.class);
                startActivity(c);
            }
        });

        versity = (Button) findViewById(R.id.versity);
        versity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(studylist.this,versitylist.class);
                startActivity(v);
            }
        });


        college = (Button) findViewById(R.id.college);
        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(studylist.this,collegelist.class);
                startActivity(v);
            }
        });

    }
}
