package com.example.kkunji.a9thhomework;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.logging.Level;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb1, rb2, rb3;
    Button btn, btn1, btn2;
    ImageView iv;
    int resourse;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup)findViewById(R.id.radioGroup);
        rb1 = (RadioButton)findViewById(R.id.radioButton1);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb3 = (RadioButton)findViewById(R.id.radioButton3);
        btn = (Button)findViewById(R.id.button);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        layout = (LinearLayout)findViewById(R.id.layout);

        iv = (ImageView)findViewById(R.id.imageView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rg.getCheckedRadioButtonId();
                switch(id){
                    case R.id.radioButton1:
                        resourse = R.drawable.dog;
                        //iv.setImageResource(R.drawable.dog);
                        break;
                    case R.id.radioButton2:
                        resourse = R.drawable.cat;
                        //iv.setImageResource(R.drawable.cat);
                        break;
                    case R.id.radioButton3:
                        resourse = R.drawable.rabbit;
                        //iv.setImageResource(R.drawable.rabbit);
                        break;
                }
                if (resourse == 0)
                    Toast.makeText(getApplicationContext(),"동물을 선택하세요!", Toast.LENGTH_SHORT).show();
                else
                    iv.setImageResource(resourse);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.rgb(0,255,0));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}
