package com.example.foodsie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
EditText e1;
Button br;
    EditText t1 , t2 , t3 , t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t2=(EditText)findViewById(R.id.tt2);
        t1=(EditText)findViewById(R.id.tt1);
        t3=(EditText)findViewById(R.id.tt3);
        t4=(EditText)findViewById(R.id.tt4);
        br=(Button)findViewById(R.id.Add);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                Toast.makeText(MainActivity3.this, "we will arrive in a few minutes", Toast.LENGTH_SHORT).show();
            }
        });

} }