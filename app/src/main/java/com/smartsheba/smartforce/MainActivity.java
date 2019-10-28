package com.smartsheba.smartforce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnContact;

    private CardView cvDress, cvMedical, cvVehicle, cvElectronics, cvHotel, cvOthers;
    private CardView cvGovOrg, cvFemaleGuard, cvCorporateOrg, cvMedicalSector, cvHouseGuard, cvBanks;

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

        cvGovOrg = findViewById(R.id.cvGovOrg);
        cvFemaleGuard = findViewById(R.id.cvFemaleGuard);
        cvCorporateOrg = findViewById(R.id.cvCorporateOrg);
        cvMedicalSector = findViewById(R.id.cvMedicalSector);
        cvHouseGuard = findViewById(R.id.cvHouseGuard);
        cvBanks = findViewById(R.id.cvBanks);

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

        cvGovOrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ServiceGovernmentOrgActivity.class);
                startActivity(intent);
            }
        });

        cvFemaleGuard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ServiceFemaleGuardActivity.class);
                startActivity(intent);
            }
        });
        cvCorporateOrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ServiceCorporateOrganizationActivity.class);
                startActivity(intent);
            }
        });
        cvMedicalSector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ServiceMedicalSectorActivity.class);
                startActivity(intent);
            }
        });
        cvHouseGuard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ServiceHouseGuardActivity.class);
                startActivity(intent);
            }
        });
        cvBanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ServiceBanksActivity.class);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.actionContact) {
            startActivity(new Intent(getApplicationContext(), ContactActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
