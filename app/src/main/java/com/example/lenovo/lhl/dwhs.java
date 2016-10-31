package com.example.lenovo.lhl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class dwhs extends AppCompatActivity {

    EditText edit_li, edit_m, edit_chi, edit_zhang, edit_cun;
    String str_li, str_m, str_chi, str_zhang, str_cun;
    Button b_li, b_m, b_chi, b_zhang, b_cun, re, clear;
    double d_li, d_m, d_chi, d_zhang, d_cun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwhs);

        b_li = (Button) findViewById(R.id.btn_li);
        b_m = (Button) findViewById(R.id.btn_m);
        b_zhang = (Button) findViewById(R.id.btn_zhang);
        b_chi = (Button) findViewById(R.id.btn_chi);
        b_cun = (Button) findViewById(R.id.btn_cun);
        re = (Button) findViewById(R.id.returnn);
        clear = (Button) findViewById(R.id.clear);
        edit_li = (EditText) findViewById(R.id.et_li);
        edit_m = (EditText) findViewById(R.id.et_m);
        edit_zhang = (EditText) findViewById(R.id.et_zhang);
        edit_chi = (EditText) findViewById(R.id.et_chi);
        edit_cun = (EditText) findViewById(R.id.et_cun);

        re.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(dwhs.this, MainActivity.class);
                startActivity(intent);
            }
        });
        clear.setOnClickListener((new View.OnClickListener() {
            public void onClick(View v) {
                edit_li.setText("");
                edit_m.setText("");
                edit_zhang.setText("");
                edit_chi.setText("");
                edit_cun.setText("");
            }
        }));
        b_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str_m = edit_m.getText().toString();
                d_m = Double.parseDouble(str_m);
                d_li = d_m * 0.002;
                d_zhang = d_m * 0.3;
                d_chi = d_m * 3;
                d_cun = d_m * 30;
                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                edit_li.setText(String.format("%.5f", d_li));
                edit_zhang.setText(String.format("%.5f", d_zhang));
                edit_chi.setText(String.format("%.5f", d_chi));
                edit_cun.setText(String.format("%.5f", d_cun));

            }
        });
        b_li.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str_li = edit_li.getText().toString();
                d_li = Double.parseDouble(str_li);

                d_m = d_li * 500;
                d_zhang = d_li * 150;
                d_chi = d_li * 1500;
                d_cun = d_li * 15000;
                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                edit_m.setText(String.format("%.5f", d_m));
                edit_zhang.setText(String.format("%.5f", d_zhang));
                edit_chi.setText(String.format("%.3f", d_chi));
                edit_cun.setText(String.format("%.2f", d_cun));

            }
        });
        b_zhang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str_zhang = edit_zhang.getText().toString();
                d_zhang = Double.parseDouble(str_zhang);

                d_m = d_zhang * 3.3333333;
                d_li = d_zhang * 0.0066666667;
                d_chi = d_zhang * 10;
                d_cun = d_zhang * 100;

                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                edit_m.setText(String.format("%.5f", d_m));

                edit_li.setText(String.format("%.5f", d_li));
                edit_chi.setText(String.format("%.3f", d_chi));
                edit_cun.setText(String.format("%.2f", d_cun));
            }
        });
        b_chi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str_chi = edit_chi.getText().toString();
                d_chi = Double.parseDouble(str_chi);

                d_m = d_chi * 0.33333333;
                d_li = d_chi * 0.00066666667;
                d_zhang = d_chi * 0.1;
                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                edit_m.setText(String.format("%.5f", d_m));
                edit_li.setText(String.format("%.5f", d_li));
                edit_zhang.setText(String.format("%.3f", d_zhang));
                edit_cun.setText(String.format("%.2f", d_cun));
            }
        });
        b_cun.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str_cun = edit_cun.getText().toString();
                d_cun = Double.parseDouble(str_cun);

                d_m = d_cun * 0.033333333;
                d_li = d_cun * 0.000066666667;
                d_zhang = d_cun * 0.01;
                d_chi = d_cun * 0.1;
                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                edit_m.setText(String.format("%.5f", d_m));
                edit_li.setText(String.format("%.8f", d_li));
                edit_zhang.setText(String.format("%.3f", d_zhang));
                edit_chi.setText(String.format("%.2f", d_chi));
            }
        });


    }
}
