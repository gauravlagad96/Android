package com.example.activity;

import static com.example.activity.R.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BlankActivity extends AppCompatActivity {

    Button b;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        b = findViewById(id.btn);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(BlankActivity.this);
                builder.setTitle("Lifecycle");
                builder.setMessage("Testing activity life cycle (pause state)");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(BlankActivity.this,"toast msg", Toast.LENGTH_LONG).show();
                    }
                });
                builder.show();
            }
        });

        Log.d("Lifecycle","onCreate() method executed");


    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Lifecycle","onStart() method executed");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","onResume() method executed");


    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Lifecycle","onRestart() method executed");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","onStop() method executed");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","onPause() method executed");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","onDestroy() method executed");

    }
}