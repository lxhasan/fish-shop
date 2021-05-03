package com.example.fishshop;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class slider extends AppCompatActivity {

   // private ViewPager2 viewPager2;
    private Handler sliderhandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

       // viewPager2 = findViewById(R.id.viewpagersliderID);


    }
}