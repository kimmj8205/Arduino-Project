package com.example.kkunji.a8thhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2;
    Button btn1, btn2, btn3, btn4;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.Edit1);
        ed2 = (EditText)findViewById(R.id.Edit2);

        btn1 = (Button)findViewById(R.id.BtnAdd);
        btn2 = (Button)findViewById(R.id.BtnSub);
        btn3 = (Button)findViewById(R.id.BtnMul);
        btn4 = (Button)findViewById(R.id.BtnDiv);

        tv = (TextView)findViewById(R.id.TextResult);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = ed1.getText().toString();
                String str2 = ed2.getText().toString();
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                int result = num1 + num2;
                tv.setText("결과값 : "+result);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = ed1.getText().toString();
                String str2 = ed2.getText().toString();
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                int result = num1 - num2;
                tv.setText("결과값 : "+result);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = ed1.getText().toString();
                String str2 = ed2.getText().toString();
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                int result = num1 * num2;
                tv.setText("결과값 : "+result);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = ed1.getText().toString();
                String str2 = ed2.getText().toString();
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                int result = num1 / num2;
                tv.setText("결과값 : "+result);
            }
        });

    }
}
