package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class googlemaps extends AppCompatActivity {

    Intent intent = null, chooser=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googlemaps);
        Button button = findViewById(R.id.maps);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:19.076.72.8777"));
                chooser = Intent.createChooser(intent, "Maps");
                startActivity(chooser);

            }
        });




    }

    public void logClick(View view) {
        Intent intent = new Intent(this, secondlast.class);
        startActivity(intent);
    }
}