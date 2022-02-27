package com.example.DU;

public class Borrowing {
    public long id;
    public long BookId;
    public long CustomerId;

    public Borrowing(long id, long BookId, long CustomerId){
        this.id = id;
        this.BookId = BookId;
        this.CustomerId = CustomerId;
    }

    public Borrowing(){

    }
}
