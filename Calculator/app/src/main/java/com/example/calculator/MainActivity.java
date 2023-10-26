package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTV;
    private EditText et_number_one, et_number_two;
    private Button button_plus, button_minus, button_mult, button_divis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTV = findViewById(R.id.resultTV);
        et_number_one =findViewById(R.id.et_number_one);
        et_number_two = findViewById(R.id.et_number_two);
        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        button_mult = findViewById(R.id.button_mult);
        button_divis = findViewById(R.id.button_divis);


        button_plus.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               float num1 = Float.parseFloat(et_number_one.getText().toString());
                                               float num2 = Float.parseFloat(et_number_two.getText().toString());
                                               float res = num1 + num2;
                                               resultTV.setText(String.valueOf(res));
                                           }
                                       });
            button_minus.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    float num1 = Float.parseFloat(et_number_one.getText().toString());
                                                    float num2 = Float.parseFloat(et_number_two.getText().toString());
                                                    float res = num1 - num2;
                                                    resultTV.setText(String.valueOf(res));
                                                }
                                            });
                button_mult.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       float num1 = Float.parseFloat(et_number_one.getText().toString());
                                                       float num2 = Float.parseFloat(et_number_two.getText().toString());
                                                       float res = num1 * num2;
                                                       resultTV.setText(String.valueOf(res));
                                                   }
                                               });
                    button_divis.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            float num1 = Float.parseFloat(et_number_one.getText().toString());
                            float num2 = Float.parseFloat(et_number_two.getText().toString());
                            float res = num1 / num2;
                            resultTV.setText(String.valueOf(res));
                        }
                    });
        };

    }

