/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi4;

/**
 *
 * @author asus_vinh
 */
public class NguoiYeuCu {
    // ten, tuoi, gioi tinh, chieuCao, canNang, sdt, v1,v2,v3
    private String ten;
    
    private Integer tuoi;
    
    private Boolean gioiTinh;
    
    private Integer chieuCao;
    
    private Integer canNang;
    
    private String sdt;
    
     private Integer v1;
     
     private Integer v2;
     
     private Integer v3;

    public NguoiYeuCu() {
    }

    public NguoiYeuCu(String ten, Integer tuoi, Boolean gioiTinh, Integer chieuCao, Integer canNang, String sdt, Integer v1, Integer v2, Integer v3) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
        this.sdt = sdt;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(Integer chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Integer getCanNang() {
        return canNang;
    }

    public void setCanNang(Integer canNang) {
        this.canNang = canNang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Integer getV1() {
        return v1;
    }

    public void setV1(Integer v1) {
        this.v1 = v1;
    }

    public Integer getV2() {
        return v2;
    }

    public void setV2(Integer v2) {
        this.v2 = v2;
    }

    public Integer getV3() {
        return v3;
    }

    public void setV3(Integer v3) {
        this.v3 = v3;
    }
    // ten, tuoi, gioi tinh, chieuCao, canNang, sdt, v1,v2,v3
     public void inThongTin(){
         System.out.println("ten: "+ten
          + " || tuoi: "+tuoi
          + " || gioiTinh: "+gioiTinh
          + " || chieuCao: "+chieuCao
          + " || canNang: "+canNang
          + " || sdt: "+sdt
          + " || v1: "+v1
          + " || v2: "+v2
          + " || v3: "+v3
         );
     }
}
