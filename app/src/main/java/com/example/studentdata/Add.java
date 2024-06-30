package com.example.studentdata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Add extends AppCompatActivity {
    AppCompatButton b1,b2;
    EditText d1,d2,d3,d4,d5,d6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        d1=(EditText) findViewById(R.id.ed1);
        d2=(EditText) findViewById(R.id.ed2);
        d3=(EditText) findViewById(R.id.ed3);
        d4=(EditText) findViewById(R.id.ed4);
        d5=(EditText) findViewById(R.id.ed5);
        d6=(EditText) findViewById(R.id.ed6);
        b1=(AppCompatButton) findViewById(R.id.bt1);
        b2=(AppCompatButton) findViewById((R.id.bt2));

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2,s3,s4,s5,s6;
                s1=d1.getText().toString();
                s2=d2.getText().toString();
                s3=d3.getText().toString();
                s4=d4.getText().toString();
                s5=d5.getText().toString();
                s6=d6.getText().toString();
                Toast.makeText(getApplicationContext(),s1+s2+s3+s4+s5+s6+ " ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}