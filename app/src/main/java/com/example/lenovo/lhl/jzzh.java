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

public class jzzh extends AppCompatActivity {

    EditText e_b,e_d,e_h;
    String str_b,str_d,str_h;
    Button btn_b,btn_d,btn_h,re2,clearTransform;
    int i10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jzzh);

        btn_b = (Button) findViewById(R.id.btn_bin);
        btn_d = (Button) findViewById(R.id.btn_dec);
        btn_h = (Button) findViewById(R.id.btn_hex);
        re2 = (Button) findViewById(R.id.returnn2);
        clearTransform = (Button) findViewById(R.id.clear_Transform);

        e_b = (EditText) findViewById(R.id.bin);
        e_d = (EditText) findViewById(R.id.dec);
        e_h = (EditText) findViewById(R.id.hex);

        re2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(jzzh.this, MainActivity.class);
                startActivity(intent);
            }
        });
        clearTransform.setOnClickListener((new View.OnClickListener() {
            public void onClick(View v) {
                e_b.setText("");
                e_d.setText("");
                e_h.setText("");
            }
        }));
        btn_b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str_b = e_b.getText().toString();

                str_d = Integer.valueOf(str_b, 2).toString();
                str_h = Integer.toHexString(Integer.parseInt(str_b, 2));

                e_d.setText(str_d);
                e_h.setText(str_h);
            }
        });
        btn_d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str_d = e_d.getText().toString();
                i10 = Integer.parseInt(str_d);

                str_b = Integer.toBinaryString(i10);

                str_h = Integer.toHexString(i10);

                e_b.setText(str_b);
                e_h.setText(str_h);
            }
        });
        btn_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str_h = e_h.getText().toString();

                str_b = Integer.toBinaryString(Integer.valueOf(str_h, 16));
                str_d = Integer.valueOf(str_h, 16).toString();

                e_b.setText(str_b);
                e_d.setText(str_d);
            }
        });
    }

}