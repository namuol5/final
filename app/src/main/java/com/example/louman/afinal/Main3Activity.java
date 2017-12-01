package com.example.louman.afinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int level = MainActivity.experience / 2;
        if (level == 0)
            level = 1;

        TextView lblExp = (TextView)findViewById(R.id.lblExp);
        TextView lblLevel = (TextView)findViewById(R.id.lblLevel);


        lblExp.setText("Experience: " + MainActivity.experience);
        lblLevel.setText("Level " + level);
    }
}
