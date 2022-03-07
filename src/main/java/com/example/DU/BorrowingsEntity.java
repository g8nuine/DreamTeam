package com.example.DU;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BorrowingsEntity {
    @Id
    @GeneratedValue

    private long id;

    private long BookId;

    private long CustomerId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBookId(long BookId) {
        this.BookId = BookId;
    }

    public void setCustomerId(long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public long getBookId() {
        return BookId;
    }

    public long getCustomerId() {
        return CustomerId;
    }

    public void save(BorrowingsEntity borEnt) {
        //TODO
    }
}