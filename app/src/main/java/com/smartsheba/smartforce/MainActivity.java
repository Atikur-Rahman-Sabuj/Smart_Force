package com.smartsheba.smartforce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnContact;

    private CardView cvDress, cvMedical, cvVehicle, cvElectronics, cvHotel, cvOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContact = (Button) findViewById(R.id.contactbtn);

        cvDress = findViewById(R.id.cvDress);
        cvMedical = findViewById(R.id.cvMedical);
        cvVehicle = findViewById(R.id.cvVehicle);
        cvElectronics = findViewById(R.id.cvElectronics);
        cvHotel = findViewById(R.id.cvHotel);
        cvOthers = findViewById(R.id.cvOthers);

        cvDress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OfferDressActivity.class);
                startActivity(intent);
            }
        });
        cvMedical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OfferMedicalActivity.class);
                startActivity(intent);
            }
        });
        cvVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OfferVehicleActivity.class);
                startActivity(intent);
            }
        });
        cvElectronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OfferElectronicsActivity.class);
                startActivity(intent);
            }
        });
        cvHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OfferHotelActivity.class);
                startActivity(intent);
            }
        });
        cvOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OfferOtherActivity.class);
                startActivity(intent);
            }
        });








        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ContactActivity.class));
            }
        });
    }
}
