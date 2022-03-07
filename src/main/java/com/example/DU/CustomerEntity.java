package com.example.DU;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue

    private long id;
    private String meno;
    private String priezvisko;

    public void setId(long id){
       this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setMeno(String meno){
       this.meno = meno;
    }
    public String getMeno(){
        return meno;
    }
    public void setPriezvisko(String priezvisko){
       this.priezvisko = priezvisko;
    }
    public void save(CustomerEntity customerEntity){
        //TODO
    }
}
