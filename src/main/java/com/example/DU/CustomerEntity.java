package com.example.DU;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String firstname;

    private String secondname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() { return secondname; }

    public void setSecondname(String secondname) { this.secondname = secondname; }
}
