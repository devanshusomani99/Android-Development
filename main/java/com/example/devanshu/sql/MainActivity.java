package com.example.devanshu.sql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input;
    EditText text;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (TextView) findViewById(R.id.input);
        text = (EditText) findViewById(R.id.text);
        dbHandler = new MyDBHandler(this, null , null ,1);
        printDatabase();
    }

    public void badd(View view){
        Product product = new Product(text.getText().toString());
        dbHandler.AddProduct(product);
        printDatabase();
    }

    public void bdel(View view){
        String inputText = text.getText().toString();
        dbHandler.DeleteProduct(inputText);
        printDatabase();
    }

    public void printDatabase(){
        String dbString = dbHandler.DbToString();
        input.setText(dbString);
        text.setText("");
    }
}
