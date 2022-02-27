package com.example.DU;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BorrowingController {
    private BorrowingService borrowingService;
    public BorrowingController(BorrowingService borrowingService) {
        this.borrowingService = borrowingService;
    }
    private final List<Borrowing> borrowings = new ArrayList<>();

    @PostMapping("/api/borrowings")
    public Borrowing create(@RequestBody Borrowing borrowing){
        borrowingService.create(borrowing);
        return borrowing;
    }

    @PostMapping("/api/borrowings/by-name") //create borrowing
    public Borrowing create(@RequestParam long id, long BookId, long CustomerId) {
        return borrowingService.create(id, BookId, CustomerId);
    }

    @GetMapping("/api/borrowings") // return all borrowings
    public List<Borrowing> getBorrowings(){
        return borrowingService.getBorrowings();
    }

    @GetMapping("/api/borrowings/{id}") // find the borrowing by id
    public Borrowing getBorrowing(@PathVariable long id) {
        return borrowingService.getBorrowing(id);
    }

//    @PutMapping("/api/books/{id}") //edit books by id
//    public  Kniha editKniha(@PathVariable long id, @RequestParam String nazov, String isbn, String menoAutor, String priezviskoAutor, int pocetKnih){
//        return bookService.editKniha(id, nazov, isbn, menoAutor, priezviskoAutor, pocetKnih);
//    }

    @DeleteMapping("/api/borrowings/{id}") // delete the borrowing by id
    public Borrowing deleteBorrowing(@PathVariable long id) {
        return borrowingService.deleteBorrowing(id);
    }
}
