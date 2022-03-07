package com.example.DU;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BookService {
    private BookRepository br;

    public BookService(BookRepository br) {
        this.br = br;
    }

    List<Book> books = new LinkedList();

    public Book getBook(long id) {
        for(Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public Long createBook(Book book) {
        BookEntity be = new BookEntity();
        be.setAuthor(book.getAuthor());
        be.setTitle(book.getTitle());
        return be.getId();
    }

    public void deleteBook(long id) {
        for(Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
            }
        }
        return;
    }

    public void updateBook(Book book) {
        //TODO
        return;
    }
}
