/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

/**
 *
 * @author asus_vinh
 */
public class NhanVien {

    // id , ma , ten , tuoi, trang thai, luong, so gio lam, gioi tinh
    private Integer id;

    private String ma;

    private String ten;

    private Integer tuoi;

    private Boolean trangThai;

    private Float luong;

    private Integer soGioLam;

    private Boolean gioiTinh;

    public NhanVien() {
    }

    public NhanVien(Integer id, String ma, String ten, Integer tuoi, Boolean trangThai, Float luong, Integer soGioLam, Boolean gioiTinh) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.trangThai = trangThai;
        this.luong = luong;
        this.soGioLam = soGioLam;
        this.gioiTinh = gioiTinh;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    public Integer getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(Integer soGioLam) {
        this.soGioLam = soGioLam;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void inThongTin() {
        System.out.println("id: " + id
                + " || ma: " + ma
                + " || ten: " + ten
                + " || tuoi: " + tuoi
                + " || trang thai: " + (trangThai == true ? "van con lam" : "da nghi")
                + " || luong: " + luong
                + " || so gio lam: " + soGioLam
                + " || gioi tinh: " + (gioiTinh == true ? "nam" : "nu"));
    }
}
