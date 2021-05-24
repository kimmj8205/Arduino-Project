package com.example.kkunji.problem;

import android.app.TabActivity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    ImageView iv1, iv2;
    Button btnPrev, btnNext;
    ViewFlipper vFlipper;

    LinearLayout problem1;
    RadioButton radio1, radio2 , radio3;
    EditText edt1,edt2;
    Button btn1;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView)findViewById(R.id.imageView1);
        iv2 = (ImageView)findViewById(R.id.imageView2);

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);

        vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        problem1 = findViewById(R.id.problem1);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btn1 = findViewById(R.id.btn1);
        tv = findViewById(R.id.tv);

        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem1.setBackgroundColor(Color.rgb(255,0,0));
            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem1.setBackgroundColor(Color.rgb(255,212,0));
            }
        });
        radio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problem1.setBackgroundColor(Color.rgb(0,0,255));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);

                int result = num1 + num2;
                tv.setText("" + result);
            }
        });

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabFirst = tabHost.newTabSpec("dog");
        tabFirst.setIndicator("문제1");
        tabFirst.setContent(R.id.problem1);
        tabHost.addTab(tabFirst);

        TabHost.TabSpec tabSecond = tabHost.newTabSpec("cat");
        tabSecond.setIndicator("문제2");
        tabSecond.setContent(R.id.problem2);
        tabHost.addTab(tabSecond);

        TabHost.TabSpec tabThird = tabHost.newTabSpec("horse");
        tabThird.setIndicator("문제3");
        tabThird.setContent(R.id.problem3);
        tabHost.addTab(tabThird);

        tabHost.setCurrentTab(1);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vFlipper.showPrevious();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vFlipper.showNext();
            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "고양이1 선택", Toast.LENGTH_SHORT).show();
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "고양이2 선택", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
