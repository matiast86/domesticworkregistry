package com.matiastailler.domesticworkregistry;

import com.matiastailler.domestikworkregistrylogic.Calculator;
import com.matiastailler.exceptions.InvalidDataException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {

    public static void main(String[] args) {



            // Create a few Employee and Employer objects
        Employee employee = new Employee("John", "Doe", 1232325678, "123-456-789");
        Employee employee2 = new Employee("Jane", "Smith", 876524321, "987-654-321");
        Employee employee3 = new Employee("Alice", "Johnson", 1351279246, "135-792-468");
        Employer employer = new Employer("ACME Corp", "CEO", 987654132);

            // Assign jobs using the assignJob method
            try {
                employer.assignJob(1L, employee, LocalDate.of(2024, 6, 1), LocalTime.of(9, 0), LocalTime.of(17, 0), 2800.0, 800.0);
                employer.assignJob(2L, employee2, LocalDate.of(2024, 6, 2), LocalTime.of(8, 0), LocalTime.of(12, 0), 2800.0, 800.0);
                employer.assignJob(3L, employee3, LocalDate.of(2024, 6, 3), LocalTime.of(10, 0), LocalTime.of(16, 0), 2800.0, 800.0);
                employer.assignJob(4L, employee, LocalDate.of(2024, 6, 4), LocalTime.of(9, 0), LocalTime.of(17, 0), 2800.0, 800.0);
                employer.assignJob(5L, employee2, LocalDate.of(2024, 6, 5), LocalTime.of(8, 0), LocalTime.of(12, 0), 2800.0, 800.0);
                employer.assignJob(6L, employee3, LocalDate.of(2024, 6, 6), LocalTime.of(10, 0), LocalTime.of(16, 0), 2800.0, 800.0);
                employer.assignJob(7L, employee, LocalDate.of(2024, 7, 7), LocalTime.of(9, 0), LocalTime.of(17, 0), 2800.0, 800.0);
                employer.assignJob(8L, employee2, LocalDate.of(2024, 7, 8), LocalTime.of(8, 0), LocalTime.of(12, 0), 2800.0, 800.0);
                employer.assignJob(9L, employee3, LocalDate.of(2024, 7, 9), LocalTime.of(10, 0), LocalTime.of(16, 0), 2800.0, 800.0);
            } catch (InvalidDataException e) {
                System.err.println("Error assigning job: " + e.getMessage());
            }

            // Initialize Calculator
            Calculator calculator = new Calculator();

            // Perform calculations
        try {
            double totalHours = calculator.calculateTotalHours(employer, employee);
            double totalFee = calculator.calculateTotalFee(employer, employee);
            double totalFeeJune = calculator.calculateTotalFeeByMonth(employer, employee, 2024, 6);
            double totalHourlyFee = calculator.calculateTotalHourlyFee(employer, employee);
            double averageHourlyFee = calculator.calculateAverageHourlyFee(employer, employee);
            double transportationFee = calculator.calculateTransportationFee(employer, employee);
            double transportationFeeJune = calculator.calculateTransportationFeeByMonth(employer, employee, 2024, 6);

            // Print results
            System.out.println("Total hours worked for employee1: " + totalHours);
            System.out.println("Total fee earned for employee1: $" + totalFee);
            System.out.println("Total fee earned in June 2024 for employee1: $" + totalFeeJune);
            System.out.println("Total hourly fee for employee1: $" + totalHourlyFee);
            System.out.println("Average hourly fee for employee1: $" + averageHourlyFee);
            System.out.println("Total transportation fee for employee1: $" + transportationFee);
            System.out.println("Transportation fee in June 2024 for employee1: $" + transportationFeeJune);
        } catch (InvalidDataException e) {
            System.err.println("Error calculating: " + e.getMessage());
        }





        // Perform calculations
        try {
            double totalHours = calculator.calculateTotalHours(employer, employee2);
            double totalFee = calculator.calculateTotalFee(employer, employee2);
            double totalFeeJune = calculator.calculateTotalFeeByMonth(employer, employee2, 2024, 6);
            double totalHourlyFee = calculator.calculateTotalHourlyFee(employer, employee2);
            double averageHourlyFee = calculator.calculateAverageHourlyFee(employer, employee2);
            double transportationFee = calculator.calculateTransportationFee(employer, employee2);
            double transportationFeeJune = calculator.calculateTransportationFeeByMonth(employer, employee2, 2024, 6);

            // Print results
            System.out.println("Total hours worked for employee1: " + totalHours);
            System.out.println("Total fee earned for employee1: $" + totalFee);
            System.out.println("Total fee earned in June 2024 for employee1: $" + totalFeeJune);
            System.out.println("Total hourly fee for employee1: $" + totalHourlyFee);
            System.out.println("Average hourly fee for employee1: $" + averageHourlyFee);
            System.out.println("Total transportation fee for employee1: $" + transportationFee);
            System.out.println("Transportation fee in June 2024 for employee1: $" + transportationFeeJune);
        } catch (InvalidDataException e) {
            System.err.println("Error calculating: " + e.getMessage());
        }

        // Perform calculations
        try {
            double totalHours = calculator.calculateTotalHours(employer, employee3);
            double totalFee = calculator.calculateTotalFee(employer, employee3);
            double totalFeeJune = calculator.calculateTotalFeeByMonth(employer, employee3, 2024, 6);
            double totalHourlyFee = calculator.calculateTotalHourlyFee(employer, employee3);
            double averageHourlyFee = calculator.calculateAverageHourlyFee(employer, employee3);
            double transportationFee = calculator.calculateTransportationFee(employer, employee3);
            double transportationFeeJune = calculator.calculateTransportationFeeByMonth(employer, employee3, 2024, 6);

            // Print results
            System.out.println("Total hours worked for employee1: " + totalHours);
            System.out.println("Total fee earned for employee1: $" + totalFee);
            System.out.println("Total fee earned in June 2024 for employee1: $" + totalFeeJune);
            System.out.println("Total hourly fee for employee1: $" + totalHourlyFee);
            System.out.println("Average hourly fee for employee1: $" + averageHourlyFee);
            System.out.println("Total transportation fee for employee1: $" + transportationFee);
            System.out.println("Transportation fee in June 2024 for employee1: $" + transportationFeeJune);
        } catch (InvalidDataException e) {
            System.err.println("Error calculating: " + e.getMessage());
        }

        }
}
