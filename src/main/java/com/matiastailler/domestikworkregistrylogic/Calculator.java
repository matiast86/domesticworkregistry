package com.matiastailler.domestikworkregistrylogic;

import com.matiastailler.domesticworkregistry.Employee;
import com.matiastailler.domesticworkregistry.Employer;
import com.matiastailler.domesticworkregistry.Job;

import java.time.LocalDate;
import java.util.ArrayList;

public class Calculator {


    public Double calculateTotalHours(Employer employer, Employee employee) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double totalHours = 0.0;
        for (Job job : employeeJobs) {
            totalHours += job.getHoursWorked();
        }
        return totalHours;

    }

    public Double calculateHoursByMonth(Employer employer, Employee employee, int year, int month) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double totalHours = 0.0;
        for (Job job : employeeJobs) {
            LocalDate jobDate = job.getDate();
            if(jobDate.getYear() == year && jobDate.getMonthValue() == month) {
                totalHours += job.getHoursWorked();
            }
        }
        return totalHours;
    }

    public Double calculateTotalFee(Employer employer, Employee employee) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double totalFee = 0.0;
        for (Job job : employeeJobs) {
            totalFee += job.getTotalFee();
        }
        return totalFee;
    }

    public Double calculateTotalFeeByMonth(Employer employer, Employee employee, int year, int month) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double totalFee = 0.0;
        for (Job job : employeeJobs) {
            LocalDate jobDate = job.getDate();
            if(jobDate.getYear() == year && jobDate.getMonthValue() == month) {
                totalFee += job.getTotalFee();
            }
        }
        return totalFee;
    }

    public Double calculatePartialFee(Employer employer, Employee employee) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double partialFee = 0.0;
        for (Job job : employeeJobs) {
            partialFee += job.getPartialFee();
        }
        return partialFee;
    }

    public Double calculatePartialFeeByMonth(Employer employer, Employee employee, int year, int month) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double partialFee = 0.0;
        for (Job job : employeeJobs) {
            LocalDate jobDate = job.getDate();
            if(jobDate.getYear() == year && jobDate.getMonthValue() == month) {
                partialFee += job.getPartialFee();
            }
        }
        return partialFee;
    }

    public Double calculateTotalHourlyFee(Employer employer, Employee employee) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double totalFee = 0.0;
        for (Job job : employeeJobs) {
            totalFee += job.getHourlyRate();
        }
        return totalFee;
    }

    public Double calculateAverageHourlyFee(Employer employer, Employee employee) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double averageHourlyFee = 0.0;
        Double totalHourlyFee = this.calculateTotalHourlyFee(employer, employee);
        int amountOfJobs = employeeJobs.size();
        for (Job job : employeeJobs) {
            averageHourlyFee = totalHourlyFee / amountOfJobs;
        }
        return averageHourlyFee;
    }

    public Double calculateAverageHourlyFeeByYear(Employer employer, Employee employee, int year, int month) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
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

    public Double calculateTransportationFee(Employer employer, Employee employee) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
        Double totalTransportation = 0.0;
        for(Job job : employeeJobs) {
            totalTransportation += job.getTransportationFee();
        }
        return totalTransportation;
    }

    public Double calculateTransportationFeeByMonth(Employer employer, Employee employee, int year, int month) {
        ArrayList<Job> employeeJobs = employer.getJobsByEmployee(employee);
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
