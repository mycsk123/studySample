package org.androidtown.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //만든 버튼 클릭 시 반응
    public void onButton1Clicked(View v){
        Toast.makeText(getApplicationContext(), "시작 버튼이 눌렸어요", Toast.LENGTH_SHORT).show();
    }
}
