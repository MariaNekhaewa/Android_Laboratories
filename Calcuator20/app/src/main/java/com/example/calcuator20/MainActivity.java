package com.example.calcuator20;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView tVres;
    private EditText eT_number1, eT_number2;
    private RadioButton btnadd, btnsub, btnmult, btndivid;
    private Button button;
    private CheckBox cBox;
    private RadioGroup operation_group;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tVres = findViewById(R.id.tVres);
        eT_number1 = findViewById(R.id.eT_number1);
        eT_number2 = findViewById(R.id.eT_number2);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmult = findViewById(R.id.btnmult);
        btndivid = findViewById(R.id.btndivid);
        button = findViewById(R.id.button);
        cBox = findViewById(R.id.cBox);
        operation_group = findViewById(R.id.operation_group);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(eT_number1.getText().toString());
                double num2 = Double.parseDouble(eT_number2.getText().toString());
                double result = 0;// получили данные

                int selectedOperation = operation_group.getCheckedRadioButtonId();
                if (selectedOperation == btnadd.getId()) {
                    result = num1 + num2;
                } else if (selectedOperation == btnsub.getId()) {
                    result = num1 - num2;

                } else if (selectedOperation == btnmult.getId()) {
                    result = num1 * num2;
                } else if (selectedOperation == btndivid.getId()) {
                    if (num2 == 0) {
                        tVres.setText("На ноль делить нельзя");
                    }
                    result = num1 / num2;
                }
                tVres.setText("Результат:" + result);
            }
        });
    }
}