package com.matiastailler.domesticworkregistry;

import com.matiastailler.exceptions.EntityNotFoundException;
import com.matiastailler.exceptions.InvalidDataException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Employer extends Person {
    private final List<Employee> employees;
    private  final List<Job> jobs;

    public Employer(Long id, String name, String surname, int age, List<Address> addresses, LocalDate birthdate, int identificationNumber, String image) {
        super(id, name, surname, age, addresses, birthdate, identificationNumber, image);
        this.employees = new ArrayList<>();
        this.jobs = new ArrayList<>();
    }

    public Employer(Long id, String name, String surname, int identificationNumber) {
        this(id, name, surname, 0, null, null, identificationNumber, null);
    }

    public Employer(String name, String surname, int identificationNumber) {
        this(null, name, surname, 0, null, null, identificationNumber, null);
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(employees);
    }


    public List<Job> getJobs() {
        return Collections.unmodifiableList(jobs);
    }

    
    public void addEmployee(Employee employee) {
        if(employee == null) {
            throw new InvalidDataException("Employee cannot be null");
        }
    	this.employees.add(employee);
    }
    
    public void removeEmployee(Employee employee) {
        if(!employees.contains(employee)) {
            throw  new EntityNotFoundException("Employee not found");
        }
    	this.employees.remove(employee);
    }
    
    public Job assignJob(Long id, Employee employee, LocalDate date, LocalTime startTime, LocalTime endTime, Double hourlyRate, Double transportationFee) {
        if (employee == null || date == null || startTime == null || endTime == null || hourlyRate == null || transportationFee == null) {
            throw new InvalidDataException("Job parameters cannot be null");
        }
        if (startTime.isAfter(endTime)) {
            throw new InvalidDataException("Start time cannot be after end time");
        }
    	Job job = new Job(id, this, employee, date, startTime, endTime, hourlyRate, transportationFee);
    	this.jobs.add(job);
    	return job;
    	
    }

    public List<Job> getJobsByEmployee(Employee employee) {
        return jobs.stream()
                .filter(job -> job.getEmployee().equals(employee))
                .collect(Collectors.toList());
    }


    
    
}
