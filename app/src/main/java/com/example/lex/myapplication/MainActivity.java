package com.example.lex.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {



    CheckBox checkNose;
    CheckBox checkArms;
    CheckBox checkEyes;
    CheckBox checkEars;
    CheckBox checkEyebrows;
    CheckBox checkGlasses;
    CheckBox checkHat;
    CheckBox checkMouth;
    CheckBox checkShoes;
    CheckBox checkMustache;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkNose = (CheckBox) findViewById(R.id.checkNose);
        ImageView imageNose = (ImageView) findViewById(R.id.imageNose);
        checkNose.setOnClickListener(new MyListener(checkNose, imageNose));


        checkArms = (CheckBox) findViewById(R.id.checkArms);
        ImageView imageArms = (ImageView) findViewById(R.id.imageArms);
        checkArms.setOnClickListener(new MyListener(checkArms, imageArms));


        checkEyes = (CheckBox) findViewById(R.id.checkEyes);
        ImageView imageEyes = (ImageView) findViewById(R.id.imageEyes);
        checkEyes.setOnClickListener(new MyListener(checkEyes, imageEyes));

        checkEars = (CheckBox) findViewById(R.id.checkEars);
        ImageView imageEars = (ImageView) findViewById(R.id.imageEars);
        checkEars.setOnClickListener(new MyListener(checkEars, imageEars));

        checkEyebrows = (CheckBox) findViewById(R.id.checkEyebrows);
        ImageView imageEyebrows = (ImageView) findViewById(R.id.imageEyebrows);
        checkEyebrows.setOnClickListener(new MyListener(checkEyebrows, imageEyebrows));

        checkGlasses = (CheckBox) findViewById(R.id.checkGlasses);
        ImageView imageGlasses = (ImageView) findViewById(R.id.imageGlasses);
        checkGlasses.setOnClickListener(new MyListener(checkGlasses, imageGlasses));

        checkHat = (CheckBox) findViewById(R.id.checkHat);
        ImageView imageHat = (ImageView) findViewById(R.id.imageHat);
        checkHat.setOnClickListener(new MyListener(checkHat, imageHat));

        checkMouth = (CheckBox) findViewById(R.id.checkMouth);
        ImageView imageMouth = (ImageView) findViewById(R.id.imageMouth);
        checkMouth.setOnClickListener(new MyListener(checkMouth, imageMouth));

        checkShoes = (CheckBox) findViewById(R.id.checkShoes);
        ImageView imageShoes = (ImageView) findViewById(R.id.imageShoes);
        checkShoes.setOnClickListener(new MyListener(checkShoes, imageShoes));

        checkMustache = (CheckBox) findViewById(R.id.checkMustache);
        ImageView imageMustache = (ImageView) findViewById(R.id.imageMustache);
        checkMustache.setOnClickListener(new MyListener(checkMustache, imageMustache));


    }

    public class MyListener implements View.OnClickListener {
        CheckBox checker;
        ImageView imager;

        MyListener(CheckBox checker, ImageView imager) {
            super();
            this.checker = checker;
            this.imager = imager;
        }
        @Override
        public void onClick(View v) {
            if (checker.isChecked()) {
                imager.setVisibility(View.VISIBLE);
            }
            else {
                imager.setVisibility(View.INVISIBLE);
            }
        }
    }




}
