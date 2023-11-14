package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText editTextNumber;
    EditText editTextNumber2;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    TextView editTextNumber4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextNumber = (EditText)findViewById(R.id.editTextNumber);
        editTextNumber2 = (EditText)findViewById(R.id.editTextNumber2);
        button = (Button) findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        editTextNumber4 = (TextView) findViewById(R.id.editTextNumber4);


    }


    public void add(View view)
    {
        Double num1, num2;
        num1 = Double.parseDouble(editTextNumber.getText().toString());
        num2 = Double.parseDouble(editTextNumber2.getText().toString());
        Double sum=0.0;
        sum = num1+num2;
        editTextNumber4.setText(String.valueOf(sum));
    }

    public void minus(View view)
    {
        Double num1, num2;
        num1 = Double.parseDouble(editTextNumber.getText().toString());
        num2 = Double.parseDouble(editTextNumber2.getText().toString());
        Double sum=0.0;
        sum = num1-num2;
        editTextNumber4.setText(String.valueOf(sum));
    }

    public void multiply(View view)
    {
        Double num1, num2;
        num1 = Double.parseDouble(editTextNumber.getText().toString());
        num2 = Double.parseDouble(editTextNumber2.getText().toString());
        Double sum=0.0;
        sum = num1*num2;
        editTextNumber4.setText(String.valueOf(sum));
    }

    public void divide(View view)
    {
        Double num1, num2;
        num1 = Double.parseDouble(editTextNumber.getText().toString());
        num2 = Double.parseDouble(editTextNumber2.getText().toString());
        Double sum=0.0;
        sum = num1/num2;
        editTextNumber4.setText(String.valueOf(sum));
    }
}