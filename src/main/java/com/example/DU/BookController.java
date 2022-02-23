package com.example.DU;


import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    private final List<Kniha> knihy = new ArrayList<>();

    @PostMapping("/api/books")
    public Kniha create(@RequestBody Kniha kniha){
        bookService.create(kniha);
        return kniha;
    }

    @PostMapping("/api/books/by-name") //create book
    public Kniha create(@RequestParam long id, String nazov, String isbn, String menoAutor, String priezviskoAutor, int pocetKnih) {
       return bookService.create(id, nazov, isbn, menoAutor, priezviskoAutor, pocetKnih);
    }

    @GetMapping("/api/books") // return all books
    public List<Kniha> getKnihy(){
        return bookService.getKnihy();
    }

    @GetMapping("/api/books/{id}") // find the book by id
    public Kniha getKniha(@PathVariable long id) {
        return bookService.getKniha(id);
    }

    @PutMapping("/api/books/{id}") //edit books by id
    public  Kniha editKniha(@PathVariable long id, @RequestParam String nazov, String isbn, String menoAutor, String priezviskoAutor, int pocetKnih){
        return bookService.editKniha(id, nazov, isbn, menoAutor, priezviskoAutor, pocetKnih);
    }

    @DeleteMapping("/api/books/{id}") // delete the book by id
    public Kniha deleteKniha(@PathVariable long id) {
       return bookService.deleteKniha(id);
    }

}
