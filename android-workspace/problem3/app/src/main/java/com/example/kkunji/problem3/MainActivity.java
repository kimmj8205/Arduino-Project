package com.example.kkunji.problem3;

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
        TextView tv3;

        tv = (TextView) findViewById(R.id.list);
        tv.setTextSize(30);

        tv1 = (TextView) findViewById(R.id.no1);
        tv1.setText("1번.라라랜드");
        tv1.setTextSize(20);
        tv1.setTextColor(Color.WHITE);
        tv1.setBackgroundColor(Color.RED);

        tv2 = (TextView) findViewById(R.id.no2);
        tv2.setText("2번.기생충");
        tv2.setTextSize(20);
        tv2.setTextColor(Color.WHITE);
        tv2.setBackgroundColor(Color.BLUE);

        tv3 = (TextView) findViewById(R.id.no3);
        tv3.setText("3번.어벤져스");
        tv3.setTextSize(20);
        tv3.setTextColor(Color.WHITE);
        tv3.setBackgroundColor(Color.GREEN);

    }
}
