package com.example.devanshu.styles;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        text = (TextView) findViewById(R.id.text);

    }

    public void saver(View view){
        SharedPreferences sp = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);

        SharedPreferences.Editor e = sp.edit();
        e.putString("username", username.getText().toString());
        e.putString("password", password.getText().toString());
        e.apply();

        Toast.makeText(this, "Info has been Saved", Toast.LENGTH_SHORT).show();
    }

    public void displayer(View view){
        SharedPreferences sp = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);

        String name = sp.getString("username", "");
        String pw = sp.getString("password", "");
        text.setText("Username = " + name + "  \nPassword = " + pw);


    }







}
