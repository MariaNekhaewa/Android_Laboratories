package com.example.mobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityPhoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_photo);
    }

    public void goBackPhoto(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}