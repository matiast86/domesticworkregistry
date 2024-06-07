package com.matiastailler.domesticworkregistry;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class PersonTest {

    @Test
    public void testPersonAttributes() {
        Person person = new Person("John", "Doe", 30, new Date(), "12345678");
        assertEquals("John", person.getName());
        assertEquals("Doe", person.getSurname());
        assertEquals(30, person.getAge());
        assertEquals("12345678", person.getIdentificationNumber());
    }
}

