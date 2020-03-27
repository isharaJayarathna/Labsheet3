package com.aie.lab03;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static com.aie.lab03.R.id.*;

public class SecondActivity extends AppCompatActivity {

    TextView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        view = findViewById(R.id.textViewSe);
        Intent recieved = getIntent();
        String receivedMsg = recieved.getStringExtra(MainActivity.EXTRA_MESSAGE);
        view.setText(receivedMsg);


    }
}
