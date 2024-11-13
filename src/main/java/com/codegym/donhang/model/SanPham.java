package com.codegym.donhang.model;
import jakarta.persistence.*;
@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sp")
    private Long maSp;

    @Column(name = "ten_sp")
    private String tenSp;

    @Column(name = "gia_sp")
    private String giaSp;

    @Column(name = "tinh_trang_sp")
    private String tinhTrangSp;

    @ManyToOne
    @JoinColumn(name = "ma_loai_sp")
    private LoaiSanPham loaiSanPham;

    // Getters and setters
    public Long getMaSp() {
        return maSp;
    }

    public void setMaSp(Long maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(String giaSp) {
        this.giaSp = giaSp;
    }

    public String getTinhTrangSp() {
        return tinhTrangSp;
    }

    public void setTinhTrangSp(String tinhTrangSp) {
        this.tinhTrangSp = tinhTrangSp;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }
}
