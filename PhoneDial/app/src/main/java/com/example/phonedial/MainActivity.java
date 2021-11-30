package com.example.phonedial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = findViewById(R.id.phnum);
    }
    public void callNumber(View view){
        String callnum = num.getText().toString();
        Uri number = Uri.parse("tel:"+callnum);
        Intent it = new Intent(Intent.ACTION_DIAL, number);
        startActivity(it);
    }
}