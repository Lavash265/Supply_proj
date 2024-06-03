package org.example.supplyes_project.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ReportEntry {
    private String supplierName;
    private String fruitName;
    private double totalWeight;
    private double totalCost;
}
