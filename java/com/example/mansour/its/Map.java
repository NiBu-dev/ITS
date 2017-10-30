package com.example.mansour.its;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.mapquest.mapping.MapQuestAccountManager;
import com.mapquest.mapping.maps.OnMapReadyCallback;
import com.mapquest.mapping.maps.MapboxMap;
import com.mapquest.mapping.maps.MapView;

public class Map extends AppCompatActivity {
    //MapQuest things
    private MapboxMap mMapboxMap;
    private MapView mMapView;
    //MapQuest Things

    public Button basics2;
    public void sec () {
        basics2 = (Button) findViewById(R.id.basics2);
        basics2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent(Map.this, Info.class);
                startActivity(play);
            }
        });
    }

    public Button addresses;
    public void init () {
        addresses = (Button) findViewById(R.id.addresses2);
        addresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Map.this, Addresses.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map2);
        sec();
        init();
    }
}
