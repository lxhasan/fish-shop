package com.example.fishshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Dashboard extends AppCompatActivity {

    private CardView sellRegCV, wholesaler, mohajon, duRehister, cardview1, cardview2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        sellRegCV = findViewById(R.id.sellRegID);
        wholesaler = findViewById(R.id.wholesalerID);
        mohajon = findViewById(R.id.mohajonID);
        duRehister = findViewById(R.id.deuRegisterID);
        cardview1 = findViewById(R.id.cardviw1ID);
        cardview2 = findViewById(R.id.cardview2ID);

        sellRegCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, slider.class));
            }
        });

        wholesaler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Dashboard.this, slider.class);
                startActivity(intent);
                // Toast.makeText(getApplicationContext(),"You ar clicked on sellrehister",Toast.LENGTH_SHORT).show();
            }
        });

        mohajon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, slider.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "You ar clicked on sellrehister", Toast.LENGTH_SHORT).show();
            }
        });

        duRehister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, slider.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "You ar clicked on sellrehister", Toast.LENGTH_SHORT).show();
            }
        });

        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, slider.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "You ar clicked on sellrehister", Toast.LENGTH_SHORT).show();
            }
        });

        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, slider.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "You ar clicked on sellrehister", Toast.LENGTH_SHORT).show();
            }
        });
    }
}