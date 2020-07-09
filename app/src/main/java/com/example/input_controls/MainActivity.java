package com.example.input_controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public static String tag = "Toppings: ";
    CheckBox ch1, ch2, ch3, ch4, ch5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = (CheckBox) findViewById(R.id.checkBox6);
        ch2 = (CheckBox) findViewById(R.id.checkBox7);
        ch3 = (CheckBox) findViewById(R.id.checkBox8);
        ch4 = (CheckBox) findViewById(R.id.checkBox9);
        ch5 = (CheckBox) findViewById(R.id.checkBox10);
    }

    public void tosMessage(String message) {

        tag = "Toppings: ";
        String msg="";

        if(ch1.isChecked())
            msg=msg+"chocolate syrup ";
        if(ch2.isChecked())
            msg=msg+"sprinkles ";
        if(ch3.isChecked())
            msg=msg+"crushed nuts ";
        if(ch4.isChecked())
            msg=msg+"cherries ";
        if(ch5.isChecked())
            msg=msg+"orio cookie crumbles ";
        Toast.makeText(this, tag+msg ,
                Toast.LENGTH_LONG).show();
    }

    public void showMsg(View view) {
        tosMessage(tag);
    }
}


