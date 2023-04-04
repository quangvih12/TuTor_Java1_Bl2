/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class LopHoc {

    // thuoc tinh: maLop, tenLop, dienTich, diaDiemLopHoc 
    private String maLop;

    private String tenLop;

    private Integer dienTich;

    private String diaDiemLop;

    public LopHoc(String maLop, String tenLop, Integer dienTich, String diaDiemLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.dienTich = dienTich;
        this.diaDiemLop = diaDiemLop;
    }

    public LopHoc() {
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public Integer getDienTich() {
        return dienTich;
    }

    public void setDienTich(Integer dienTich) {
        this.dienTich = dienTich;
    }

    public String getDiaDiemLop() {
        return diaDiemLop;
    }

    public void setDiaDiemLop(String diaDiemLop) {
        this.diaDiemLop = diaDiemLop;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "maLop=" + maLop + ", tenLop=" + tenLop + ", dienTich=" + dienTich + ", diaDiemLop=" + diaDiemLop + '}';
    }
  
}
