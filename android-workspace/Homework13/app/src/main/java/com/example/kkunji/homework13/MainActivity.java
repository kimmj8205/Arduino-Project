package com.example.kkunji.homework13;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    ImageView iv1, iv2, iv3, iv4, iv5, iv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView)findViewById(R.id.imageView1);
        iv2 = (ImageView)findViewById(R.id.imageView2);
        iv3 = (ImageView)findViewById(R.id.imageView3);
        iv4 = (ImageView)findViewById(R.id.imageView4);
        iv5 = (ImageView)findViewById(R.id.imageView5);
        iv6 = (ImageView)findViewById(R.id.imageView6);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabFirst = tabHost.newTabSpec("dog");
        tabFirst.setIndicator("강아지");
        tabFirst.setContent(R.id.tabDog);
        tabHost.addTab(tabFirst);

        TabHost.TabSpec tabSecond = tabHost.newTabSpec("cat");
        tabSecond.setIndicator("고양이");
        tabSecond.setContent(R.id.tabCat);
        tabHost.addTab(tabSecond);

        TabHost.TabSpec tabThird = tabHost.newTabSpec("horse");
        tabThird.setIndicator("말");
        tabThird.setContent(R.id.tabHorse);
        tabHost.addTab(tabThird);

        tabHost.setCurrentTab(1);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "강아지1 선택", Toast.LENGTH_SHORT).show();
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "강아지2 선택", Toast.LENGTH_SHORT).show();
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "고양이1 선택", Toast.LENGTH_SHORT).show();
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "고양이2 선택", Toast.LENGTH_SHORT).show();
            }
        });
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "말1 선택", Toast.LENGTH_SHORT).show();
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "말2 선택", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
