package com.example.adaptersdemo.demo1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.adaptersdemo.R;

public class MyAdapterOne extends BaseAdapter {
    int [] data;
    Context context;
    LayoutInflater inflater;
    MyAdapterOne(Context context,int [] data){
        this.context=context;
        this.data=data;
        inflater=(LayoutInflater.from(context));
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
    view=inflater.inflate(R.layout.ui_view1,null);
        ImageView imageView1= (ImageView)  view.findViewById(R.id.img_view1);
        imageView1.setImageResource(data[i]);
        return view;
    }
}
