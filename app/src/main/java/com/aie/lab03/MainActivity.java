package com.aie.lab03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.rxample.aie.lab03.Message";

    EditText msg;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = findViewById(R.id.editText_Main);
        send = findViewById(R.id.button_Main);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sent = new Intent(MainActivity.this,SecondActivity.class);
                String text = msg.getText().toString();

                sent.putExtra(EXTRA_MESSAGE,text);
                startActivity(sent);
            }
        });
    }
}
