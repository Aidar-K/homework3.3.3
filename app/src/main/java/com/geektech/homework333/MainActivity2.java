package com.geektech.homework333;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText etTextTwo;
    Button buttonTwo;
    public String text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etTextTwo = findViewById(R.id.etTextTwo);
        buttonTwo = findViewById(R.id.buttonTwo);

        text2 = etTextTwo.getText().toString();

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                intent.putExtra("key1",text2);
                setResult(RESULT_OK);
                finish();
            }
        });

    }
}