package com.example.evan.screentest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.button_deadPixelTest).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_contrast).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_about).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_deadPixelTest:
                    Intent intentDPT = new Intent(MainActivity.this, deadPixelTestActivity.class);
                    startActivity(intentDPT);
                    break;
                case R.id.button_contrast:
                    Intent intentCRST = new Intent(MainActivity.this, activity_contrast.class);
                    startActivity(intentCRST);
                    break;
                case R.id.button_about:
                    Intent intentAbout = new Intent(MainActivity.this, activity_about.class);
                    startActivity(intentAbout);
            }
        }
    };
}

