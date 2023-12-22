package com.example.curd_sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText reg_name, reg_email, reg_pass, reg_gender;
    DbHelper dbHelper ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reg_name = (EditText) findViewById(R.id.reg_name);
        reg_email = (EditText) findViewById(R.id.reg_email);
        reg_pass = (EditText) findViewById(R.id.reg_pass);
        reg_gender = (EditText) findViewById(R.id.reg_gender);

        dbHelper=new DbHelper(getApplicationContext());
    }

    public  void registerUser(View view){
    String name = reg_name.getText().toString();
    String email = reg_email.getText().toString();
    String password = reg_pass.getText().toString();
    String gender = reg_gender.getText().toString();

    dbHelper.registerUserHelper(name ,email,password,gender);

        Toast.makeText(this,"User registerd successfully !!",Toast.LENGTH_LONG).show();

        reg_name.setText("");
        reg_email.setText("");
        reg_gender.setText("");
        reg_pass.setText("");
    }
}