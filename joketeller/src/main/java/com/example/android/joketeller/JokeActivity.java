package com.example.android.joketeller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Gabe on 2016-12-15.
 */
public class JokeActivity extends AppCompatActivity {

    TextView textViewJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = getIntent().getStringExtra("joke");

        textViewJoke = (TextView) findViewById(R.id.textview_joke);
        textViewJoke.setText(joke);
    }
}