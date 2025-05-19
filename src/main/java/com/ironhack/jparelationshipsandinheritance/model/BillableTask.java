package com.ironhack.jparelationshipsandinheritance.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class BillableTask extends Task {
    private BigDecimal hourlyRate;

    public BillableTask() {}

    public BillableTask(String title, LocalDate date, boolean completed, BigDecimal hourlyRate) {
        super(title, date, completed);
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}