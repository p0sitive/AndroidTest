package com.example.lee.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Lee on 2015/3/25.
 */
public class Activity2 extends Activity{
    TextView textView=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView = (TextView) findViewById(R.id.textView);
        try{
        Intent intent = getIntent();
        String a = intent.getStringExtra("a");
        if (a != "") {
            textView.setText(a);
        }}
        catch (Exception e)
        {
            Log.e("error",e.getMessage());
        }
    }
}
