package com.linkindia.mpcolorratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.linkindia.colorratingbar.ColorRatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorRatingBar colorRatingBar = new ColorRatingBar(this);
        colorRatingBar.setRatingProgressColor(R.color.colorPrimary);
        colorRatingBar.setRatingEmptyColor(R.color.colorAccent);
        colorRatingBar.setRating(3.0f);
    }
}