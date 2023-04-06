/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class QlNhanVien {

    private Scanner sc = new Scanner(System.in);

    public void nhapTT(List<NhanVien> listNhanVien) {
        while (true) {
            System.out.println("nhap id: ");
            Integer id = Integer.valueOf(sc.nextLine());
            System.out.println("nhap ten: ");
            String ten = sc.nextLine();
            System.out.println("nhap ma: ");
            String ma = sc.nextLine();
            System.out.println("nhap tuoi: ");
            Integer tuoi = Integer.valueOf(sc.nextLine());
            System.out.println("nhap gioi tinh: ");
            Boolean gioiTinh = Boolean.valueOf(sc.nextLine());
            System.out.println("nhap so gio lam: ");
            Integer soGioLam = Integer.valueOf(sc.nextLine());
            System.out.println("nhap trang thai: ");
            Boolean trangThai = Boolean.valueOf(sc.nextLine());
            System.out.println("nhap luong: ");
            Float luong = Float.valueOf(sc.nextLine());

            NhanVien nv = new NhanVien(id, ma, ten, tuoi,
                    trangThai, luong, soGioLam, gioiTinh);
            listNhanVien.add(nv);

            System.out.print("ban co muon nhap tiep hay khong(y/n):");
            String chon = sc.nextLine();
            if (chon.equals("n")) {
                break;
            }
        }

    }

    public void xuatTT(List<NhanVien> listNhanVien) {
        for (NhanVien o : listNhanVien) {
            o.inThongTin();
        }
        // c2
//        listNhanVien.forEach(o-> o.inThongTin());
    }

    public void sort(List<NhanVien> listNhanVien) {
//       Collections.sort(listNhanVien, (o1, o2) -> o1.getTuoi() - o2.getTuoi());
         listNhanVien.sort(Comparator.comparingInt(NhanVien::getTuoi));
//        Comparator<NhanVien> comparator = new Comparator<NhanVien>() {
//            @Override
//            public int compare(NhanVien o1, NhanVien o2) {
//                return o2.getTuoi() - o1.getTuoi();
//            }
//
//        };
//        Collections.sort(listNhanVien, comparator);
        this.xuatTT(listNhanVien);
    }

    public void fakeData(List<NhanVien> listNhanVien) {
        listNhanVien.add(new NhanVien(1,
                "ph1", "qqq", 23,
                Boolean.TRUE, Float.valueOf("23"),
                2, Boolean.TRUE));
        listNhanVien.add(new NhanVien(1,
                "ph2", "qqq", 3,
                Boolean.TRUE, Float.valueOf("23"),
                2, Boolean.TRUE));
        listNhanVien.add(new NhanVien(1,
                "ph3", "qqq", 24,
                Boolean.TRUE, Float.valueOf("23"),
                2, Boolean.TRUE));
    }
}
