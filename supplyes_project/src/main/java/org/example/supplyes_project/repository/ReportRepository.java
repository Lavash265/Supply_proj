package org.example.supplyes_project.repository;

import org.example.supplyes_project.models.ReportEntry;

import java.util.Date;
import java.util.List;

public interface ReportRepository {
    List<ReportEntry> generateReportByDateRange(Date startDate, Date endDate);

    List<ReportEntry> generateReportByDateRange(String startDate, String endDate);
}
