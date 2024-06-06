package org.example.supplyes_project.service;

import org.example.supplyes_project.models.ReportEntry;
import org.example.supplyes_project.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Service
@Transactional
public class ReportService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public List<ReportEntry> generateReportByDateRange(Calendar startDate, Calendar endDate) {
        return deliveryRepository.generateReportByDateRange(startDate, endDate);
    }
}
