package com.example.study99;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class openfromfragment1 extends AppCompatActivity {

    ImageView imageView;
    RelativeLayout relativeLayout;
    ImageView imageview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openfromfragment1);

        imageview1=findViewById(R.id.shareandbookmark1);
        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageview1.setBackgroundColor(0xffffff00);

            }
        });

        relativeLayout=findViewById(R.id.relative6);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                k1();
            }
        });

        imageView=findViewById(R.id.sharepage1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //sharing action....
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody="Your body here";
                String shareSub="Your Subject here";
                intent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                intent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(intent,"Share using"));



            }
        });
    }

    public void k1(){
        Intent intent=new Intent(this,openfromfragment.class);
        startActivity(intent);
    }
}
