package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeToFile(String path, List<SinhVien> products){
        try {
            FileOutputStream fos = new FileOutputStream(path,false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static ArrayList<SinhVien> readDataFromFile(String path){
        ArrayList<SinhVien> sinhVien = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            sinhVien = (ArrayList<SinhVien>) ois.readObject();
            System.out.println(sinhVien);
            ois.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return sinhVien;
    }
}
