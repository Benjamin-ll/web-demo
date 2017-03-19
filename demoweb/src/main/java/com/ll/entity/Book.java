package com.ll.entity;

public class Book {
    private Long bookId;

    private String name;

    private Integer num;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", name=" + name + ", num=" + num + "]";
    }
    
}