package com.example.lenovo.lhl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Date;

public class MainActivity extends Activity implements PopupMenu.OnMenuItemClickListener{

    LinearLayout linearLayout1;

    TextView textView1;//the process
    TextView textView2;//the result

    Button button1;//symbol delete
    Button button2;//symbol C
    Button button3;//number seven
    Button button4;//number eight
    Button button5;//number nine
    Button button6;//symbol plus
    Button button7;//number four
    Button button8;//number five
    Button button9;//number six
    Button button10;//symbol minus
    Button button11;//number one
    Button button12;//number two
    Button button13;//number three
    Button button14;//symbol multiplication
    Button button15;//number zero
    Button button16;//symbol point
    Button button17;//symbol division
    Button button18;//symbol equal
    Button buttondwhs;//symbol dwhs
    Button buttonjzzh;//symbol jzzh
    Button buttontime,buttondrg,buttonsin,buttoncos,buttontan,buttonsqrt,buttonpf;

    //控制DRG按键，true为角度，false为弧度
    public boolean drg_flag = true;
    public double pi=4*Math.atan(1);

    StringBuffer stringBuffer = new StringBuffer();

    String[] a;

    int b;
    Double result = 0.0;//record the express value
    Double temp;//middle variable
    char c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.i("info", "landscape");
            setContentView(R.layout.activity_main_land);
            buttontime= (Button) findViewById(R.id.buttontime);
            buttondrg= (Button) findViewById(R.id.buttondrg);
            buttonsin= (Button) findViewById(R.id.buttonsin);
            buttoncos= (Button) findViewById(R.id.buttoncos);
            buttontan= (Button) findViewById(R.id.buttontan);
            buttonsqrt= (Button) findViewById(R.id.buttonsqrt);
            buttonpf= (Button) findViewById(R.id.buttonpf);


