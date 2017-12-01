package com.example.mansour.its;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Addresses extends AppCompatActivity {

    public Integer numberofpeople;
    public Integer meanoftravel;
    public Integer meetingplace;
    public Integer desiredoutput;

    public Button buttonshow;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);

        init();
        sec();
        fin();

        Intent i = getIntent();

        // "final" declaration is just necessary for testbutton, shall be removed when buttonshow is removed too !

        final Integer numberofpeople    = i.getIntExtra("numberofpeople", 0);
        final Integer meanoftravel      = i.getIntExtra("meanoftravel", 0);
        final Integer meetingplace      = i.getIntExtra("meetingplace", 0);
        final Integer desiredoutput     = i.getIntExtra("desiredoutput", 0);


        buttonshow = (Button)findViewById(R.id.buttonshow);
        buttonshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Addresses.this, "No. of People: " + numberofpeople + " / Mean of Travel: " + meanoftravel + " / Meeting Place: " + meetingplace + " / Output: " + desiredoutput, Toast.LENGTH_LONG).show();
            }
        });
    }



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

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);
        init();
        sec();
        fin();
    }*/
}
