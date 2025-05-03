package com.example.projectawal_mraffigumilang;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.statusBarColor));
        }


//        ==============================================

        // Menggunakan Toolbar sebagai AppBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Mengubah title di Toolbar
        getSupportActionBar().setTitle("06TPLP019 M Raffi Gumilang");
//        ===============================================

        EditText usename = (EditText) findViewById(R.id.inputUser);
        EditText password = (EditText) findViewById(R.id.inputPassword);
        Button btnLogin = (Button) findViewById(R.id.btnsubmit);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (
                        usename.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")
                ){
//                    btnLogin.setBackgroundColor(Color.BLUE);
                    Intent hubungkankedashboard = new Intent(getApplicationContext(), Dashboard.class);
                    startActivity(hubungkankedashboard);
                } else {
                    btnLogin.setBackgroundColor(Color.RED);

                }
            }
        });


    }
}















