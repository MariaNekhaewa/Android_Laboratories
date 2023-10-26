package com.example.mobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startPhotoActivity(View v) {
        Intent intent = new Intent(this, MainActivityPhoto.class);
        startActivity(intent);
    }
    public void startListActivity(View v) {
        Intent intent = new Intent(this, MainActivityList.class);
        startActivity(intent);
    }
}