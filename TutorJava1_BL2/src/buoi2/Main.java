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
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer chucNang = 0;
        QlLopHoc qlLopHoc = new QlLopHoc();
        List<LopHoc> listLopHoc = new ArrayList<>();
        do {
            System.out.println("1.nhap thong tin");
            System.out.println("2.xuat thong tin");
            System.out.print("moi ban nhap chuc nang: ");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1:
                    qlLopHoc.nhapTT(listLopHoc);
                    break;
                case 2:
                    qlLopHoc.xuatTT(listLopHoc);
                    break;
                default:
                    System.out.print("chuc nang khong ton tai, moi ban nhap lai ");
            }
            
        } while (chucNang != 0);
    }
}
