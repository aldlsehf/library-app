package com.group.libraryapp.dto.book.request;

public class BookLoanRequest {
    private String userName;
    private String bookName;

    public BookLoanRequest() {
    }

    public String getUserName() {
        return userName;
    }

    public String getBookName() {
        return bookName;
    }
}
