package com.example.rkuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContactUs extends AppCompatActivity {
    private ImageButton imgbt1;
    private ImageButton imgbt2;
    private ImageButton imgbt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        imgbt1 = findViewById(R.id.imgbt1);
        imgbt2 = findViewById(R.id.imgbt2);
        imgbt3 = findViewById(R.id.imgbt3);

        imgbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:+918238139499"));
                startActivity(i);
            }
        });
        imgbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://rku.ac.in/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        imgbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Intent.ACTION_SEND);
                e.setData(Uri.parse("mailto:psagpariya148@rku.ac.in"));
                e.setType("plain/text");
                startActivity(e);
            }
        });

    }


}