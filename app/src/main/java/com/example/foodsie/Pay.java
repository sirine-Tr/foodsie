package com.example.foodsie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pay extends AppCompatActivity {
Button b1;
EditText t1 , t2 , t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        b1=(Button)findViewById(R.id.b1);
        t1=(EditText)findViewById(R.id.car);
        t2=(EditText)findViewById(R.id.pass);
        t3=(EditText)findViewById(R.id.date);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                Toast.makeText(Pay.this, "well received", Toast.LENGTH_SHORT).show();
            }
        });
    }
}