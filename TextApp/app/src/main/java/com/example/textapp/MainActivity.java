package com.example.textapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button activity1;
    private Button activity2,activity3,activity4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity1 = findViewById(R.id.Activity1);
        activity2 = findViewById(R.id.Activity2);
        activity3 = findViewById(R.id.Activity3);
        activity4 = findViewById(R.id.Activity4);

        activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Activity2.class);
                startActivity(i);
                finish();
            }
        });
        activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        });
        activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i);
                finish();
            }
        });
        activity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        Toast.makeText(this,item.getTitle() + "Selected", Toast.LENGTH_SHORT);
        switch (item.getItemId()){
            case R.id.home_item:
                return true;
            case R.id.help_item:
                return true;
            case R.id.call_item:
                return true;
            case R.id.email_item:
                return true;
            case R.id.web_item:
                return true;
            case R.id.exit_item:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}