package com.example.lab03_android;

import java.io.Serializable;

public class DienThoai implements Serializable {
    private String mau;
    private String gia;
    private String ten;
    private int hinh;

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public DienThoai(String mau, String gia, String ten, int hinh) {
        this.mau = mau;
        this.gia = gia;
        this.ten = ten;
        this.hinh = hinh;
    }
    public DienThoai() {

    }
}
