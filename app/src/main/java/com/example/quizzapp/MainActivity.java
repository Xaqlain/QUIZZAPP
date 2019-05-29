package com.example.quizzapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String login = "log";
    public static final String email = "em";
    public static final String pass = "ps";
    public static final String MyPREFERENCES="MyPrefs";
    SharedPreferences sharedpreferences;
    EditText em,ps;
    Button log;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        em =(EditText)findViewById(R.id.email);
        ps = (EditText)findViewById(R.id.pass);
        log= (Button)findViewById(R.id.login);
        sharedpreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String val=sharedpreferences.getString(email, null);

        if(val!=null)
        {
            Intent i=new Intent(getApplicationContext(), MainActivity.class);
            i.putExtra("Name", val);
            startActivity(i);
        }
        log.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                String name=em.getText().toString();
                String password=ps.getText().toString();
                if(name.equals("") || pass.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "login details Empty.!", Toast.LENGTH_LONG).show();
                    return;
                }
                SharedPreferences.Editor editor=sharedpreferences.edit();
                editor.putString(email, name);
                editor.putString(pass, password);
                editor.commit();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                i.putExtra("Name", name);
                startActivity(i);

            }
        });
    }}


