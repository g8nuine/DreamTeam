package com.example.DU;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BorrowingService {
    private final List<Borrowing> borrowings = new ArrayList<>();

    public long getterBookId(long Id){
        for(int i = 0; i < borrowings.size();i++){
            if(borrowings.get(i).id == Id){
                return borrowings.get(i).BookId;
            }
        }
        return 0;
    }

    public Borrowing create(Borrowing borrowing){
        borrowings.add(borrowing);
        return borrowing;
    }

    public Borrowing create(long id, long BookId, long CustomerId) {
        Borrowing borrowing = new Borrowing();
        borrowing.id = id;
        borrowing.BookId = BookId;
        borrowing.CustomerId = CustomerId;
        borrowings.add(borrowing);
        return borrowing;
    }

    public List<Borrowing> getBorrowings(){
        return borrowings;
    }

    public Borrowing getBorrowing(long id) {
        Borrowing borrowing = new Borrowing();
        for(int i = 0; i < borrowings.size(); i++){
            if(borrowings.get(i).id == id){
                borrowing.id = borrowings.get(i).id;
                borrowing.BookId = borrowings.get(i).BookId;
                borrowing.CustomerId = borrowings.get(i).CustomerId;
            }
        }
        return borrowing;
    }

//    public Borrowing editBorrowing(long id, String nazov, String isbn, String menoAutor, String priezviskoAutor, int pocetKnih){
//        for (int i = 0; i< knihy.size(); i++){
//            if (knihy.get(i).id == id){
//                knihy.get(i).nazov = nazov;
//                knihy.get(i).menoAutor = menoAutor;
//                knihy.get(i).priezviskoAutor = priezviskoAutor;
//                knihy.get(i).isbn = isbn;
//                knihy.get(i).pocetKnih = pocetKnih;
//            }
//        }
//        return null;
//    }

    public Borrowing deleteBorrowing(long id) {
        for(int i = 0; i < borrowings.size(); i++){
            if(borrowings.get(i).id == id){
                borrowings.remove(i);
            }
        }
        return null;
    }
}
