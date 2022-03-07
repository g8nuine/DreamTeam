package com.example.DU;

public class CustomerDto {
    private String meno;
    private String priezvisko;

    public void setMeno(String meno){
        this.meno = meno;
    }
    public void setPriezvisko(String priezvisko){
       this.priezvisko = priezvisko;
    }

    public String getMeno(){
        return meno;
    }
    public String getPriezvisko(){
        return priezvisko;
    }
}
