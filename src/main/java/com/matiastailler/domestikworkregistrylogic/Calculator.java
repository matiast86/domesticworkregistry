package com.matiastailler.domestikworkregistrylogic;

import com.matiastailler.domesticworkregistry.Employee;
import com.matiastailler.domesticworkregistry.Employer;
import com.matiastailler.domesticworkregistry.Job;
import com.matiastailler.exceptions.InvalidDataException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calculator {


    //Calculate total hours worked by the same employee

    public Double calculateTotalHours(Employer employer, Employee employee) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        if (employeeJobs.isEmpty()) {
            throw new InvalidDataException("No jobs found for the employee");
        }
        return employeeJobs.stream()
                .mapToDouble(Job::getHoursWorked)
                .sum();
    }

    //Calculate how many hours a certain employee worked in a specific month
    public Double calculateHoursByMonth(Employer employer, Employee employee, int year, int month) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        if (employeeJobs.isEmpty()) {
            throw new InvalidDataException("No jobs found for the employee in the specified month");
        }
        return employeeJobs.stream()
                .filter(job -> job.getDate().getYear() == year && job.getDate().getMonthValue() == month)
                .mapToDouble(Job::getHoursWorked)
                .sum();
    }

    //Calculates the total fee paid to a specific employee
    public Double calculateTotalFee(Employer employer, Employee employee) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        if (employeeJobs.isEmpty()) {
            throw new InvalidDataException("No jobs found for the employee");
        }
        return employeeJobs.stream()
                .mapToDouble(Job::getTotalFee)
                .sum();
    }

    //Calculate total fee in a specific month
    public Double calculateTotalFeeByMonth(Employer employer, Employee employee, int year, int month) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        if (employeeJobs.isEmpty()) {
            throw new InvalidDataException("No jobs found for the employee in the specified month");
        }
        return employeeJobs.stream()
                .filter(job -> job.getDate().getYear() == year && job.getDate().getMonthValue() == month)
                .mapToDouble(Job::getTotalFee)
                .sum();
    }

    //Calculate fee before adding transportation
    public Double calculatePartialFee(Employer employer, Employee employee) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double partialFee = 0.0;
        for (Job job : employeeJobs) {
            partialFee += job.getPartialFee();
        }
        return partialFee;
    }

    //Calculate fee before adding transportation in a specific month
    public Double calculatePartialFeeByMonth(Employer employer, Employee employee, int year, int month) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double partialFee = 0.0;
        for (Job job : employeeJobs) {
            LocalDate jobDate = job.getDate();
            if(jobDate.getYear() == year && jobDate.getMonthValue() == month) {
                partialFee += job.getPartialFee();
            }
        }
        return partialFee;
    }

    //Calculate the sum of hourly fees needed to calculate the average
    public Double calculateTotalHourlyFee(Employer employer, Employee employee) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double totalFee = 0.0;
        for (Job job : employeeJobs) {
            totalFee += job.getHourlyRate();
        }
        return totalFee;
    }

    //Calculate the average of the hourly fees
    public Double calculateAverageHourlyFee(Employer employer, Employee employee) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double averageHourlyFee = 0.0;
        Double totalHourlyFee = this.calculateTotalHourlyFee(employer, employee);
        int amountOfJobs = employeeJobs.size();
        for (Job job : employeeJobs) {
            averageHourlyFee = totalHourlyFee / amountOfJobs;
        }
        return averageHourlyFee;
    }

    //Calculate the average of hourly fee in a year
    public Double calculateAverageHourlyFeeByYear(Employer employer, Employee employee, int year, int month) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double averageHourlyFee = 0.0;
        Double totalHourlyFee = this.calculateTotalHourlyFee(employer, employee);
        int amountOfJobs = employeeJobs.size();
        for (Job job : employeeJobs) {
            LocalDate jobDate = job.getDate();
            if(jobDate.getYear() == year && jobDate.getMonthValue() == month) {
                averageHourlyFee = totalHourlyFee / amountOfJobs;
            }
        }
        return averageHourlyFee;
    }

    //Calculate transportation fee
    public Double calculateTransportationFee(Employer employer, Employee employee) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double totalTransportation = 0.0;
        for(Job job : employeeJobs) {
            totalTransportation += job.getTransportationFee();
        }
        return totalTransportation;
    }

    //Calculate transportation fee in a month
    public Double calculateTransportationFeeByMonth(Employer employer, Employee employee, int year, int month) {
        List<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double totalTransportation = 0.0;
        for(Job job : employeeJobs) {
            LocalDate jobDate = job.getDate();
            if(jobDate.getYear() == year && jobDate.getMonthValue() == month) {
                totalTransportation += job.getTransportationFee();
            }
        }
        return totalTransportation;
    }





}
