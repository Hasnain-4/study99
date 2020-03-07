package com.example.study99;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    ///variable declaration
    EditText name,password;
    Button button,button1;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle(" Login");

        //find widgets by id
        name=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);

        //onCLick listner

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


                //email validation with regular expressio

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

                }
                //error message
                else if (password.length()==0){
                    password.setError("This field can't be empty");
                }else {

                    //progressbar dialog for loading

                    progressDialog=new ProgressDialog(MainActivity.this);
                    progressDialog.show();
                    progressDialog.setCancelable(false);
                    progressDialog.setCanceledOnTouchOutside(false);
                    progressDialog.setContentView(R.layout.progress);
                    progressDialog.getWindow().setBackgroundDrawableResource(
                            android.R.color.transparent
                    );


                    //startig dashboard activity

                    m1();



                }


            }
        });
    }

    // dialog box for email validation

    public void openDialog(){
        exampleDialog e=new exampleDialog();
        e.show(getSupportFragmentManager(),"example");
    }


    //intent for signup activity

    public void m(){
        Intent intent=new Intent(this,Signup.class);
        startActivity(intent);
    }

    //intent for Dashboard activity

    public void m1()
    {
            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);

        }


}

