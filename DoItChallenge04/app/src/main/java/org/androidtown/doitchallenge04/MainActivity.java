package org.androidtown.doitchallenge04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt;
    TextView textView;
    Button btnSend;

    String dataString;
    int edtLength;
    int edt_MaxLength = 80;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = (EditText)findViewById(R.id.edt);
        textView = (TextView)findViewById(R.id.textView);

        btnSend = (Button)findViewById(R.id.btnSend);


        edt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                edtLength = edt.getText().toString().getBytes().length;
                String temp = String.valueOf(edtLength) + "/80 바이트";
                textView.setText(temp);
            }
        });

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtLength > edt_MaxLength)
                {
                    Toast.makeText(getApplicationContext(), "글자수가 초과하였습니다.", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(getApplicationContext(), edt.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
