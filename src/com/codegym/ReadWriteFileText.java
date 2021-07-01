package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileText {

    public static void writeFile(String path, List<SinhVien> products) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "Id,Name, Age, Gender, Address, Average";
            bufferedWriter.write(str);
            for (SinhVien s : products) {
                bufferedWriter.newLine();
                bufferedWriter.write(s.write());

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }

    public static List<SinhVien> readFile(String path) throws IOException {
        BufferedReader bufferedReader = null;
        List<SinhVien> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 4) {
                    list.add(new SinhVien(str[0], str[1], str[2], str[3], str[4], Double.parseDouble(str[5])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }

        return list;
    }
}
