/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi4;

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
        List<NguoiYeuCu> list = new ArrayList<>();
        QlNguoiYeuCu ql = new QlNguoiYeuCu();
        ql.fakeData(list);
        do {
            System.out.println("-----Menu------");
            System.out.println("1.nhapTT");
            System.out.println("2.xuatTT");
            System.out.println("3.tim kiem theo ten");
            System.out.println("4.tim kiem ten co chu l ");
            System.out.println("5.sort theo tuoi ");
            System.out.println("moi ban chon chuc nang:  ");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1:
                    ql.nhapTT(list);
                    break;
                case 2:
                    ql.xuatTT(list);
                    break;
                case 3:
                    ql.searchTen(list);
                    break;
                case 4:
                    ql.searchName(list);
                    break;
                 case 5:
                   ql.sort(list);
                    break;
                default:
                    System.out.println("chuc nang khong ton tai.moi ban nhap lai  ");
            }
            
        } while (chucNang != 0);
    }
}
