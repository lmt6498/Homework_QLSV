package com.codegym;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Manage {
    List<SinhVien> sinhVien = ReadWriteFile.readDataFromFile("E:\\JavaProject\\Homework_QLSV\\src\\DanhSachSV.csv");
    static Scanner sc = new Scanner(System.in);
    static SortSV sortSV = new SortSV();

    public void show() {
        for (SinhVien s : sinhVien) {
            s.display();
        }
    }

    public void addSV(String maSV, String hoTenSV, String tuoiSV, String gioiTinh, String diaChi, double diemTB) {
        sinhVien.add(new SinhVien(maSV, hoTenSV, tuoiSV, gioiTinh, diaChi, diemTB));
//        ReadWriteFile.writeToFile("src/DanhSachSV.csv", sinhVien);
    }

    public void updateSV(String hoTenSV) {
        for (SinhVien s : sinhVien) {
            if (s.getHoTenSV().equals(hoTenSV)) {
                System.out.println("Nhập mã sinh viên: ");
                String maSV = sc.nextLine();
                System.out.println("Nhập tên sinh viên");
                String hoTen = sc.nextLine();
                System.out.println("Nhập tuổi:");
                String tuoiSV = sc.nextLine();
                System.out.println("Nhập giới tính:");
                String gioiTinh = sc.nextLine();
                System.out.println("Nhập địa chỉ:");
                String diaChi = sc.nextLine();
                System.out.println("Nhập điểm trung bình:");
                double diemTB = Double.parseDouble(sc.nextLine());
                s.setMaSV(maSV);
                s.setHoTenSV(hoTen);
                s.setTuoiSV(tuoiSV);
                s.setGioiTinh(gioiTinh);
                s.setDiaChi(diaChi);
                s.setDiemTB(diemTB);
            }
        }
//        ReadWriteFile.writeToFile("src/DanhSachSV.csv", sinhVien);
    }

    public void deleteSV() {
        System.out.println("Nhập tên sv cần xóa: ");
        String tenSV = sc.nextLine();
        sinhVien.removeIf(x -> x.getHoTenSV().equals(tenSV));
//        ReadWriteFile.writeToFile("src/DanhSachSV.csv", sinhVien);
    }

    public void sortSV() {
        Collections.sort(sinhVien, sortSV);
    }

    public void read(){
        ReadWriteFile.readDataFromFile("src/DanhSachSV.csv");
        System.out.println();
    }

    public void write(){
        ReadWriteFile.writeToFile("src/DanhSachSV.csv", sinhVien);
        System.out.println();
    }


}
