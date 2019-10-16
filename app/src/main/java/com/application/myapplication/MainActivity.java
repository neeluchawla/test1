package com.application.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CLICKME(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        Log.d(LOG_TAG,"click button to navigate to next activity");
                startActivity(intent);
    }


}
