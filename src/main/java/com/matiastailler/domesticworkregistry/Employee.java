package com.matiastailler.domesticworkregistry;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee extends Person {
    private String cuil;
    private Role role;
    
    public Employee(Long id, String name, String surname, int age, ArrayList<Address> addresses, LocalDate birthdate,
                    int identificationNumber, String image, String cuil, Role role) {
        super(id, name, surname, age, addresses, birthdate, identificationNumber, image);
        this.cuil = cuil;
        this.role = role;
    }

    public Employee(String name, String surname, int identificationNumber, String cuil) {
        super(name, surname, identificationNumber);
        this.cuil = cuil;
    }


    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
    	this.cuil = cuil;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }



}
