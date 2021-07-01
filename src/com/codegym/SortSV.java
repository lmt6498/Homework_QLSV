package com.codegym;

import java.util.Comparator;

public class SortSV implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.getHoTenSV().compareTo(o2.getHoTenSV());
    }
}
