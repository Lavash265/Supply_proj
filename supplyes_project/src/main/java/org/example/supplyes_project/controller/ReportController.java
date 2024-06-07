package org.example.supplyes_project.controller;


import org.example.supplyes_project.models.ReportEntry;
import org.example.supplyes_project.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/summary")
    public List<ReportEntry> generateReportByDateRange(
            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Calendar startDate,
            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Calendar endDate) {
        return reportService.generateReportByDateRange(startDate, endDate);
    }
}
