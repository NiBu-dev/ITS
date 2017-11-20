package com.example.mansour.its;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Addresses extends AppCompatActivity {
    public Button results;
    public void init () {
        results = (Button) findViewById(R.id.results);
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Addresses.this, Map.class);
                startActivity(toy);
            }
        });
    }
    public Button finish;
    public void fin () {
        finish = (Button) findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent se = new Intent(Addresses.this, Map.class);
                startActivity(se);
            }
        });
    }
    public Button basics;
    public void sec () {
        basics = (Button) findViewById(R.id.basics);
        basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent(Addresses.this, Info.class);
                startActivity(play);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);
        init();
        sec();
        fin();
    }
}
