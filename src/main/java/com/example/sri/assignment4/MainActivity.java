package com.example.sri.assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt;
    TextView tv, tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.add);

        tv = findViewById(R.id.Cheese);
        tv1 = findViewById(R.id.Chocolates);
        tv2 = findViewById(R.id.Butter);
        tv3 = findViewById(R.id.Rice);
        tv4 = findViewById(R.id.Apples);
        tv5 = findViewById(R.id.Grapes);
        tv6 = findViewById(R.id.Icecreams);
        tv7 = findViewById(R.id.Lollipops);
        tv8 = findViewById(R.id.Chips);
        tv9 = findViewById(R.id.Kurkure);


        String s = getIntent().getStringExtra("key");
        tv.setVisibility(View.VISIBLE);
        String s1 = getIntent().getStringExtra("choco");
        String s2 = getIntent().getStringExtra("butt");
        String s3 = getIntent().getStringExtra("ric");
        String s4 = getIntent().getStringExtra("app");
        String s5 = getIntent().getStringExtra("ice");
        String s7 = getIntent().getStringExtra("lolli");
        String s8 = getIntent().getStringExtra("chip");
        String s9 = getIntent().getStringExtra("kurkure");
        String s6 = getIntent().getStringExtra("grapes");


        tv.setText(s);
        tv1.setText(s1);
        tv2.setText(s2);
        tv3.setText(s3);
        tv4.setText(s4);
        tv5.setText(s5);
        tv6.setText(s6);
        tv7.setText(s7);
        tv8.setText(s8);
        tv9.setText(s9);

    }

    public void additem(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }
}
