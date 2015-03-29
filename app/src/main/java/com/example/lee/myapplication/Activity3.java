package com.example.lee.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Lee on 2015/3/26.
 */
public class Activity3 extends Activity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity3);
        Intent intent=getIntent();
        String a=intent.getStringExtra("a");
        //Log.d("A",a);
        Toast.makeText(Activity3.this,a,Toast.LENGTH_LONG).show();

        FindUI();

        setContentLisener();

    }

    private void setContentLisener() {
        button.setOnClickListener(new ButtonLisencer());
    }

    void FindUI()
    {
        button=(Button)findViewById(R.id.TheSecend);
        textView=(TextView)findViewById(R.id.textView_showText);
        imageView=(ImageView)findViewById(R.id.image1);
        editText=(EditText)findViewById(R.id.editText);
    }

    private class ButtonLisencer implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.TheSecend:
                    String strEditText = editText.getText().toString();
                    imageView.setImageResource(R.drawable.qq);
                    if (!strEditText.equals("")) {
                        Toast.makeText(Activity3.this, strEditText, Toast.LENGTH_LONG).show();
                        break;
                    }else
                    {
                        Toast.makeText(Activity3.this,"请输入文字！",Toast.LENGTH_LONG).show();
                    }
                default:
                    break;
            }
        }
    }
}
