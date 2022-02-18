package com.example.DU;

public class Kniha {
    public long id;
    public String name;
    public String isbn;
    public String menoAutor;
    public String priezviskoAutor;
    public int pocetKnih;

    public Kniha(long id, String name, String isbn, String menoAutor, String priezviskoAutor) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
        this.menoAutor = menoAutor;
        this.priezviskoAutor = priezviskoAutor;
    }
    public Kniha() {

    }
}
