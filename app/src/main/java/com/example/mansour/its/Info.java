package com.example.mansour.its;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info extends AppCompatActivity {
    public Button but1;
    public void init () {
        but1 = (Button) findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Info.this, Addresses.class);
                startActivity(toy);
            }
        });
    }

    public Button results;
    public void res () {
        results = (Button) findViewById(R.id.results);
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Info.this, Map.class);
                startActivity(toy);
            }
        });
    }

    public Button but2;
    public void init2 () {
        but2 = (Button) findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent(Info.this, Addresses.class);
                startActivity(play);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        init();
        init2();
        res();
    }
}
