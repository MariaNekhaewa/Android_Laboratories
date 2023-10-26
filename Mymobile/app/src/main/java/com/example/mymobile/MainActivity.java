package com.example.mymobile;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view) {
        TextView mHelloTextView = findViewById(R.id.tVHello); //получение TextView по ID
        EditText mNameEditText = findViewById(R.id.eTName); // получение EditText по ID

        if (mNameEditText.getText().length() == 0) { //проверка, что имя введено
                mHelloTextView.setText("Здравствуй, Мир!");
            } else {
                mHelloTextView.setText("Привет, " + mNameEditText.getText());

        }
    }

}