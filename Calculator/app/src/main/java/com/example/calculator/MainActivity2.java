package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn00;
    Button clear,modulo,delete,div,mul,sub,add,dot,ans;
    float res1,res2;
    boolean ADD,SUB,MUL,DIV,MOD;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.editText);

        ans = findViewById(R.id.ans);
        btn00 = findViewById(R.id.btn00);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        clear = findViewById(R.id.clear);
        modulo = findViewById(R.id.modulo);
        delete = findViewById(R.id.delete);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        sub = findViewById(R.id.sub);
        add = findViewById(R.id.add);
        dot = findViewById(R.id.dot);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"0");
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"00");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    res1 = Float.parseFloat(editText.getText()+"");
                    ADD = true;
                    editText.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    res1 = Float.parseFloat(editText.getText()+"");
                    SUB = true;
                    editText.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    res1 = Float.parseFloat(editText.getText()+"");
                    MUL = true;
                    editText.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    res1 = Float.parseFloat(editText.getText()+"");
                    DIV = true;
                    editText.setText(null);
                }
            }
        });
        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    res1 = Float.parseFloat(editText.getText()+"");
                    MOD = true;
                    editText.setText(null);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText());
            }
        });

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2 = Float.parseFloat(editText.getText()+"");
                if(ADD==true){
                    editText.setText(res1+res2+"");
                    ADD=false;
                }
                if(SUB==true){
                    editText.setText(res1-res2+"");
                    SUB=false;
                }
                if(MUL==true){
                    editText.setText(res1*res2+"");
                    MUL=false;
                }
                if(DIV==true){
                    editText.setText(res1/res2+"");
                    DIV=false;
                }
                if(MOD=true){
                    editText.setText(res1%res2+"");
                    MOD=false;
                }

            }
        });
    }
}