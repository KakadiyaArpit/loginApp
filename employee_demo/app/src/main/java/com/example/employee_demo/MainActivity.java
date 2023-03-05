package com.example.employee_demo;


import androidx.appcompat.app.AppCompatActivity;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    String str7;
    RadioButton rb1,rb2,rb3,rb4,rb5;
    CheckBox chkbox1;
    Button btn1;
    EditText et1,et2,et3;
    Spinner sp;
    String[] designation = {"CHIR MAN","CEO","HOD","SELLS MANAGER","MANUFACTURING MANAGER","ACCOUNTANT","SECURITY"};

    TextView tv1;
    ImageButton imgbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        //getSupportActionBar().setTitle("EMPLOYEE DETAIL");

        sp = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter ard =new ArrayAdapter(this, android.R.layout.simple_list_item_1,designation);
        sp.setAdapter(ard);

        imgbutton=(ImageButton) findViewById(R.id.imagebutton);
        tv1=(TextView) findViewById(R.id.textView10);

        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDate();
            }
        });

        btn1 = (Button) findViewById(R.id.button);

        chkbox1 = (CheckBox) findViewById(R.id.checkBox);

        btn1.setEnabled(false);

        chkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    btn1.setEnabled(true);
                }else  {
                    btn1.setEnabled(false);
                }
            }
        });

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                str7 =designation[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

       /* btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkbox1.isChecked()) {

                    Intent i = new Intent(MainActivity.this, display.class);
                    et1 = (EditText) findViewById(R.id.editTextTextPersonName);
                    et2 = (EditText) findViewById(R.id.editTextTextEmailAddress);
                    et3 = (EditText) findViewById(R.id.editTextPhone);

                    String str1 = et1.getText().toString();
                    String str2 = et2.getText().toString();
                    String str3 = et3.getText().toString();

                    i.putExtra("name", str1);
                    i.putExtra("email", str2);
                    i.putExtra("phone", str3);
                    startActivity(i);
                }else {
                    Toast.makeText(MainActivity.this, "please Accept terms and condition", Toast.LENGTH_SHORT).show();

                }
            }
        });*/
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "CREATED BY ARPIT KAKADIYA", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(MainActivity.this, display.class);
                    et1 = (EditText) findViewById(R.id.editTextTextPersonName);
                    et2 = (EditText) findViewById(R.id.editTextTextEmailAddress);
                    et3 = (EditText) findViewById(R.id.editTextPhone);
                    rb1=(RadioButton) findViewById(R.id.radioButton);
                    rb2=(RadioButton) findViewById(R.id.radioButton2);
                    rb3=(RadioButton) findViewById(R.id.radioButton4);
                    rb4=(RadioButton) findViewById(R.id.radioButton3);
                    rb5=(RadioButton) findViewById(R.id.radioButton5);

                    if(rb1.isChecked()){
                        String str4 = rb1.getText().toString();
                        i.putExtra("qualification",str4);
                    }else if(rb2.isChecked()){
                        String str5= rb2.getText().toString();
                        i.putExtra("qualification",str5);
                    }else if(rb3.isChecked()){
                        String str6= rb3.getText().toString();
                        i.putExtra("qualification",str6);
                    }
                    if (rb4.isChecked()){
                        String str9 = rb4.getText().toString();
                        i.putExtra("gender",str9);
                    }else if(rb5.isChecked()){
                        String str10 = rb5.getText().toString();
                        i.putExtra("gender",str10);
                    }



                    String str1 = et1.getText().toString();
                    String str2 = et2.getText().toString();
                    String str3 = et3.getText().toString();
                    String str8 = tv1.getText().toString();

                    i.putExtra("name", str1);
                    i.putExtra("email", str2);
                    i.putExtra("phone", str3);
                    i.putExtra("post",str7);
                    i.putExtra("joindate",str8);
                    startActivity(i);
            }
        });
    }

    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int date) {
                String showdate = date+"/"+(month+1)+"/"+year;
                tv1.setText(showdate);
            }
        },year,month,date);
        datePickerDialog.show();
    }
}