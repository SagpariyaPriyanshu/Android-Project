package com.example.textapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4_1 extends AppCompatActivity {

    private TextView showdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main41);

        showdata = findViewById(R.id.fname);
        showdata.setText(String.format("First Name:- %s", getIntent().getStringExtra("fname")));
        showdata  = findViewById(R.id.lanme);
        showdata.setText(String.format("Last name:- %s", getIntent().getStringExtra("lname")));
        showdata = findViewById(R.id.email);
        showdata.setText(String.format("Email:- %s", getIntent().getStringExtra("email")));
        showdata = findViewById(R.id.password);
        showdata.setText(String.format("Password:- %s",getIntent().getStringExtra("password")));

    }
}