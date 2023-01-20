package com.example.foodsie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ChoixActivity extends AppCompatActivity {
    Button bb1 , bb2;
    TextView tt1;
    EditText t1 , t2 ,t3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choix);
        t1= (EditText)findViewById(R.id.Phone) ;
        t2= (EditText)findViewById(R.id.adr) ;
        t3= (EditText)findViewById(R.id.pos) ;
        bb1= (Button) findViewById(R.id.b1);
        bb2=(Button)findViewById(R.id.div);
        String a=t1.getText().toString();
        String b = t2.getText().toString();
        String c = t3.getText().toString();
        if (a=="" && b=="" && c=="") {
            bb1.setEnabled(false);
            bb2.setEnabled(false);
        }
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(ChoixActivity.this,Pay.class);

                startActivity(i1);
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChoixActivity.this, "well received", Toast.LENGTH_SHORT).show();
            }
        });
    }
}