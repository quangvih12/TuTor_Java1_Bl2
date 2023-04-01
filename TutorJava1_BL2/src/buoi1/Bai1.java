package buoi1;

import java.util.Scanner;

public class Bai1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // tạo đối tượng
        Bai1 b1 = new Bai1();

        System.out.println("1.bai1");
        System.out.println("2.bai2");
        System.out.println("3.bai3");
        System.out.println("4.bai4");
        System.out.println("moi ban nhap chuc nang: ");
        int chucNang = Integer.valueOf(sc.nextLine());
        switch (chucNang) {
            case 1:
                b1.nhapTT();
                break;

            case 2:
                b1.tinhToan();
                break;
            case 3:
          b1.tinhTongSoChan();
                break;
            case 4:

                break;
            default:
                System.out.println("chuc nang khong ton tai");
        }
    }

    //  Viết chương trình nhập thông tin gồm: Tên, tuổi , địa chỉ, điểm và 
    //trường học của bản thân. Sau đó, in ra tất cả thông tin đã nhập
    public void nhapTT() {
        System.out.println("nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("nhap tuoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("nhap diem: ");
        int diem = Integer.valueOf(sc.nextLine());
        System.out.println("nhap truong hoc: ");
        String truongHoc = sc.nextLine();

        // in thong tin
        System.out.println("===================");
        System.out.println("ten vua nhap la: " + ten);
        System.out.println("tuoi vua nhap la: " + tuoi);
        System.out.println("dia chi vua nhap la: " + diaChi);
        System.out.println("diem vua nhap la: " + diem);
        System.out.println("truong hoc vua nhap la: " + truongHoc);
    }

//    Viết chương trình nhập 2 số dương a và b. 
//    Tính tổng, hiệu, tích và thương. Sau đó, in kết quả ra màn hình
    public void tinhToan() {
        // nhap 2 so
        System.out.println("moi nhap so a: ");
        double a = Double.valueOf(sc.nextLine());
        System.out.println("moi nhap so b: ");
        double b = Double.valueOf(sc.nextLine());

        // tinh toan
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = a / b;

        // in ket qua
        System.out.println("tong: " + tong);
        System.out.println("hieu: " + hieu);
        System.out.println("tich: " + tich);
        System.out.println("thuong: " + thuong);

    }
//    Viết chương trình nhập số nguyên dương n 
//        (0 < n < 20). Tính tổng các số CHẴN từ 1 -> n

    public void tinhTongSoChan() {
         System.out.println("nhap n: ");
         Integer n = Integer.valueOf(sc.nextLine());
         
         Integer tong = 0;
         for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                tong += i;
            }
        }
         System.out.println("tong= "+ tong);
    }

}
