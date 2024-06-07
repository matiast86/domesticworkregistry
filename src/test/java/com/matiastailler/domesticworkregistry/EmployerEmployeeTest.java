package com.matiastailler.domesticworkregistry;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class EmployerEmployeeTest {

    @Test
    public void testEmployerAttributes() {
        Employer employer = new Employer("John", "Doe", 45, new Date(), "87654321");
        assertEquals("John", employer.getName());
        assertEquals("Doe", employer.getSurname());
        assertEquals(45, employer.getAge());
        assertEquals("87654321", employer.getIdentificationNumber());
    }

    @Test
    public void testEmployeeAttributes() {
        Employee employee = new Employee("Jane", "Smith", 28, new Date(), "23456789", "CUIL12345", Role.NANNY);
        assertEquals("Jane", employee.getName());
        assertEquals("Smith", employee.getSurname());
        assertEquals(28, employee.getAge());
        assertEquals("23456789", employee.getIdentificationNumber());
        assertEquals("CUIL12345", employee.getCuil());
        assertEquals(Role.NANNY, employee.getRole());
    }
}

