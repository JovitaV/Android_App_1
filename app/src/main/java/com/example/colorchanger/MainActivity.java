package com.example.colorchanger;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView userText;
    private Button buttonRed;
    private Button buttonGreen;
    private Button buttonBlue;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userText = (TextView) findViewById(R.id.userText);
        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.colorRed, null));
                userText.setText("color red");
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.colorGreen, null));
                userText.setText("color green");
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.colorBlue, null));
                userText.setText("color blue");
            }
        });

         {

        }

    }
}
