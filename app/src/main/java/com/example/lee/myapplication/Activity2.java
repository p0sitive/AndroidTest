package com.example.lee.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Lee on 2015/3/25.
 */
public class Activity2 extends Activity {
//    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity2);
//        textView = (TextView) findViewById(R.id.textView);
//        textView.setText("Success");
    }
}
