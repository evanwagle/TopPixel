package com.example.evan.screentest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class deadPixelTestActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dead_pixel_test);

        defineButtons();
    }
    public void defineButtons() {
        findViewById(R.id.button_redCard).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_greenCard).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_blueCard).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_blackCard).setOnClickListener(buttonClickListener);

    }
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_redCard:
                    Intent intentDPT = new Intent(deadPixelTestActivity.this, redFull.class);
                    startActivity(intentDPT);
                    break;
                case R.id.button_greenCard:
                    Intent intentDPT2 = new Intent(deadPixelTestActivity.this, greenFull.class);
                    startActivity(intentDPT2);
                    break;
                case R.id.button_blueCard:
                    Intent intentDPT3 = new Intent(deadPixelTestActivity.this, blueFull.class);
                    startActivity(intentDPT3);
                    break;
                case R.id.button_blackCard:
                    Intent intentDPT4 = new Intent(deadPixelTestActivity.this, blackFull.class);
                    startActivity(intentDPT4);
                    break;
            }
        }
    };
}
