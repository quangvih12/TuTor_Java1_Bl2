/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class QlLopHoc {
    
    private Scanner sc = new Scanner(System.in);
    
    public void nhapTT(List<LopHoc> list) {
        
        System.out.print("nhap ma: ");
        String ma = sc.nextLine();
        System.out.print("nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("nhap dien tich: ");
        int dienTich = Integer.valueOf(sc.nextLine());
        System.out.print("nhap dia diem lop hoc: ");
        String diaDiemLop = sc.nextLine();

        // cach 1: su dung contrutor co tham so
//        LopHoc lopHoc = new LopHoc(ma, ten, dienTich, diaDiemLop);

        // cach 2: su dung contrutor ko tham so
        LopHoc lopHoc = new LopHoc();
        lopHoc.setMaLop(ma);
        lopHoc.setTenLop(ten);
        lopHoc.setDienTich(dienTich);
        lopHoc.setDiaDiemLop(diaDiemLop);
        
        list.add(lopHoc);
    }
    
    public void xuatTT(List<LopHoc> list) {
        for (LopHoc o : list) {
            System.out.println(o.toString());
        }
    }
}
