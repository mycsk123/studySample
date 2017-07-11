package org.androidtown.samplelinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main2);
        //setContentView(R.layout.gravity);
        //setContentView(R.layout.baseline);
        //setContentView(R.layout.padding);
        setContentView(R.layout.weight);
    }
}
