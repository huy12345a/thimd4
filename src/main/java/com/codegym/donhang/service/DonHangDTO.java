package com.codegym.donhang.service;
import java.util.Date;

public class DonHangDTO {

    private Long maDonHang;
    private String tenSanPham;
    private String giaSanPham;
    private String loaiSanPham;
    private Date ngayMua;
    private int soLuong;
    private double tongTien;

    public DonHangDTO(Long maDonHang, String tenSanPham, String giaSanPham, String loaiSanPham, Date ngayMua, int soLuong, double tongTien) {
        this.maDonHang = maDonHang;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.loaiSanPham = loaiSanPham;
        this.ngayMua = ngayMua;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

    public String getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(String giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public Long getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(Long maDonHang) {
        this.maDonHang = maDonHang;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}

