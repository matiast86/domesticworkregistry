package com.matiastailler.domesticworkregistry;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Employer extends Person {
    private ArrayList<Employee> employees;
    private ArrayList<Job> jobs;

    public Employer(Long id, String name, String surname, int age, ArrayList<Address> addresses, LocalDate birthdate,
                    int identificationNumber, String image, ArrayList<Employee> employees, ArrayList<Job> jobs) {
        super(id, name, surname, age, addresses, birthdate, identificationNumber, image);
        this.employees = new ArrayList<>();
        this.setJobs(new ArrayList<>());
    }

    public Employer(Long id,String name, String surname, int identificationNumber) {
        super(id, name, surname, identificationNumber);
    }

    public Employer(String name, String surname, int identificationNumber) {
        super(name, surname, identificationNumber);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    public ArrayList<Job> getJobs() {
    	return jobs;
    }
    
    public void setJobs(ArrayList<Job> jobs) {
    	this.jobs = jobs;
    }
    
    public void addEmployee(Employee employee) {
    	this.employees.add(employee);
    }
    
    public void removeEmployee(Employee employee) {
    	this.employees.remove(employee);
    }
    
    public Job assignJob(Long id, Employee employee, LocalDate date, LocalTime startTime, LocalTime endTime, Double hourlyRate, Double transportationFee) {
    	Job job = new Job(id, this, employee, date, startTime, endTime, hourlyRate, transportationFee);
    	this.jobs.add(job);
    	return job;
    	
    }

    public ArrayList<Job> getJobsByEmployee(Employee employee) {
        ArrayList<Job> employeeJobs = new ArrayList<>();
        for (Job job : this.jobs) {
            if (job.getEmployee().equals(employee)) {
                employeeJobs.add(job);
            }
        }
        return employeeJobs;

    }


    
    
}
