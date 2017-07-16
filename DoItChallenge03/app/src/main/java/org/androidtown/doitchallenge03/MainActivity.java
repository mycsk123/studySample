package org.androidtown.doitchallenge03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int whereImage = 0;
    Button btnUp, btnDown;
    ImageView imgTop, imgBotton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUp = (Button)findViewById(R.id.btnTop);
        btnDown = (Button)findViewById(R.id.btnBotton);

        imgTop = (ImageView)findViewById(R.id.imgTop);
        imgBotton = (ImageView)findViewById(R.id.imgBotton);

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgTop.setVisibility(View.VISIBLE);
                imgBotton.setVisibility(View.INVISIBLE);
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgTop.setVisibility(View.INVISIBLE);
                imgBotton.setVisibility(View.VISIBLE);
            }
        });
    }


}
