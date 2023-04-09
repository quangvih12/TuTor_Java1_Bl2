/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi4;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class QlNguoiYeuCu {

    private Scanner sc = new Scanner(System.in);

    public void nhapTT(List<NguoiYeuCu> listNguoiYeuCu) {
        while (true) {
            System.out.print("nhap ten: ");
            String ten = sc.nextLine();
            System.out.print("nhap tuoi: ");
            int tuoi = Integer.valueOf(sc.nextLine());
            System.out.print("nhap gioi tinh: ");
            boolean gioiTinh = Boolean.valueOf(sc.nextLine());
            System.out.print("nhap chieu cao: ");
            int chieuCao = Integer.valueOf(sc.nextLine());
            System.out.print("nhap can nang: ");
            int canNang = Integer.valueOf(sc.nextLine());
            System.out.print("nhap sdt: ");
            String sdt = sc.nextLine();
            System.out.print("nhap v1: ");
            int v1 = Integer.valueOf(sc.nextLine());
            System.out.print("nhap v2: ");
            int v2 = Integer.valueOf(sc.nextLine());
            System.out.print("nhap v3: ");
            int v3 = Integer.valueOf(sc.nextLine());

            listNguoiYeuCu.add(new NguoiYeuCu(ten, tuoi, gioiTinh, chieuCao, canNang, sdt, v1, v2, v3));
            
            System.out.print("ban co muon nhap tiep hay ko(1.thoat/2.nhap tiep)");
            int chon = Integer.valueOf(sc.nextLine());
            if(chon == 1){
                break;
            }
        }

    }

    public void xuatTT(List<NguoiYeuCu> listNguoiYeuCu) {
          listNguoiYeuCu.forEach(o->o.inThongTin());
    }
    
     public void searchTen(List<NguoiYeuCu> listNguoiYeuCu) {
         System.out.println("moi nhap ten can tim: ");
         String ten = sc.nextLine();
         boolean check = false;
         for (NguoiYeuCu o : listNguoiYeuCu) {
             if(o.getTen().equals(ten)){
                 o.inThongTin();
                 check = true;
             }
         }
         if(check == false){
             System.out.println("khong tim thay ten: "+ ten);
         }
    }
     
     public void searchName(List<NguoiYeuCu> listNguoiYeuCu){
         for (NguoiYeuCu o : listNguoiYeuCu) {
             if(o.getTen().matches(".*l.*")){
                 o.inThongTin();
             }
         }
     }
     
     public void sort(List<NguoiYeuCu> listNguoiYeuCu){
         Collections.sort(listNguoiYeuCu, (arg0, arg1) -> arg1.getTuoi()- arg0.getTuoi());
         this.xuatTT(listNguoiYeuCu);
     }
     
      public void fakeData(List<NguoiYeuCu> listNguoiYeuCu) {
          listNguoiYeuCu.add(new NguoiYeuCu("linh", 12, Boolean.TRUE, 
                  12, 23, "04235434", 22, 1, 1));
          listNguoiYeuCu.add(new NguoiYeuCu("ha", 13, Boolean.TRUE, 
                  12, 23, "04235434", 22, 1, 1));
          listNguoiYeuCu.add(new NguoiYeuCu("nhi", 1, Boolean.TRUE, 
                  12, 23, "04235434", 22, 1, 1));
          listNguoiYeuCu.add(new NguoiYeuCu("yen", 122, Boolean.TRUE, 
                  12, 23, "04235434", 32, 1, 1));
          listNguoiYeuCu.add(new NguoiYeuCu("minh", 2, Boolean.TRUE, 
                  12, 23, "04235434", 22, 1, 1));
    }
}
