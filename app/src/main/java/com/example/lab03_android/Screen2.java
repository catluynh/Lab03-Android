package com.example.lab03_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Screen2 extends AppCompatActivity {
    private ImageButton btnDo;
    private ImageButton btnDen;
    private ImageButton btnXanhDuong;
    private ImageButton btnXanh;
    private ArrayList<DienThoai> listDT;
    private TextView tvGia;
    private TextView tvMau;
    private TextView tvTen;
    private ImageView imgHinh;
    private Button btnXong;
    private DienThoai dienThoai=new DienThoai();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        Intent intent = getIntent();
        String st =  intent.getStringExtra("key");
        Log.d("","");
        connectButton();
        DsDienThoai();
        connectTextView();
        ClickButton();

        btnXong= findViewById(R.id.btnXong);
        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent= getIntent();
            intent.putExtra("dt",dienThoai);
            //intent.putExtra("hinh",imgHinh.get

                setResult(Activity.RESULT_OK,intent);
            finish();
            }
        });

    }

    private void ClickButton() {
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dienThoai.setHinh(R.drawable.vs_red_a2);
                dienThoai.setGia("1.890.000 đ");
                dienThoai.setMau("Đỏ");
                dienThoai.setTen("Vsmart Đỏ");
                imgHinh.setImageResource(R.drawable.vs_red_a2);
                tvMau.setText(dienThoai.getMau());
                tvGia.setText(dienThoai.getGia());
                tvTen.setText(dienThoai.getTen());

            }
        });
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dienThoai.setHinh(R.drawable.vs_bac1);
                dienThoai.setGia("1.790.000 đ");
                dienThoai.setMau("Đen");
                dienThoai.setTen("Vsmart Đen");
                imgHinh.setImageResource(R.drawable.vs_bac1);
                tvMau.setText(dienThoai.getMau());
                tvGia.setText(dienThoai.getGia());
                tvTen.setText(dienThoai.getTen());
            }
        });
        btnXanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dienThoai.setHinh(R.drawable.rectangle_xanh);
                dienThoai.setGia("1.690.000 đ");
                dienThoai.setMau("Xanh nhạt");
                dienThoai.setTen("Vsmart Xanh nhạt");
                imgHinh.setImageResource(R.drawable.rectangle_xanh);
                tvMau.setText(dienThoai.getMau());
                tvGia.setText(dienThoai.getGia());
                tvTen.setText(dienThoai.getTen());
            }
        });
        btnXanhDuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dienThoai.setHinh(R.drawable.vsmart_live_xanh1);
                dienThoai.setGia("1.990.000 đ");
                dienThoai.setMau("Xanh dương");
                dienThoai.setTen("Vsmart Xanh dương");
                imgHinh.setImageResource(R.drawable.vsmart_live_xanh1);
                tvMau.setText(dienThoai.getMau());
                tvGia.setText(dienThoai.getGia());
                tvTen.setText(dienThoai.getTen());
            }
        });
    }

    private void DsDienThoai() {
        listDT=new ArrayList<>();
        listDT.add(new DienThoai("Đỏ","1.890.000 đ","Vsmart Đỏ",R.drawable.vs_red_a2));
        listDT.add(new DienThoai("Đen","1.790.000 đ","Vsmart Đen",R.drawable.vsmart_black_star1));
        listDT.add(new DienThoai("Xanh nhạt","1.690.000 đ","Vsmart Xanh nhạt",R.drawable.vs_bac1));
        listDT.add(new DienThoai("Xanh dương","1.790.000 đ","Vsmart Xanh dương",R.drawable.vsmart_live_xanh1));
    }

    private void connectButton() {
        btnDo = (ImageButton) findViewById(R.id.btnDo);
        btnDen =(ImageButton) findViewById(R.id.btnDen);
        btnXanh =(ImageButton) findViewById(R.id.btnXanh);
        btnXanhDuong =(ImageButton) findViewById(R.id.btnXanhDuong);
    }

    public void connectTextView(){
         tvMau=findViewById(R.id.tvMau);
         tvGia=findViewById(R.id.tvGia);
         tvTen=findViewById(R.id.tvTen);
         imgHinh=findViewById(R.id.imgDt);


    }
}
