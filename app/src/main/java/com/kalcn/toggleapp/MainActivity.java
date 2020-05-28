package com.kalcn.toggleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    ToggleButton toggleButton;
    ImageView img_bulb_on,img_bulb_off;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_bulb_on=findViewById(R.id.img_bulb_on);
        img_bulb_off=findViewById(R.id.img_bulb_off);
        constraintLayout=findViewById(R.id.layout);
        toggleButton=findViewById(R.id.toggleButton);

        constraintLayout.setBackgroundColor(Color.parseColor("Yellow"));
        toggleButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean b) {
        if (b){
            constraintLayout.setBackgroundColor(Color.parseColor("#000000"));
            img_bulb_on.setVisibility(View.INVISIBLE);
            img_bulb_off.setVisibility(View.VISIBLE);
        }
        else{
            constraintLayout.setBackgroundColor(Color.parseColor("Yellow"));
            img_bulb_on.setVisibility(View.VISIBLE);
            img_bulb_off.setVisibility(View.INVISIBLE);
        }
    }
}
//U1065111 蔡旻錡