package com.example.classwork5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;
    ImageView iv;
    int i;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib = findViewById(R.id.imageButton);
        iv = findViewById(R.id.iv);
    }

    public void go(View view) {
        Random rnd = new Random();
        int y = rnd.nextInt(3) + 1;
        switch (y) {
            case 1:
                iv.setImageResource(R.drawable.num1);
                ib.setImageResource(R.drawable.num1a);
                ;
                break;
            case 2:
                iv.setImageResource(R.drawable.num2);
                ib.setImageResource(R.drawable.num2a);
                break;
            case 3:
                iv.setImageResource(R.drawable.num3);
                ib.setImageResource(R.drawable.num3a);
                break;
        }
    }
}