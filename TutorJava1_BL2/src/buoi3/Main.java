/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

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
        QlNhanVien qlNhanVien = new QlNhanVien();
        List<NhanVien> listNhanVien = new ArrayList<>();
         qlNhanVien.fakeData(listNhanVien);
        do {
            System.out.println("1.nhapTT");
            System.out.println("2.xuatTT");
            System.out.println("3.sort");
            System.out.print("moi ban chon chuc nang: ");
            chucNang = Integer.valueOf(sc.nextLine());
            
            switch (chucNang) {
                case 1:
                    qlNhanVien.nhapTT(listNhanVien);
                    break;
                case 2:
                    qlNhanVien.xuatTT(listNhanVien);
                    break;
                case 3:
                    qlNhanVien.sort(listNhanVien);
                    break;
                default:
                    System.out.println("chuc nang khong ton tai");
            }
        } while (chucNang != 0);
    }
}
