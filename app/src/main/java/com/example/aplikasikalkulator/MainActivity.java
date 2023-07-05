package com.example.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1, textView2;
    private Button buttonsatu, buttondua, buttontiga, buttonempat, buttonlima, buttonenam, buttontuju, buttondelapan, buttonsembilan, buttonnol, buttonclear, button_space, button_percent, button_tambah, button_kurang, button_kali, buttondivide, button_koma, buttonhasil;
    private double first, second, result;
    private String operation;
    private String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        textView1 = findViewById(R.id.textview1);
        textView2 = findViewById(R.id.textview2);
        buttonnol = findViewById(R.id.button0);
        buttonsatu = findViewById(R.id.button1);
        buttondua = findViewById(R.id.button2);
        buttontiga = findViewById(R.id.button3);
        buttonempat = findViewById(R.id.button4);
        buttonlima = findViewById(R.id.button5);
        buttonenam = findViewById(R.id.button6);
        buttontuju = findViewById(R.id.button7);
        buttondelapan = findViewById(R.id.button8);
        buttonsembilan = findViewById(R.id.button9);
        button_koma = findViewById(R.id.buttonKoma);
        button_space = findViewById(R.id.buttonBackspace);
        buttonclear = findViewById(R.id.buttonClear);
        button_kali = findViewById(R.id.buttonKali);
        button_kurang = findViewById(R.id.buttonKurang);
        button_tambah = findViewById(R.id.buttonTambah);
        button_percent = findViewById(R.id.buttonPercent);
        buttondivide = findViewById(R.id.buttonDevide);
        buttonhasil = findViewById(R.id.buttonHasil);

        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(null);
                textView2.setText(null);
            }
        });
        buttonnol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text= textView2.getText().toString()+buttonnol.getText().toString();
                textView2.setText(text);
            }
        });
        buttonsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
               text= textView2.getText().toString()+buttonsatu.getText().toString();
               textView2.setText(text);
            }
        });
        buttondua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text= textView2.getText().toString()+buttondua.getText().toString();
                textView2.setText(text);
            }
        });
        buttontiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text= textView2.getText().toString()+buttontiga.getText().toString();
                textView2.setText(text);
            }
        });
        buttonempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text= textView2.getText().toString()+buttonempat.getText().toString();
                textView2.setText(text);
            }
        });
        buttonlima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text= textView2.getText().toString()+buttonlima.getText().toString();
                textView2.setText(text);
            }
        });
        buttonenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text= textView2.getText().toString()+buttonenam.getText().toString();
                textView2.setText(text);
            }
        });
        buttontuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text= textView2.getText().toString()+buttontuju.getText().toString();
                textView2.setText(text);
            }
        });
        buttondelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text= textView2.getText().toString()+buttondelapan.getText().toString();
                textView2.setText(text);
            }
        });
        buttonsembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text= textView2.getText().toString()+buttonsembilan.getText().toString();
                textView2.setText(text);
            }
        });

        button_koma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text= textView2.getText().toString()+button_koma.getText().toString();
                textView2.setText(text);
            }
        });
        button_space.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String text = textView2.getText().toString();
                if (text.length() > 0) {
                    StringBuilder stringBuilder = new StringBuilder(text);
                    stringBuilder.deleteCharAt(text.length() - 1);
                    String backspace = stringBuilder.toString();
                    textView2.setText(backspace);
                }
            }

        });

        ////button untuk perhitungan
        button_percent.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                String primary;
                first= Double.parseDouble((String)textView2.getText());
                primary=String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText("");
                operation="%";

            }
        });
        button_tambah.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                String primary;
                first= Double.parseDouble((String)textView2.getText());
                primary=String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText("");
                operation="+";

            }
        });
        button_kurang.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                String primary;
                first= Double.parseDouble((String)textView2.getText());
                primary=String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText("");
                operation="-";

            }
        });
        buttondivide.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                String primary;
                first= Double.parseDouble((String)textView2.getText());
                primary=String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText("");
                operation="/";

            }
        });
        button_kali.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                String primary;
                first= Double.parseDouble((String)textView2.getText());
                primary=String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText("");
                operation="*";

            }
        });

        ////button hasil
        buttonhasil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                second=Double.parseDouble((String) textView2.getText());
                if(operation=="+"){
                    result = first+second;
                    answer=String.format("%.2f",result);
                    textView2.setText(answer);
                    textView1.setText(null);
                }
                if(operation=="-"){
                    result = first-second;
                    answer=String.format("%.2f",result);
                    textView2.setText(answer);
                    textView1.setText(null);
                }
                if(operation=="*"){
                    result = first*second;
                    answer=String.format("%.2f",result);
                    textView2.setText(answer);
                    textView1.setText(null);
                }
                if(operation=="/"){
                    result = first/second;
                    answer=String.format("%.2f",result);
                    textView2.setText(answer);
                    textView1.setText(null);
                }
                if(operation=="%"){
                    result = first%second;
                    answer=String.format("%.2f",result);
                    textView2.setText(answer);
                    textView1.setText(null);
                }
            }

        });


    }
}
