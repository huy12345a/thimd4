package com.codegym.donhang.service;
import com.codegym.donhang.model.DonHang;
import com.codegym.donhang.repository.DonHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonHangService {

    @Autowired
    private DonHangRepository donHangRepository;

    // Lấy danh sách đơn hàng trong khoảng thời gian từ ngày bắt đầu đến ngày kết thúc
    public List<DonHang> getDonHangsByDateRange(java.util.Date startDate, java.util.Date endDate) {
        return donHangRepository.findByNgayMuaBetween(startDate, endDate);
    }

    // Lấy top N đơn hàng có tổng tiền cao nhất
    public List<DonHangDTO> getTopDonHangs(int limit) {
        return donHangRepository.findAll()
                .stream()
                .map(donHang -> {
                    // Tính tổng tiền
                    double giaSp = Double.parseDouble(donHang.getSanPham().getGiaSp());
                    double tongTien = giaSp * donHang.getSsLuong();
                    return new DonHangDTO(
                            donHang.getMaDonHang(),
                            donHang.getSanPham().getTenSp(),
                            donHang.getSanPham().getGiaSp(),
                            donHang.getSanPham().getLoaiSanPham().getTenLoaiSp(),
                            donHang.getNgayMua(),
                            donHang.getSsLuong(),
                            tongTien
                    );
                })
                .sorted((d1, d2) -> Double.compare(d2.getTongTien(), d1.getTongTien()))
                .limit(limit)
                .toList();
    }
}
