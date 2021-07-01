package com.codegym;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String maSV;
    private String hoTenSV;
    private String tuoiSV;
    private String gioiTinh;
    private String diaChi;
    private double diemTB;

    public SinhVien(){

    }
    public SinhVien(String maSV, String hoTenSV, String tuoiSV, String gioiTinh, String diaChi, double diemTB) {
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.tuoiSV = tuoiSV;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public String getTuoiSV() {
        return tuoiSV;
    }

    public void setTuoiSV(String tuoiSV) {
        this.tuoiSV = tuoiSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", hoTenSV='" + hoTenSV + '\'' +
                ", tuoiSV='" + tuoiSV + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }

    public void display (){
        System.out.println("SinhVien{" +
                "maSV='" + getMaSV() + '\'' +
                ", hoTenSV='" + getHoTenSV() + '\'' +
                ", tuoiSV='" + getTuoiSV() + '\'' +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                ", diemTB=" + getDiemTB() +
                '}');
    }
}
