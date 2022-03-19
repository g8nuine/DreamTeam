package com.example.DU;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BorrowingEntity {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private CustomerEntity borrower;

    @ManyToOne
    private BookEntity book;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerEntity getBorrower() {
        return borrower;
    }

    public void setBorrower(CustomerEntity borrower) {
        this.borrower = borrower;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }
}
