package com.example.study99;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class openfromfragment extends AppCompatActivity {

    ImageView imageView,imageview1;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openfromfragment);

        imageview1=findViewById(R.id.shareandbookmark);
        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageview1.setBackgroundColor(0xffffff00);
            }
        });

        relativeLayout=findViewById(R.id.relative5);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                k2();
            }
        });

        imageView=findViewById(R.id.sharepage);

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

    public void k2(){
        Intent intent=new Intent(this,openfromfragment1.class);
        startActivity(intent);
    }


}
