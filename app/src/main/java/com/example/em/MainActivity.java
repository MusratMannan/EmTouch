package com.example.em;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button fir,hos,pol,stu,sef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fir = (Button) findViewById(R.id.fir);
        fir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this,firelist.class);
                startActivity(m);
            }
        });

        hos =(Button) findViewById(R.id.hos);
        hos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(MainActivity.this,hosplist.class);
                startActivity(n);
            }
        });

        pol =(Button) findViewById(R.id.pol);
        pol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(MainActivity.this,pollist.class);
                startActivity(o);
            }
        });

        stu =(Button) findViewById(R.id.stu);
        stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(MainActivity.this,studylist.class);
                startActivity(o);
            }
        });


        sef =(Button) findViewById(R.id.sef);
        sef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(MainActivity.this,sefety.class);
                startActivity(o);
            }
        });


    }
}
