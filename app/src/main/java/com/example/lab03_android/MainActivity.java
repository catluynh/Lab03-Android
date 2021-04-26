package com.example.lab03_android;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnChonMau;
    private TextView tvGia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);
        TextView price=findViewById(R.id.txPrice);

        SpannableString string = new SpannableString("1.790.000 đ");
        string.setSpan(new StrikethroughSpan(), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        price.setText(string);

        clickButtonXong();


    }

    private void clickButtonXong() {
        btnChonMau =findViewById(R.id.btnChonMau);
        btnChonMau.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Screen2.class);
                startActivityForResult(intent,123);

            }
        });
        Intent intent = getIntent();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode== Activity.RESULT_OK && requestCode==123){
            DienThoai dt= (DienThoai) data.getSerializableExtra("dt");
            tvGia.setText(dt.getGia());
        }
    }
}