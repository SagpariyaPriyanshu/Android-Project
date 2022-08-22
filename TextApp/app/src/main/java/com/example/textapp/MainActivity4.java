package com.example.textapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    public RadioButton male,female;
    public CheckBox checkBox;
    public Switch branch;
    public Spinner spinner;
    public EditText fname,lname,email,password;
    public Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        checkBox = findViewById(R.id.checkBox);
        branch = findViewById(R.id.branch);
        spinner = findViewById(R.id.spinner);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4.this,MainActivity4_1.class);
                i.putExtra("fname",fname.getText().toString());
                i.putExtra("lname",lname.getText().toString());
                i.putExtra("email",email.getText().toString());
                i.putExtra("password",password.getText().toString());
                
                startActivity(i);
                finish();
            }
        });
    }
}