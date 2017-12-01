package com.example.mansour.its;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Info extends AppCompatActivity {


    // declare info variables as integer

    public int numberofpeople;      // 1=1; 2=2; 3=3; 4=4
    public int meanoftravel;        // 1=car; 2=bike; 3=public
    public int meetingplace;        // 1=cafe; 2=bar; 3=restaurant; 4=park, 5=theatre; 6=museum
    public int desiredoutput;       // 1=fast/time; 2=schort/distance


    // Reading RadioButtons
    @SuppressLint("ShowToast")
    protected void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // numberofpeople

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    //operation if 1 people
                    numberofpeople = 1;
                Toast.makeText(Info.this, "Selected No. of People: " + numberofpeople, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                if (checked)
                    //operation if 2 people
                    numberofpeople = 2;
                Toast.makeText(Info.this, "Selected No. of People: " + numberofpeople, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton3:
                if (checked)
                    //operation if 3 people
                    numberofpeople = 3;
                Toast.makeText(Info.this, "Selected No. of People: " + numberofpeople, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton4:
                if (checked)
                    //operation if 4 people
                    numberofpeople = 4;
                Toast.makeText(Info.this, "Selected No. of People: " + numberofpeople, Toast.LENGTH_SHORT).show();
                break;
        }

        // meanoftravel

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonCar:
                if (checked)
                    //operation if car
                    meanoftravel = 1;
                Toast.makeText(Info.this, "Selected Mean of Travel: " + meanoftravel, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonBike:
                if (checked)
                    //operation if bike
                    meanoftravel = 2;
                Toast.makeText(Info.this, "Selected Mean of Travel: " + meanoftravel, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonPublic:
                if (checked)
                    //operation if public
                    meanoftravel = 3;
                Toast.makeText(Info.this, "Selected Mean of Travel: " + meanoftravel, Toast.LENGTH_SHORT).show();
                break;

        }

        // meetingplace

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonCafe:
                if (checked)
                    //operation if car
                    meetingplace = 1;
                Toast.makeText(Info.this, "Selected Meeting Place: " + meetingplace, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonBar:
                if (checked)
                    //operation if bike
                    meetingplace = 2;
                Toast.makeText(Info.this, "Selected Meeting Place: " + meetingplace, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonRestaurant:
                if (checked)
                    //operation if public
                    meetingplace = 3;
                Toast.makeText(Info.this, "Selected Meeting Place: " + meetingplace, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonPark:
                if (checked)
                    //operation if car
                    meetingplace = 4;
                Toast.makeText(Info.this, "Selected Meeting Place: " + meetingplace, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonTheatre:
                if (checked)
                    //operation if bike
                    meetingplace = 5;
                Toast.makeText(Info.this, "Selected Meeting Place: " + meetingplace, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonMuseum:
                if (checked)
                    //operation if public
                    meetingplace = 6;
                Toast.makeText(Info.this, "Selected Meeting Place: " + meetingplace, Toast.LENGTH_SHORT).show();
                break;

        }


        // desiredoutput

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonFastest:
                if (checked)
                    //operation if car
                    desiredoutput = 1;
                Toast.makeText(Info.this, "Selected Output: " + desiredoutput, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButtonShortest:
                if (checked)
                    //operation if bike
                    desiredoutput = 2;
                Toast.makeText(Info.this, "Selected Output: " + desiredoutput, Toast.LENGTH_SHORT).show();
                break;

        }

    }




    // top bar

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

    // button to go to addresses
    public Button but2;
    public void init2 () {
        but2 = (Button) findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to pass necessary data
                Intent i = new Intent(Info.this, Addresses.class);
                i.putExtra("numberofpeople", numberofpeople);
                i.putExtra("meanoftravel", meanoftravel);
                i.putExtra("meetingplace", meetingplace);
                i.putExtra("desiredoutput", desiredoutput);
                startActivity(i);
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

