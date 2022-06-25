package com.example.careswitchapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DOsPage extends AppCompatActivity {

    FloatingActionButton extendableBtn, homeBtn, featureBtn, resultBtn, profileBtn;
    Animation fabOpen, fabClose, rotateForward, rotateBackward;

    boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos_page);

        extendableBtn = (FloatingActionButton) findViewById(R.id.extendFloatBtn);
        homeBtn = (FloatingActionButton) findViewById(R.id.homeFloatBtn);
        featureBtn = (FloatingActionButton) findViewById(R.id.featuresFloatBtn);
        resultBtn = (FloatingActionButton) findViewById(R.id.resultFloatBtn);
        profileBtn = (FloatingActionButton) findViewById(R.id.profileFloatBtn);

        fabOpen = AnimationUtils.loadAnimation(this, R.anim.fab_open);
        fabClose = AnimationUtils.loadAnimation(this, R.anim.fab_close);

        rotateForward = AnimationUtils.loadAnimation(this, R.anim.rotate_forward);
        rotateBackward = AnimationUtils.loadAnimation(this, R.anim.rotate_backward);

        extendableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
                openHomePage();
            }
        });
        featureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
            }
        });
        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
                openResultPage();
            }
        });
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
            }
        });
    }

    public void openHomePage() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void openResultPage() {
        Intent intent = new Intent(this, ReportPage.class);
        startActivity(intent);
    }

    private void animateFab() {
        if(isOpen) {
            extendableBtn.startAnimation(rotateForward);
            homeBtn.startAnimation(fabClose);
            featureBtn.startAnimation(fabClose);
            resultBtn.startAnimation(fabClose);
            profileBtn.startAnimation(fabClose);
            homeBtn.setClickable(false);
            featureBtn.setClickable(false);
            resultBtn.setClickable(false);
            profileBtn.setClickable(false);
            isOpen=false;
        }
        else {
            extendableBtn.startAnimation(rotateBackward);
            homeBtn.startAnimation(fabOpen);
            featureBtn.startAnimation(fabOpen);
            resultBtn.startAnimation(fabOpen);
            profileBtn.startAnimation(fabOpen);
            homeBtn.setClickable(true);
            featureBtn.setClickable(true);
            resultBtn.setClickable(true);
            profileBtn.setClickable(true);
            isOpen=true;
        }
    }

}