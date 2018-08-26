package com.example.saujanya.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity
{
    EditText e1,e2,e3,e4;
    String s1,s2,s3,s4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=(EditText)findViewById(R.id.editText8);
        e2=(EditText)findViewById(R.id.editText9);
        e3=(EditText)findViewById(R.id.editText12);
        e4=(EditText)findViewById(R.id.editText13);
        b1=(Button)findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                s1=e2.getText().toString();
                s2=e1.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                if (s1=="" || s2=="" || s3=="" || s4=="")
                {
                    Toast.makeText(Main2Activity.this,"Fill all Details",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Main2Activity.this, "Welcome!!!", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Main2Activity.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }

}
