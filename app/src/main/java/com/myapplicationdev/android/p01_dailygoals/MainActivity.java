package com.myapplicationdev.android.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    RadioGroup rg1,rg2,rg3;
    EditText et;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv3);
        tv3 = findViewById(R.id.tv5);
        tv4 = findViewById(R.id.tv7);

        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);

        et = findViewById(R.id.et);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb1 = findViewById(rg1.getCheckedRadioButtonId());
                RadioButton rb2 = findViewById(rg2.getCheckedRadioButtonId());
                RadioButton rb3 = findViewById(rg3.getCheckedRadioButtonId());

                String[] second = {
                        tv1.getText().toString() + "\n" + rb1.getText().toString(),
                        tv2.getText().toString() + "\n" + rb2.getText().toString(),
                        tv3.getText().toString() + "\n" + rb3.getText().toString(),
                        tv4.getText().toString() + "\n" + et.getText().toString(),
                };
                Intent i = new Intent(MainActivity.this, SecondAcitivity.class);

                i.putExtra("second", second);

                startActivity(i);
            }
        }};
}
