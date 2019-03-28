package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Integer> eightBalls = new ArrayList<>();
    private Random rand = new Random();
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // view references
        final ImageView eightBall = findViewById(R.id.img_eightBall);
        Button btnAsk = findViewById(R.id.btn_ask);

        // initialize list of images
        eightBalls.add(R.drawable.ball1);
        eightBalls.add(R.drawable.ball2);
        eightBalls.add(R.drawable.ball3);
        eightBalls.add(R.drawable.ball4);
        eightBalls.add(R.drawable.ball5);

        // button click handler
        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get a random number
                number = rand.nextInt(5);

                // display the image
                eightBall.setImageResource(eightBalls.get(number));
            }
        });
    }
}