            buttontime.setOnClickListener(buttonListener);
            buttondrg.setOnClickListener(buttonListener);
            buttonsin.setOnClickListener(buttonListener);
            buttoncos.setOnClickListener(buttonListener);
            buttontan.setOnClickListener(buttonListener);
            buttonsqrt.setOnClickListener(buttonListener);
            buttonpf.setOnClickListener(buttonListener);



        } else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.i("info", "portrait");
            setContentView(R.layout.content_main);
        }
            //initialize
            linearLayout1 = (LinearLayout) findViewById(R.id.LinearLayout1);

            textView1 = (TextView) findViewById(R.id.textView1);
            textView2 = (TextView) findViewById(R.id.textView2);

            button1 = (Button) findViewById(R.id.button1);
            button2 = (Button) findViewById(R.id.button2);
            button3 = (Button) findViewById(R.id.button3);
            button4 = (Button) findViewById(R.id.button4);
            button5 = (Button) findViewById(R.id.button5);
            button6 = (Button) findViewById(R.id.button6);
            button7 = (Button) findViewById(R.id.button7);
            button8 = (Button) findViewById(R.id.button8);
            button9 = (Button) findViewById(R.id.button9);
            button10 = (Button) findViewById(R.id.button10);
            button11 = (Button) findViewById(R.id.button11);
            button12 = (Button) findViewById(R.id.button12);
            button13 = (Button) findViewById(R.id.button13);
            button14 = (Button) findViewById(R.id.button14);
            button15 = (Button) findViewById(R.id.button15);
            button16 = (Button) findViewById(R.id.button16);
            button17 = (Button) findViewById(R.id.button17);
            button18 = (Button) findViewById(R.id.button18);
            buttondwhs = (Button) findViewById(R.id.buttondwhs);
            buttonjzzh = (Button) findViewById(R.id.buttonjzzh);

            buttondwhs.setOnClickListener(buttonListener);
            buttonjzzh.setOnClickListener(buttonListener);
            button1.setOnClickListener(buttonListener);
            button2.setOnClickListener(buttonListener);
            button3.setOnClickListener(buttonListener);
            button4.setOnClickListener(buttonListener);
            button5.setOnClickListener(buttonListener);
            button6.setOnClickListener(buttonListener);
            button7.setOnClickListener(buttonListener);
            button8.setOnClickListener(buttonListener);
            button9.setOnClickListener(buttonListener);
            button10.setOnClickListener(buttonListener);
            button11.setOnClickListener(buttonListener);
            button12.setOnClickListener(buttonListener);
            button13.setOnClickListener(buttonListener);
            button14.setOnClickListener(buttonListener);
            button15.setOnClickListener(buttonListener);
            button16.setOnClickListener(buttonListener);
            button17.setOnClickListener(buttonListener);
            button18.setOnClickListener(buttonListener);

    }

        private View.OnClickListener buttonListener= new View.OnClickListener() {
            public void onClick(View v) {
                    // TODO Auto-generated method stub
                    switch (v.getId()) {

                        case R.id.buttondwhs:
                            Intent intent = new Intent(MainActivity.this, dwhs.class);
                            startActivity(intent);
                            break;

                        case R.id.buttonjzzh:
                            Intent intent1 = new Intent(MainActivity.this, jzzh.class);
                            startActivity(intent1);
                            break;

                        case R.id.buttontime:
                            Date date = new Date();
                            Toast.makeText(MainActivity.this, date.toLocaleString(), Toast.LENGTH_SHORT).show();
                            break;



                        case R.id.buttondrg:
                            if (drg_flag == true) {
                                drg_flag = false;
                                textView2.setText("   RAD");
                            } else {
                                drg_flag = true;
                                textView2.setText("   DEG");
                            }
                            break;


                        case R.id.buttonsin:
                                    stringBuffer.append(" " + buttonsin.getText().toString() + " ");
                            break;

                        case R.id.buttoncos:

                                stringBuffer.append(" " + buttoncos.getText().toString() + " ");
                            break;

                        case R.id.buttontan:

                                stringBuffer.append(" " + buttontan.getText().toString() + " ");
                            break;

                        case R.id.buttonsqrt:
                            if (!(stringBuffer.length() == 0 ||
                                    stringBuffer.charAt(stringBuffer.length() - 1) == ' '))
                                stringBuffer.append(" " + buttonsqrt.getText().toString() + " ");
                            break;

                        case R.id.buttonpf:
                            if (!(stringBuffer.length() == 0 ||
                                    stringBuffer.charAt(stringBuffer.length() - 1) == ' '))
                                stringBuffer.append(" " + buttonpf.getText().toString() + " ");
                            break;



                        case R.id.button1:// delete
                            b = stringBuffer.length();
                            if (b == 0)
                                textView2.setText("Have no value!");
                            else
                                stringBuffer.delete(b - 1, b);
                            break;
                        case R.id.button2:// C
                            b = stringBuffer.length();
                            stringBuffer.delete(0, b);
                            result = 0.0;
                            // textView2.setText("result");
                            break;
                        case R.id.button3:
                            stringBuffer.append(button3.getText().toString());
                            break;
                        case R.id.button4:
                            stringBuffer.append(button4.getText().toString());
                            break;
                        case R.id.button5:
                            stringBuffer.append(button5.getText().toString());
                            break;
                        case R.id.button6:// +
                            if (!(stringBuffer.length() == 0 ||
                                    stringBuffer.charAt(stringBuffer.length() - 1) == ' '))
                                stringBuffer.append(" " + button6.getText().toString() + " ");
                            break;
                        case R.id.button7:
                            stringBuffer.append(button7.getText().toString());
                            break;
                        case R.id.button8:
                            stringBuffer.append(button8.getText().toString());
                            break;
                        case R.id.button9:
                            stringBuffer.append(button9.getText().toString());
                            break;
                        case R.id.button10:// -
                            if (!(stringBuffer.length() == 0 ||
                                    stringBuffer.charAt(stringBuffer.length() - 1) == ' '))
                                stringBuffer.append(" " + button10.getText().toString() + " ");
                            break;
                        case R.id.button11:
                            stringBuffer.append(button11.getText().toString());
                            break;
                        case R.id.button12:
                            stringBuffer.append(button12.getText().toString());
                            break;
                        case R.id.button13:
                            stringBuffer.append(button13.getText().toString());
                            break;
                        case R.id.button14:
                            if (!(stringBuffer.length() == 0 ||
                                    stringBuffer.charAt(stringBuffer.length() - 1) == ' '))
                                stringBuffer.append(" " + button14.getText().toString() + " ");
                            break;
                        case R.id.button15:
                            stringBuffer.append(button15.getText().toString());
                            break;
                        case R.id.button16:// .

                            if (stringBuffer.length() == 0) {
                                stringBuffer.append("0.");
                                break;
                            }

                            b = stringBuffer.length();
                            c = stringBuffer.charAt((b - 1));
                            Log.i("show", String.valueOf(c));

                            if (c == ' ') {
                                stringBuffer.append("0.");
                                break;
                            } else if (c != '.')

                                stringBuffer.append(".");


                            break;
                        case R.id.button17:
                            if (!(stringBuffer.length() == 0 ||
                                    stringBuffer.charAt(stringBuffer.length() - 1) == ' '))
                                stringBuffer.append(" " + button17.getText().toString() + " ");
                            break;




                        case R.id.button18:// =

                            if (stringBuffer.length() == 0) {
                                textView2.setText("ERROR!");
                                break;
                            }
                            if (result == 0.0) {

                                String abc = stringBuffer.toString();//Converted into a string
                                a = abc.split(" ");//split the string by " "(blank)
                                stringBuffer.append(button18.getText().toString());

                                for (int i = 0; i < a.length; i++) {
                                    if (a[i].equals("√")) {
                                         if(Double.parseDouble(a[i + 1]) == 0  ||(Double.parseDouble(a[i + 1]) < 0 &&
                                            Double.parseDouble(a[i + 1]) % 2 == 0)) {
                                            Toast.makeText(MainActivity.this, "函数格式错误", Toast.LENGTH_SHORT).show();
                                        }
                                        else
                                        temp= Math.pow(Double.parseDouble(a[i - 1]), 1/Double.parseDouble(a[i + 1]));
                                        a[i + 1] = "" + temp;
                                        a[i - 1] = "0";
                                        if (i == 1)
                                            a[i] = "+";
                                        else
                                            a[i] = a[i - 2];
                                    }
                                }


                                for (int i = 0; i < a.length; i++) {
                                    if (a[i].equals("^")) {
                                    temp= Math.pow(Double.parseDouble(a[i - 1]), Double.parseDouble(a[i + 1]));
                                        a[i + 1] = "" + temp;
                                        a[i - 1] = "0";
                                        if (i == 1)
                                            a[i] = "+";
                                        else
                                            a[i] = a[i - 2];
                                    }
                                }


                                for (int i = 0; i < a.length; i++) {
                                    if (a[i].equals("sin")) {

                                        if(drg_flag == true) {
                                            temp = Math.sin((Double.parseDouble(a[i + 1])/180)*pi);
                                        } else {
                                            temp = Math.sin(Double.parseDouble(a[i + 1]));
                                        }

                                        a[i + 1] = "" + temp;
                                        a[i - 1] = "0";
                                        if (i == 1)
                                            a[i] = "+";
                                        else
                                            a[i] = a[i - 1];
                                    }
                                }

                                for (int i = 0; i < a.length; i++) {
                                    if (a[i].equals("cos")) {

                                        if(drg_flag == true) {
                                            temp = Math.cos((Double.parseDouble(a[i + 1])/180)*pi);
                                        } else {
                                            temp = Math.cos(Double.parseDouble(a[i + 1]));
                                        }

                                        a[i + 1] = "" + temp;
                                        a[i - 1] = "0";
                                        if (i == 1)
                                            a[i] = "+";
                                        else
                                            a[i] = a[i - 1];
                                    }
                                }


                                for (int i = 0; i < a.length; i++) {
                                    if (a[i].equals("tan")) {

                                        if(drg_flag == true) {
                                            if((Math.abs(Double.parseDouble(a[i + 1]))/90)%2 == 1) {
                                                Toast.makeText(MainActivity.this, "函数格式错误", Toast.LENGTH_SHORT).show();
                                            }
                                           temp = Math.tan((Double.parseDouble(a[i + 1])/180)*pi);
                                        } else {
                                            if((Math.abs(Double.parseDouble(a[i + 1]))/(pi/2))%2 == 1) {
                                                Toast.makeText(MainActivity.this, "函数格式错误", Toast.LENGTH_SHORT).show();
                                            }
                                            temp = Math.tan(Double.parseDouble(a[i + 1]));
                                        }

                                        a[i + 1] = "" + temp;
                                        a[i - 1] = "0";
                                        if (i == 1)
                                            a[i] = "+";
                                        else
                                            a[i] = a[i - 1];
                                    }
                                }





                                for (int i = 0; i < a.length; i++) {
                                    if (a[i].equals("*")) {

                                        temp = Double.parseDouble(a[i - 1]) * Double.parseDouble(a[i + 1]);
                                        a[i + 1] = "" + temp;
                                        a[i - 1] = "0";
                                        if (i == 1)
                                            a[i] = "+";
                                        else
                                            a[i] = a[i - 2];
                                    }
                                }

                                for (int i = 0; i < a.length; i++)
                                    Log.i("show", a[i]);


                                for (int i = 0; i < a.length; i++) {
                                    if (a[i].equals("÷")) {
                                        temp = (Double.parseDouble(a[i - 1]) * 1.0) / Double.parseDouble(a[i + 1]);
                                        a[i + 1] = "" + temp;
                                        a[i - 1] = "0";
                                        if (i == 1)
                                            a[i] = "+";
                                        else
                                            a[i] = a[i - 2];
                                    }
                                }
                                for (int i = 0; i < a.length; i++)
                                    Log.i("show", a[i]);


                                for (int i = 0; i < a.length; i++) {
                                    if (a[i].equals("-")) {
                                        temp = Double.parseDouble(a[i - 1]) - Double.parseDouble(a[i + 1]);
                                        a[i + 1] = "" + temp;
                                        a[i - 1] = "0";
                                        if (i == 1)
                                            a[i] = "+";
                                        else
                                            a[i] = a[i - 2];
                                    }
                                }
                                for (int i = 0; i < a.length; i++)
                                    Log.i("show", a[i]);


                                for (int i = 0; i < (a.length + 1) / 2; i++) {
                                    result += Double.parseDouble(a[2 * i]);
                                }
                                Log.i("result", "" + result);
                                textView2.setText("" + FP(result));
                            } else {
                                Toast.makeText(MainActivity.this, "请勿重复点击“=”号", Toast.LENGTH_LONG).show();
                            }
                    }
                    textView1.setText(stringBuffer.toString());

                }

            };



    public double FP(double n) {        //设置小数位
        DecimalFormat format = new DecimalFormat("0.#############");
        return Double.parseDouble(format.format(n));
    }
    @Override
    public void onStart(){
        super.onStart();
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestart(){
        super.onRestart();
    }

    @Override
    public void onPause(){
        super.onPause();
    }

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_settings:
                Toast.makeText(this, "设置", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_help:
                Toast.makeText(this, "这是帮助", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showPopup(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_main);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_help:
                Toast.makeText(this, "这是帮助", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();


        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();

        }

    }


}
