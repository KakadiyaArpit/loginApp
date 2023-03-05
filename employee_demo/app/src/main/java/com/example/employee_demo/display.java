package com.example.employee_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class display extends AppCompatActivity {
    TextView txtview1,txtview2,txtview3,txtview4,txtview5,txtview6,txtview7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        txtview1 = (TextView) findViewById(R.id.textView3);
        txtview2 = (TextView) findViewById(R.id.textView4);
        txtview3 = (TextView) findViewById(R.id.textView5);
        txtview4 = (TextView) findViewById(R.id.textView12);
        txtview5 = (TextView) findViewById(R.id.textView14);
        txtview6 = (TextView) findViewById(R.id.textView16);
        txtview7 = (TextView) findViewById(R.id.textView20);


        String name1 = getIntent().getStringExtra("name");
        String email1 = getIntent().getStringExtra("email");
        String phone1 = getIntent().getStringExtra("phone");
        String qulify = getIntent().getStringExtra("qualification");
        String post1 = getIntent().getStringExtra("post");
        String date = getIntent().getStringExtra("joindate");
        String gender1 = getIntent().getStringExtra("gender");

        txtview1.setText(name1);
        txtview2.setText(email1);
        txtview3.setText(phone1);
        txtview4.setText(qulify);
        txtview5.setText(post1);
        txtview6.setText(date);
        txtview7.setText(gender1);
    }
}