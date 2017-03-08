package com.afeastoffriends.doctorsaathi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mr Mojo Risin on 3/5/2017.
 */

public class FADetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent  = getIntent();

        String text = intent.getStringExtra("Message");
        String title = intent.getStringExtra("Title");

        setTitle(title);

        TextView textView_1 = (TextView) findViewById(R.id.title_nw);
        TextView textView_2 = (TextView) findViewById(R.id.text_nw);


        textView_1.setText(title);
        textView_1.setTextSize(25);

        textView_2.setText(text);
        textView_2.setTextSize(20);
    }
}
