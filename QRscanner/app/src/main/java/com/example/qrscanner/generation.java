package com.example.qrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class generation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generation);
        EditText editText = findViewById(R.id.edit_text);
        Button btn_gen = findViewById(R.id.btn_gen);
        ImageView imageView = findViewById(R.id.img_qr);

        Button btn_back = (Button) findViewById(R.id.btn_startact);

        btn_gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiFormatWriter multiFormatWriter = new MultiFormatWriter();

                try {
                    BitMatrix bitMatrix = multiFormatWriter.encode(editText.getText().toString(), BarcodeFormat.QR_CODE, 300, 300);
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);

                    imageView.setImageBitmap(bitmap);
                }catch (WriterException e){
                    throw new RuntimeException(e) {

                    };
                }
            }
        });

        View.OnClickListener ocBtnBack = new View.OnClickListener() { //возвращает на главную активити
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(generation.this, MainActivity.class);
                startActivity(intent);
            }
        };
        btn_back.setOnClickListener(ocBtnBack);
    }
}