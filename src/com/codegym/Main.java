package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Manage manageSV = new Manage();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN-----");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Exit");
            System.out.println("Enter choise: ");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("Danh sách sinh viên");
                    manageSV.show();
                    break;
                case 2:
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
                    manageSV.addSV(maSV, hoTen, tuoiSV, gioiTinh, diaChi, diemTB);
                    break;
                case 3:
                    System.out.println("Nhập tên sinh viên cần sửa:");
                    String suaTen = sc.nextLine();
                    manageSV.updateSV(suaTen);
                    break;
                case 4:
                    manageSV.deleteSV();
                    break;
                case 5:
                    System.out.println("Sắp xếp....");
                    manageSV.sortSV();
                    manageSV.show();
                    break;
                case 6:
                    System.out.println("Đọc từ file....");
                    manageSV.read();
                    break;
                case 7:
                    System.out.println("Ghi vào file.....");
                    manageSV.write();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
