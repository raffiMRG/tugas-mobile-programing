package com.example.projectawal_mraffigumilang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        Button btnLayout = (Button) findViewById(R.id.btnTabLayout);

        // Menggunakan Toolbar sebagai AppBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Mengubah title di Toolbar
        getSupportActionBar().setTitle("06TPLP019 M Raffi Gumilang");


        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hubungkankelayout = new Intent(getApplicationContext(), TabLayout.class);
                startActivity(hubungkankelayout);
            }
        });

    }
}