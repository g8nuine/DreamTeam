package com.example.DU;

import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {this.bookService = bookService; }

    @GetMapping("/api/books/{id}")
    public Book getBook(@PathVariable long id) {return bookService.getBook(id); }

    @PostMapping("/api/books")
    public long createBook(@RequestBody Book bookDto) {
        return bookService.createBook(bookDto);
    }

    @DeleteMapping("/api/books/{id}")
    public void deleteBook(@PathVariable long id) {bookService.deleteBook(id); }

    @PutMapping("/api/books/id")
    public void updateBook(@PathVariable long id, @RequestBody Book book) {
        bookService.updateBook(book);
    }

}
