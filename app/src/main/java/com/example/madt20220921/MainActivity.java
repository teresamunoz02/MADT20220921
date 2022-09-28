package com.example.madt20220921;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnChangeTextClick(View v)
    {
        tv = (TextView)findViewById(R.id.textView);
        tv.setText("Welcome to android");
        tv.setTextColor(Color.rgb(200,0,0));

    }
}