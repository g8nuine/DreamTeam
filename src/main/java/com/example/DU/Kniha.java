package com.example.DU;

public class Kniha {
    public long id;
    public String nazov;
    public String isbn;
    public String menoAutor;
    public String priezviskoAutor;
    public int pocetKnih;

    public Kniha(long id, String nazov, String isbn, String menoAutor, String priezviskoAutor, int pocetKnih) {
        this.id = id;
        this.nazov = nazov;
        this.isbn = isbn;
        this.menoAutor = menoAutor;
        this.priezviskoAutor = priezviskoAutor;
        this.pocetKnih = pocetKnih;
    }

    public Kniha() {
    }
}
