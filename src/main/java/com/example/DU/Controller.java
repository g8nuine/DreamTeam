package com.example.DU;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private final List<Kniha> knihy = new ArrayList<>();
    private final List<Klient> klienty = new ArrayList<>();
    private List<PozKniha> ZaznamPozKnih = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "home page");
        return "home";
    }

    //work with books
    @GetMapping("/api/book{idBook}") //show book by id
    public List<Kniha> getBook(){
        //TODO
        return knihy;
    }
    @PostMapping("/create/book") //create book
    public Kniha createKniha(@RequestParam long id, String name, String isbn, String nameAuthor, String lastNameAuthor, int pocet){
        Kniha kniha = new Kniha();
        kniha.id = id;
        kniha.name = name;
        kniha.isbn = isbn;
        kniha.menoAutor = nameAuthor;
        kniha.priezviskoAutor = lastNameAuthor;
        kniha.pocetKnih = pocet;
        knihy.add(kniha);
        return kniha;
    }
    @PostMapping("/create/customer")
    public Klient createKlient(@RequestParam long id, String name, String lastName, String mail){
        Klient klient = new Klient();
        klient.id = id;
        klient.meno = name;
        klient.priezvisko = lastName;
        klient.email = mail;
        klienty.add(klient);
        return klient;
    }

    @GetMapping("/api/customers{klientId}") //TODO zaznam klientov podla id
    public List<Klient> getKlientyById(@RequestParam Klient klient){
        return klienty;
        //TODO
    }
    @GetMapping("/api/customers/all")
    public List<Klient> getKlienty(){
        return klienty;
    }

}
