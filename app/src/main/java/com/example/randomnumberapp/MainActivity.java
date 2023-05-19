package com.example.randomnumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button);
        TextView tv = (TextView) findViewById(R.id.textView);
        Random r = new Random();
        Set<Integer> temp = new HashSet<Integer>();

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int n;
                int bound=11;
                n = r.nextInt(bound);
                while(temp.contains(n) && temp.size() != bound){
                    n = r.nextInt(bound);
                }
                if(temp.size() == bound){
                    tv.setText("All the numbers are completed.");
                }else {
                    temp.add(n);
                    tv.setText(n + "");
                }
            }
        });
    }
}