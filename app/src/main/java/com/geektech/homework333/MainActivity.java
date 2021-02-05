package com.geektech.homework333;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView, camera, contacts, google;
    TextView txtView, txtView2;
    public int REQUEST_CODE = 400;
    public int REQUEST_CODE2 = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        txtView = findViewById(R.id.txtView);
        camera = findViewById(R.id.camera);
        contacts = findViewById(R.id.contacts);
        google = findViewById(R.id.google);


        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(MainActivity.this,MainActivity4.class);
                startActivityForResult(intent, REQUEST_CODE2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
         String text;
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK){

            text = data.getStringExtra("key1");
            txtView2.setText(text);



        }

    }
}