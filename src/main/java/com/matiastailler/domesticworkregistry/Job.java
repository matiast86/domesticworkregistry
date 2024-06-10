package com.matiastailler.domesticworkregistry;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Job {
    private Long id;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Double hoursWorked;
    private Double hourlyRate;
    private Double partialFee;
    private Double transportationFee;
    private Double totalFee;
    private Employer employer;
    private Employee employee;

    public Job(Long id, Employer employer, Employee employee, LocalDate date, LocalTime startTime, LocalTime endTime, Double hourlyRate, Double transportationFee) {
        this.id = id;
        this.employer = employer;
        this.employee = employee;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hourlyRate = hourlyRate;
        this.transportationFee = transportationFee;
        calculateHoursWorked();
        calculatePartialFee();
        calculateTotalFee();
    }

    private void calculateHoursWorked() {
        long minutes = ChronoUnit.MINUTES.between(startTime, endTime);
        double fractionalHours = minutes / 60.0; // Convert minutes to hours

        // Round up to the nearest half hour
        this.hoursWorked = Math.ceil(fractionalHours * 2) / 2;
    }

    private void calculatePartialFee() {
        this.partialFee = this.hoursWorked * this.hourlyRate;
    }

    private void calculateTotalFee() {
        this.totalFee = this.partialFee + this.transportationFee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
        calculateHoursWorked();
        calculatePartialFee();
        calculateTotalFee();
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
        calculateHoursWorked();
        calculatePartialFee();
        calculateTotalFee();
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    // No setter for hoursWorked because it's calculated

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
        calculatePartialFee();
        calculateTotalFee();
    }

    public Double getPartialFee() {
        return partialFee;
    }

    // No setter for partialFee because it's calculated

    public Double getTransportationFee() {
        return transportationFee;
    }

    public void setTransportationFee(Double transportationFee) {
        this.transportationFee = transportationFee;
        calculateTotalFee();
    }

    public Double getTotalFee() {
        return totalFee;
    }

    // No setter for totalFee because it's calculated

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
