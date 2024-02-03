package com.sufaka.javasimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1text;
    EditText num2text;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         num1text = findViewById(R.id.num1text);
         num2text = findViewById(R.id.num2text);
         resultText = findViewById(R.id.resultText);



    }

    public void Topla(View view){
        if(num1text.getText().toString().matches("")|| num2text.getText().toString().matches("")){
            resultText.setText("Sayi Gir!");
        }
        else{
            int number1 = Integer.parseInt(num1text.getText().toString());
            int number2 = Integer.parseInt(num2text.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result:" + result);
        }




    }
    public void Cikar(View view){
        if(num1text.getText().toString().matches("")|| num2text.getText().toString().matches("")){
            resultText.setText("Sayi Gir!");
        }
        else{
            int number1 = Integer.parseInt(num1text.getText().toString());
            int number2 = Integer.parseInt(num2text.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result:" + result);
        }
    }
    public void Carp(View view){
        if(num1text.getText().toString().matches("")|| num2text.getText().toString().matches("")){
            resultText.setText("Sayi Gir!");
        }
        else{
            int number1 = Integer.parseInt(num1text.getText().toString());
            int number2 = Integer.parseInt(num2text.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result:" + result);
        }
    }
    public void Bol(View view){
        if(num1text.getText().toString().matches("")|| num2text.getText().toString().matches("")){
            resultText.setText("Sayi Gir!");
        }
        else{
            int number1 = Integer.parseInt(num1text.getText().toString());
            int number2 = Integer.parseInt(num2text.getText().toString());

            int result = number1 / number2;

            resultText.setText("Result:" + result);
        }
    }
}