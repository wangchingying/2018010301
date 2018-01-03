package com.cyw.a2018010301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Button bn1,bn2;
    ImageView iv1;
    ImageButton ib1,ib2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1=(ImageView)findViewById(R.id.imageView) ;
        bn1=(Button)findViewById(R.id.button);
        bn2=(Button)findViewById(R.id.button2);
        ib1=(ImageButton)findViewById(R.drawable.button);//抓一個圖當按鈕
        ib2=(ImageButton)findViewById(R.drawable.buttonB);//須把背景background color 選透明(transparent)
        //按一下出現彩虹
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.rainbow);
            }
        });
        //用picasso下載圖片
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Picasso網址 http://square.github.io/picasso/
                Picasso.with(MainActivity.this).load("http://square.github.io/picasso/static/sample.png").into(iv1);
            }
        });
    }
}
