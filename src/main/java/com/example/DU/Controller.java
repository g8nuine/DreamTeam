package com.example.DU;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private final List<Kniha> knihy = new ArrayList<>();
    private final List<Klient> klienty = new ArrayList<>();
    private final List<PozKniha> zaznamPozKnih = new ArrayList<>();

    @GetMapping("/api")
    public String home(Model model){
        model.addAttribute("title", "home page");
        return "home";
    }
    //work with books
    @GetMapping("/api/book/?title=<title search string>") //show all books
    public List<Kniha> getBooks(){
        //TODO
        return knihy;
    }
    @GetMapping("/api/book{bookId}") // show book by id
    public List<Kniha> getBook(){
        return knihy;
    }
    @PostMapping("/api/book") //create book
    public Kniha createBook(@RequestParam long id, String name, String isbn, String nameAuthor, String lastNameAuthor, int pocet){
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
    @PostMapping("/api/book{id}") //edit book
    public Kniha editBook(@RequestParam Kniha k){
        //TODO
        return k;
    }
    @PostMapping("/api/book{id}") //delete books by id
    public Kniha deleteBook(Kniha k){
        //k = null;
        return k;
    }
    // praca z klintami
    @PostMapping("/api/customers") //create customers
    public Klient createCustomer(@RequestParam long id, String name, String lastName, String mail){
        Klient klient = new Klient();
        klient.id = id;
        klient.meno = name;
        klient.priezvisko = lastName;
        klient.email = mail;
        klienty.add(klient);
        return klient;
    }
    @PostMapping("/api/customers{id}") //edit customers
    public Klient editCustomer(Klient klient){
        return klient;
    }
    @GetMapping("/api/customers{id}") //list of customers by id
    public List<Klient> getCustomerById(@RequestParam Klient klient){
        return klienty;
        //TODO
    }
    @GetMapping("/api/customers") // show all customers
    public List<Klient> getCustomers(){
        return klienty;
    }

    @PostMapping("/api/borrowing")
    public PozKniha borrowingBook(@RequestParam Kniha kniha, Klient klient, PozKniha pozKniha){
        if (kniha.pocetKnih > 0){
            zaznamPozKnih.add(pozKniha);
        }
        kniha.pocetKnih--;
        return pozKniha;
    }
    @GetMapping("/api/borrowing/{id}")
    @DeleteMapping("/api/borrowing/{id}")
    public PozKniha deleteBook(@RequestParam PozKniha kniha){
        return kniha;
    }


}
