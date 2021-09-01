package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class interface6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface6);
    }

    public void logClick(View view) {
        Intent confirmNow = new Intent(this,interface7.class);
        startActivity(confirmNow);
    }

}