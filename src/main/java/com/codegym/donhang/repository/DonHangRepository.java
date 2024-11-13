package com.codegym.donhang.repository;
import com.codegym.donhang.model.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface DonHangRepository extends JpaRepository<DonHang, Long> {
    List<DonHang> findByNgayMuaBetween(Date startDate, Date endDate);
}
