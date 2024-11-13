package com.codegym.donhang.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "don_hang")
public class DonHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_don_hang")
    private Long maDonHang;

    @Column(name = "ngay_mua")
    private Date ngayMua;

    @Column(name = "ss_luong")
    private int ssLuong;

    @ManyToOne
    @JoinColumn(name = "ma_sp")
    private SanPham sanPham;

    // Getters and setters
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

    public int getSsLuong() {
        return ssLuong;
    }

    public void setSsLuong(int ssLuong) {
        this.ssLuong = ssLuong;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
}

