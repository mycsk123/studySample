package org.androidtown.sampleframelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgView1, imgView2;
    int imgIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView1 = (ImageView)findViewById(R.id.imageView1);
        imgView2 = (ImageView)findViewById(R.id.imageView2);

    }

    public void onButton1Clicked(View v){
        changeImage();
    }

    public void changeImage(){
        if(imgIndex == 0)
        {
            imgView1.setVisibility(View.VISIBLE);
            imgView2.setVisibility(View.INVISIBLE);

            imgIndex = 1;
        }else if(imgIndex == 1)
        {
            imgView1.setVisibility(View.INVISIBLE);
            imgView2.setVisibility(View.VISIBLE);

            imgIndex = 0;
        }
    }
}
