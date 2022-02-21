package com.example.DU;

public class Klient {
    public long id;
    public String meno;
    public String priezvisko;
    public String email;

    public Klient(long id, String meno, String priezvisko, String email) {
        this.id = id;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.email = email;
    }
    public Klient(){

    }
}
