package com.matiastailler.domesticworkregistry;

import java.util.ArrayList;

public class Employee extends Person {
    private String cuil;
    private Role role;
    
    public Employee(Long id, String name, String surname, int age, ArrayList<Address> addresses, String birthdate,
                    String identificationNumber, String cuil, Role role) {
        super(id, name, surname, age, addresses, birthdate, identificationNumber);
        this.cuil = cuil;
        this.role = role;
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
