package com.example.study99;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText name,password;
    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle(" Login");

        name=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);


        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m();
            }
        });

        button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                        "\\@" +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                        "(" +

                        "\\." +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                        ")+";


                String email = name.getText().toString();

                Matcher matcher= Pattern.compile(validemail).matcher(email);


                if (!matcher.matches()){
                    openDialog();
                }else{
                    openDialog1();
                }

                    if (password.length()==0){
                    password.setError("This field can't be empty");
                }

            }
        });
    }

    public void openDialog(){
        exampleDialog e=new exampleDialog();
        e.show(getSupportFragmentManager(),"example");
    }
    public void openDialog1(){
        dialog2 e1=new dialog2();
        e1.show(getSupportFragmentManager(),"lol");
    }

    public void m(){
        Intent intent=new Intent(this,Signup.class);
        startActivity(intent);
    }
}
