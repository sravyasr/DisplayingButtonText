package com.example.sri.assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bt1 = findViewById(R.id.one);
        bt2 = findViewById(R.id.two);
        bt3 = findViewById(R.id.three);
        bt4 = findViewById(R.id.four);
        bt5 = findViewById(R.id.five);
        bt6 = findViewById(R.id.six);
        bt7 = findViewById(R.id.seven);
        bt8 = findViewById(R.id.eight);
        bt9 = findViewById(R.id.nine);
        bt10 = findViewById(R.id.ten);

    }

    public void cheese(View view) {
        Intent i = new Intent(this, MainActivity.class);
        String s = bt1.getText().toString();
        i.putExtra("key", s);
        startActivity(i);

    }

    public void chocolates(View view) {
        Intent i = new Intent(this, MainActivity.class);
        String s1 = bt2.getText().toString();
        i.putExtra("choco", s1);
        startActivity(i);
    }

    public void butter(View view) {
        Intent i = new Intent(this, MainActivity.class);
        String s2 = bt3.getText().toString();
        i.putExtra("butt", s2);
        startActivity(i);

    }

    public void rice(View view) {
        Intent i = new Intent(this, MainActivity.class);
        String s3 = bt4.getText().toString();
        i.putExtra("ric", s3);
        startActivity(i);

    }

    public void apples(View view) {
        Intent i = new Intent(this, MainActivity.class);

        String s4 = bt5.getText().toString();
        i.putExtra("app", s4);
        startActivity(i);
    }

    public void grapes(View view) {
        Intent i = new Intent(this, MainActivity.class);
        String s5 = bt6.getText().toString();
        i.putExtra("grapes", s5);
        startActivity(i);

    }

    public void icecreams(View view) {
        Intent i = new Intent(this, MainActivity.class);
        String s6 = bt7.getText().toString();
        i.putExtra("ice", s6);
        startActivity(i);
    }

    public void lollipops(View view) {
        Intent i = new Intent(this, MainActivity.class);
        String s7 = bt8.getText().toString();
        i.putExtra("lolli", s7);
        startActivity(i);

    }

    public void chips(View view) {

        Intent i = new Intent(this, MainActivity.class);
        String s8 = bt9.getText().toString();
        i.putExtra("chip", s8);
        startActivity(i);
    }

    public void kurkure(View view) {
        Intent i = new Intent(this, MainActivity.class);
        String s9 = bt10.getText().toString();
        i.putExtra("kurkure", s9);
        startActivity(i);
    }
}
