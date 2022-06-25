package com.example.careswitchapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeelingSick extends AppCompatActivity {
    private Button btn_next;
    private Button btn_skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling_sick);

        btn_next = (Button) findViewById(R.id.btn_next);
        btn_skip = (Button) findViewById(R.id.btn_skip);

        btn_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGetStartedMenu();
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeAreOurOwnDoctorMenu();
            }
        });
    }

    public void openGetStartedMenu() {
        Intent intent = new Intent(this, GetStarted.class);
        startActivity(intent);
    }

    public void openWeAreOurOwnDoctorMenu() {
        Intent intent = new Intent(this, WeAreOurOwnDoctor.class);
        startActivity(intent);
    }
}