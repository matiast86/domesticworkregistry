package com.matiastailler.domesticworkregistry;


import java.util.ArrayList;


public abstract class Person  {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private ArrayList<Address> addresses;
    private String birthdate;
    private String identificationNumber;
    
    public Person(Long id, String name, String surname, int age, ArrayList<Address> addresses, String birthdate, String identificationNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.addresses = addresses;
        this.birthdate = birthdate;
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    

    
}
