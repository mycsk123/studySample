package org.androidtown.chap03_sampleintent;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //기본
//    public void onButton1Clicked(View v){
//        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
//        startActivityForResult(intent, REQUEST_CODE_MENU);
//
//    }

    //변경
    public void onButton1Clicked(View v){
        Intent intent = new Intent();

        ComponentName name = new ComponentName("org.androidtown.chap03_sampleintent",
                "org.androidtown.chap03_sampleintent.MenuActivity");
        intent.setComponent(name);
        startActivityForResult(intent, REQUEST_CODE_MENU);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE_MENU)
        {
            Toast.makeText(getApplicationContext(),
                    "onActivityResult 메소드 호출됨, 요청코드 : " + requestCode +
                    ", 결과코드 : " + resultCode, Toast.LENGTH_LONG).show();

            if(resultCode == RESULT_OK)
            {
                String name = data.getExtras().getString("name");
                Toast.makeText(getApplicationContext(), "응답으로 전달된 name : " + name,
                        Toast.LENGTH_LONG).show();
            }
        }

    }
}
