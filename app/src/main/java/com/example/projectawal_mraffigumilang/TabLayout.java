package com.example.projectawal_mraffigumilang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TabLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tab_layout);

        ImageView gitub, lindin;

        Button tab1, tab2;

//        LinearLayout view1, view2;
        ConstraintLayout view1, view2;
//        LinearLayout view2;

        tab1 = findViewById(R.id.btnTab1);
        tab2 = findViewById(R.id.btnTab2);
        view1 = findViewById(R.id.tab1);
        view2 = findViewById(R.id.tab2);
        gitub = findViewById(R.id.gitIcon);
        lindin = findViewById(R.id.linkdinIcon);

        // Menggunakan Toolbar sebagai AppBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Mengubah title di Toolbar
        getSupportActionBar().setTitle("06TPLP019 M Raffi Gumilang");

        tab1.setOnClickListener(v -> {
            view1.setVisibility(View.VISIBLE);
            view2.setVisibility(View.GONE);
        });

        tab2.setOnClickListener(v -> {
            view1.setVisibility(View.GONE);
            view2.setVisibility(View.VISIBLE);
        });


        gitub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/raffiMRG"));
                startActivity(intent);
            }
        });

        lindin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://id.linkedin.com/in/raffimrg"));
                startActivity(intent);
            }
        });

    }
}