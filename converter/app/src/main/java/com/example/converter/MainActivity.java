package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void btnClick(View view)
    {
        EditText dollarAmount = (EditText) findViewById(R.id.dollarAmount);
        String dollors =dollarAmount.getText().toString();
        Double doubleDollor = Double.parseDouble(dollors);
        Double doubleinr = 71.71* doubleDollor;
        String toasttext = " = "+ doubleinr.toString() + "RS";
        Toast.makeText(this,toasttext, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}