package com.example.mansour.its;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;



public class Map extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap map;
    UiSettings mapSettings;

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
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap map) {
        // DO WHATEVER YOU WANT WITH GOOGLEMAP


        mapSettings.setCompassEnabled(true);

        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        // Add a marker in Sydney and move the camera
        LatLng bud = new LatLng(47.4979, 19.0402);
        map.addMarker(new MarkerOptions().position(bud).title("Marker in Sydney"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(bud, 13.0f));
    }


}
