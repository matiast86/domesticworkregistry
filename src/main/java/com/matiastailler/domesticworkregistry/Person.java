package com.matiastailler.domesticworkregistry;


import java.time.LocalDate;
import java.util.ArrayList;


public abstract class Person  {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private ArrayList<Address> addresses;
    private LocalDate birthdate;
    private int identificationNumber;
    private String image;
    
    public Person(Long id, String name, String surname, int age, ArrayList<Address> addresses, LocalDate birthdate, int identificationNumber, String image) {
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
        this.name = name;
        this.surname = surname;
        this.identificationNumber = identificationNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        this.identificationNumber = identificationNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }
}
