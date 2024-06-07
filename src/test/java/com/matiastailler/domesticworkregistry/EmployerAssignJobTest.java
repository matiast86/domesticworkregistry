package com.matiastailler.domesticworkregistry;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import java.time.LocalDate;

public class EmployerAssignJobTest {

    @Test
    public void testAssignJob() {
        Employer employer = new Employer("John", "Doe", 45, new Date(), "87654321");
        Employee employee = new Employee("Jane", "Smith", 28, new Date(), "23456789", "CUIL12345", Role.NANNY);
        
        LocalDate date = LocalDate.of(2023, 6, 1);
        LocalTime startTime = LocalTime.of(19, 0);
        LocalTime endTime = LocalTime.of(23, 0);
        double hourlyRate = 2800.0;
        double transportationFee = 600.0;

        Job job = employer.assignJob(employee, date, startTime, endTime, hourlyRate, transportationFee);
        
        assertNotNull(job);
        assertEquals(employer, job.getEmployer());
        assertEquals(employee, job.getEmployee());
        assertEquals(date, job.getDate());
        assertEquals(startTime, job.getStartTime());
        assertEquals(endTime, job.getEndTime());
        assertEquals(4.0, job.calculateHoursWorked());
        assertEquals(11200.0, job.calculatePartialFee());
        assertEquals(11800.0, job.calculateTotalFee());
    }
}

