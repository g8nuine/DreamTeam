package com.example.DU;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private final List<Kniha> knihy = new ArrayList<>();

    public Kniha create(Kniha kniha){
        knihy.add(kniha);
        return kniha;
    }

    public Kniha create(long id, String nazov, String isbn, String menoAutor, String priezviskoAutor, int pocetKnih) {
        Kniha kniha = new Kniha();
        kniha.id = id;
        kniha.nazov = nazov;
        kniha.isbn = isbn;
        kniha.menoAutor = menoAutor;
        kniha.priezviskoAutor = priezviskoAutor;
        kniha.pocetKnih = pocetKnih;
        knihy.add(kniha);
        return kniha;
    }
    public List<Kniha> getKnihy(){
        return knihy;
    }
    public Kniha getKniha(long id) {
        Kniha k = new Kniha();
        for(int i = 0; i < knihy.size(); i++){
            if(knihy.get(i).id == id){
                k.id = knihy.get(i).id;
                k.nazov = knihy.get(i).nazov;
                k.menoAutor = knihy.get(i).menoAutor;
                k.priezviskoAutor = knihy.get(i).priezviskoAutor;
                k.isbn = knihy.get(i).isbn;
                k.pocetKnih = knihy.get(i).pocetKnih;
            }
        }
        return k;
    }
    public  Kniha editKniha(long id, String nazov, String isbn, String menoAutor, String priezviskoAutor, int pocetKnih){
        for (int i = 0; i< knihy.size(); i++){
            if (knihy.get(i).id == id){
                knihy.get(i).nazov = nazov;
                knihy.get(i).menoAutor = menoAutor;
                knihy.get(i).priezviskoAutor = priezviskoAutor;
                knihy.get(i).isbn = isbn;
                knihy.get(i).pocetKnih = pocetKnih;
            }
        }
        return null;
    }
    public Kniha deleteKniha(long id) {
        for(int i = 0; i < knihy.size(); i++){
            if(knihy.get(i).id == id){
                knihy.remove(i);
            }
        }
        return null;
    }
}
