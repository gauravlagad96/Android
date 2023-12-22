package com.example.myapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
//
        Toast.makeText(MainActivity.this, "This is a simple toast msg...", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
    }
}