package com.codegym.donhang.controller;

import com.codegym.donhang.service.DonHangService;
import com.codegym.donhang.service.DonHangDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class DonHangController {

    @Autowired
    private DonHangService donHangService;

    @GetMapping("/donhang")
    public String showDonHangPage(Model model) {
        model.addAttribute("donHangList", donHangService.getTopDonHangs(10)); // Hiển thị top 10 đơn hàng
        return "donhang";
    }

    @GetMapping("/donhang/filter")
    public String filterDonHang(
            @RequestParam("startDate") String startDateStr,
            @RequestParam("endDate") String endDateStr,
            @RequestParam("limit") int limit,
            Model model) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = sdf.parse(startDateStr);
            Date endDate = sdf.parse(endDateStr);
            List<DonHangDTO> donHangList = donHangService.getTopDonHangs(limit);

            model.addAttribute("donHangList", donHangList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "donhang";
    }
}

