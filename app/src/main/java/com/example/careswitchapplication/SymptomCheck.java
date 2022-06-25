package com.example.careswitchapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SymptomCheck extends AppCompatActivity {

    Button showAllBtn, hospitalBtn, checkUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom_check);

        checkUpBtn = (Button) findViewById(R.id.quickCheckUpBtn);
        showAllBtn = (Button) findViewById(R.id.showAllBtn);
        hospitalBtn = (Button) findViewById(R.id.hospitalBtn);

        checkUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCameraPage();
            }
        });

        showAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomePage();
            }
        });

        hospitalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHospitalPage();
            }
        });

    }

    public void openHomePage() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void openHospitalPage() {
        Intent intent = new Intent(this, HospitalListPage.class);
        startActivity(intent);
    }

    public void openCameraPage() {
        Intent intent = new Intent(this, CameraPage.class);
        startActivity(intent);
    }
}