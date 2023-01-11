package com.nidhi.dicebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private ImageView imgview;
    private ImageView imgview2;
    private TextView txt;
    private TextView txt2;
    private Random myrandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.textView2);
        imgview = findViewById(R.id.imageButton);
        imgview2 = findViewById(R.id.imageButton2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int myRannumber2 = myrandom.nextInt(6) + 1;


                switch (myRannumber2) {
                    case 1:
                        imgview2.setImageResource(R.drawable.dice1);
                        txt2.setText("ONE");
                        break;
                    case 2:
                        imgview2.setImageResource(R.drawable.dice2);
                        txt2.setText("TWO");

                        break;
                    case 3:
                        imgview2.setImageResource(R.drawable.dice3);
                        txt2.setText("THREE");
                        break;
                    case 4:
                        imgview2.setImageResource(R.drawable.dice4);
                        txt2.setText("FOUR");
                        break;
                    case 5:
                        imgview2.setImageResource(R.drawable.dice5);
                        txt2.setText("FIVE");
                        break;
                    case 6:
                        imgview2.setImageResource(R.drawable.dice6);
                        txt2.setText("SIX");
                        break;
                }


                int myRannumber = myrandom.nextInt(6) + 1;


                switch (myRannumber) {
                    case 1:
                        imgview.setImageResource(R.drawable.dice1);
                        txt.setText("ONE");
                        break;
                    case 2:
                        imgview.setImageResource(R.drawable.dice2);
                        txt.setText("TWO");
                        break;
                    case 3:
                        imgview.setImageResource(R.drawable.dice3);
                        txt.setText("THREE");
                        break;
                    case 4:
                        imgview.setImageResource(R.drawable.dice4);
                        txt.setText("FOUR");
                        break;
                    case 5:
                        imgview.setImageResource(R.drawable.dice5);
                        txt.setText("FIVE");
                        break;
                    case 6:
                        imgview.setImageResource(R.drawable.dice6);
                        txt.setText("SIX");
                        break;
                }

            }
        });
        }

    }
