package com.example.adaptersdemo.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.GridView;

import com.example.adaptersdemo.R;

public class MainActivityOne extends AppCompatActivity {
    GridView grid_view;

        int [] flower_images= {R.drawable.img_flower,R.drawable.img2_butterfly,R.drawable.sunflower_img,R.drawable.sunflower_img,
                R.drawable.img_flower,R.drawable.img2_butterfly,R.drawable.sunflower_img,R.drawable.sunflower_img,
                R.drawable.img_flower,R.drawable.img2_butterfly,R.drawable.sunflower_img,R.drawable.sunflower_img};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);
         grid_view = (GridView) findViewById(R.id.grid_view1);

         MyAdapterOne adapterOne = new MyAdapterOne(getApplicationContext(),flower_images);
         grid_view.setAdapter(adapterOne);








    }




}