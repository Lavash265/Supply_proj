package org.example.supplyes_project.repository;

import org.example.supplyes_project.models.ReportEntry;

import java.time.LocalDateTime;
import java.util.List;

public interface ReportRepository {
    List<ReportEntry> generateReportByDateRange(LocalDateTime startDate, LocalDateTime endDate);

}
