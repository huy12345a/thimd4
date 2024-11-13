package com.codegym.donhang.model;
import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;
import java.util.Set;

@Entity
@Table(name = "loai_san_pham")
public class LoaiSanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_loai_sp")
    private Long maLoaiSp;

    @Column(name = "ten_loai_sp")
    private String tenLoaiSp;

    @OneToMany(mappedBy = "loaiSanPham", cascade = CascadeType.ALL)
    private Set<SanPham> sanPhams;

    // Getters and setters
    public Long getMaLoaiSp() {
        return maLoaiSp;
    }

    public void setMaLoaiSp(Long maLoaiSp) {
        this.maLoaiSp = maLoaiSp;
    }

    public String getTenLoaiSp() {
        return tenLoaiSp;
    }

    public void setTenLoaiSp(String tenLoaiSp) {
        this.tenLoaiSp = tenLoaiSp;
    }

    public Set<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(Set<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }
}
