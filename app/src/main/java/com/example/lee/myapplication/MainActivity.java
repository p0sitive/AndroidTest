package com.example.lee.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button button = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "An Android Test", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        try {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            switch (id) {
                case R.id.add_Menu:
                    Toast.makeText(MainActivity.this, "AddMenu---Click",
                            Toast.LENGTH_SHORT).show();
                    intent.putExtra("a", "Add");

                    break;
                case R.id.delete_Menu:
                    Toast.makeText(MainActivity.this, "Delete---click", Toast.LENGTH_SHORT).show();
                    break;
//            intent.putExtra("")
                default:
                    break;
            }
            startActivity(intent);
        } catch (Exception e) {
            Log.e("error", e.getMessage());
        }
        return super.onOptionsItemSelected(item);
    }
}
