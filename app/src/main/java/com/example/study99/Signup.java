package com.example.study99;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Signup extends AppCompatActivity {

    EditText sname,semail,spassword;
    Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        this.setTitle(" Sign Up");

        sname=(EditText)findViewById(R.id.editText4);
        semail=(EditText)findViewById(R.id.editText6);
        spassword=(EditText)findViewById(R.id.editText8);

        btn=(Button)findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n();
            }
        });
        btn1=(Button)findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                        "\\@" +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                        "(" +

                        "\\." +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                        ")+";


                String email = semail.getText().toString();

                Matcher matcher= Pattern.compile(validemail).matcher(email);


                if (!matcher.matches()){
                    openD1();

                }else{

                    openD2();
                }
                if(sname.length()==0){
                    sname.setError("Please enter your name!");
                }
                else if(spassword.length()==0){
                    spassword.setError("This field can't be empty!");
                }

            }
        });
    }

    public void openD1(){

        d1 f= new d1();
        f.show(getSupportFragmentManager(),"example");


    }

    public void openD2(){

        d2 f1= new d2();
        f1.show(getSupportFragmentManager(),"example");

    }


    public void n(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
