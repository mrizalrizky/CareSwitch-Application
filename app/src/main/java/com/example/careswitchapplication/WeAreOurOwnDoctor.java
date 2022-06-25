package com.example.careswitchapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeAreOurOwnDoctor extends AppCompatActivity {

    private Button haveacc_login;
    private Button btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we_are_our_own_doctor);

        btn_signup = (Button) findViewById(R.id.btn_signup);
        haveacc_login = (Button) findViewById(R.id.haveacc_login);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterScren();
            }
        });

        haveacc_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginScreen();
            }
        });
    }

    public void openRegisterScren() {
        Intent intent = new Intent(this, SignUpScreen.class);
        startActivity(intent);
    }

    public void openLoginScreen() {
        Intent intent = new Intent(this, LoginScreen.class);
        startActivity(intent);
    }
}