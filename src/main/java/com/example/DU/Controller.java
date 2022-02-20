package com.example.DU;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private final List<Kniha> knihy = new ArrayList<>();
    private final List<Klient> klienty = new ArrayList<>();
    private final List<PozKniha> zaznamPozKnih = new ArrayList<>();

    @PostMapping("/api/book")
    public Kniha create(@RequestBody Kniha kniha){
        knihy.add(kniha);
        return kniha;
    }
    @PostMapping("/api/book/by-name") //create book
    public Kniha create(@RequestParam long id, String name, String isbn, String menoAutor, String priezviskoAutor, int pocetKnih) {
        Kniha kniha = new Kniha();
        kniha.id = id;
        kniha.name = name;
        kniha.isbn = isbn;
        kniha.menoAutor = menoAutor;
        kniha.priezviskoAutor = priezviskoAutor;
        kniha.pocetKnih = pocetKnih;
        knihy.add(kniha);
        return kniha;
    }
    @GetMapping("/api/book") // return all books
    public List<Kniha> getKnihy(){
        return knihy;
    }
    @GetMapping("/api/book/{id}") // find the book by id
    public Kniha getKniha(@PathVariable long id) {
        Kniha k = new Kniha();
        for(int i = 0; i < knihy.size(); i++){
            if(knihy.get(i).id == id){
                k.id = knihy.get(i).id;
                k.name = knihy.get(i).name;
                k.menoAutor = knihy.get(i).menoAutor;
                k.priezviskoAutor = knihy.get(i).priezviskoAutor;
                k.isbn = knihy.get(i).isbn;
                k.pocetKnih = knihy.get(i).pocetKnih;
            }
        }
        return k;
    }
    @DeleteMapping("/api/book/{id}") // delete the book by id
    public Kniha deleteKniha(@PathVariable long id) {
        for(int i = 0; i < knihy.size(); i++){
            if(knihy.get(i).id == id){
                knihy.remove(i);
            }
        }
        return null;
    }

    @PostMapping("/api/customers")
    public Klient create(@RequestBody Klient klient){
        klienty.add(klient);
        return klient;
    }
    @PostMapping("/api/customers/by-name") // create customer
    public Klient create(@RequestParam long id, String meno, String priezvisko, String email){
        Klient klient = new Klient();
        klient.id = id;
        klient.meno = meno;
        klient.priezvisko = priezvisko;
        klient.email = email;
        klienty.add(klient);
        return klient;
    }
    @GetMapping("/api/customers") // return all customers
    public List<Klient> getKlienty(){
        return klienty;
    }
    @GetMapping("/api/customers/{id}") // find the customers by id
    public Klient getKlient(@PathVariable long id) {
        //TODO
        Klient klient = new Klient();
        for(int i = 0; i < klienty.size(); i++){
            if(klienty.get(i).id == id){
                klient.id = klienty.get(i).id;
                klient.meno = klienty.get(i).meno;
                klient.priezvisko = klienty.get(i).priezvisko;
                klient.email = klienty.get(i).email;
            }
        }
        return klient;
    }
    @DeleteMapping("/api/customers/{id}") // delete the customer by id
    public Klient deleteKlient(@PathVariable long id){
        for(int i = 0; i < klienty.size(); i++){
            if(klienty.get(i).id == id){
                klienty.remove(i);
            }
        }
        return null;
    }

    @PostMapping("/api/borrowing")
    public PozKniha create(@RequestBody PozKniha pozKniha){
        zaznamPozKnih.add(pozKniha);
        return pozKniha;
    }
    @PostMapping("/api/borrowing/by-name") // create borrowing
    public  PozKniha create(@RequestParam long id, Klient vypozicovatel, Kniha kniha){
        PozKniha pk = new PozKniha();
        pk.id = id;
        pk.vypozicovatel = vypozicovatel;
        pk.kniha = kniha;
        zaznamPozKnih.add(pk);
        return pk;
    }
    @GetMapping("/api/borrowing") // return all borrowings
    public List<PozKniha> getZaznamPozKnih(){
        return zaznamPozKnih;
    }
    @GetMapping("/api/borrowing/{id}") // find borrowing by id
    public PozKniha getPozKnihaPodlaId(@PathVariable long id){
        PozKniha pk = new PozKniha();
        for(int i = 0; i < zaznamPozKnih.size(); i++){
            if(zaznamPozKnih.get(i).id == id){
                pk.id = zaznamPozKnih.get(i).id;
                pk.kniha = zaznamPozKnih.get(i).kniha;
                pk.vypozicovatel = zaznamPozKnih.get(i).vypozicovatel;
            }
        }
        return pk;
    }
    @DeleteMapping("/api/borrowing/{id}") // delete the borrowing by id
    public PozKniha deletePozKniha(@PathVariable long id){
        for(int i = 0; i < zaznamPozKnih.size(); i++){
            if(zaznamPozKnih.get(i).id == id){
                zaznamPozKnih.remove(i);
            }
        }
        return null;
    }
}
