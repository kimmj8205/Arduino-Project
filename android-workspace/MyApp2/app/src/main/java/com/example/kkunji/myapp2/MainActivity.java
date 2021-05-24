package com.example.kkunji.myapp2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv;
        TextView tv1;
        TextView tv2;

        tv = (TextView) findViewById(R.id.hakbun);
        tv.setTextColor(Color.RED);
        tv.setTextSize(10);
        tv.setText("학번:2018045378");

        tv1 = (TextView) findViewById(R.id.major);
        tv1.setTextColor(Color.YELLOW);
        tv1.setTextSize(40);

        tv2 = (TextView) findViewById(R.id.name);
        tv2.setTextColor(Color.rgb(0,255,0));
        tv2.setTextSize(20);
        tv2.setText("김민준");
    }
}
