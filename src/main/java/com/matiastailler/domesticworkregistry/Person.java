package com.matiastailler.domesticworkregistry;


import com.matiastailler.exceptions.InvalidDataException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract class Person  {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private List<Address> addresses;
    private LocalDate birthdate;
    private int identificationNumber;
    private String image;
    
    public Person(Long id, String name, String surname, int age, List<Address> addresses, LocalDate birthdate, int identificationNumber, String image) {
        if(name == null || name.isEmpty()) {
            throw new InvalidDataException("Name cannot be empty");
        }
        if(surname == null || surname.isEmpty()) {
            throw new InvalidDataException("Surname cannot be empty");
        }
        if( String.valueOf(identificationNumber).length() <= 8) {
            throw new InvalidDataException("Identification number must be at least 8 digits");
        }
        if(age < 0) {
            throw new InvalidDataException("Age cannot be negative");
        }

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.addresses = addresses;
        this.birthdate = birthdate;
        this.identificationNumber = identificationNumber;
        this.image = image;
    }

    public Person(Long id, String name, String surname, int identificationNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.identificationNumber = identificationNumber;
    }


    public Person(String name, String surname, int identificationNumber) {
        this(null, name, surname, 0, null, null, identificationNumber, null);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new InvalidDataException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname == null || surname.isEmpty()) {
            throw new InvalidDataException("Surname cannot be empty");
        }
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new InvalidDataException("Age cannot be negative");
        }
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        if( String.valueOf(identificationNumber).length() <= 8) {
            throw new InvalidDataException("Identification number must be at least 8 digits");
        }
        this.identificationNumber = identificationNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
