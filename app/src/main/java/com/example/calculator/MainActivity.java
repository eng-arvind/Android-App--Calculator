package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue,etSecondValue;
    TextView result;
    ImageView add,sub,multi,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);

        result = findViewById(R.id.etResult);

        add = findViewById(R.id.etAdd);
        sub = findViewById(R.id.etMinus);
        multi = findViewById(R.id.etMultiply);
        div = findViewById(R.id.etDevide);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fvalue,svalue,ans;
                fvalue = Integer.parseInt(etFirstValue.getText().toString());
                svalue = Integer.parseInt(etSecondValue.getText().toString());
                ans = fvalue + svalue;
                result.setText("Ans=" + ans);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fvalue,svalue,ans;
                fvalue = Integer.parseInt(etFirstValue.getText().toString());
                svalue = Integer.parseInt(etSecondValue.getText().toString());
                ans = fvalue - svalue;
                result.setText("Ans=" + ans);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fvalue,svalue,ans;
                fvalue = Integer.parseInt(etFirstValue.getText().toString());
                svalue = Integer.parseInt(etSecondValue.getText().toString());
                ans = fvalue * svalue;
                result.setText("Ans=" + ans);
            }
        });



        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float fvalue,svalue;
                float ans;
                fvalue = Integer.parseInt(etFirstValue.getText().toString());
                svalue = Integer.parseInt(etSecondValue.getText().toString());
                ans = fvalue / svalue;
                result.setText("Ans=" + ans);
            }
        });
    }
}
