package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   int id; 
   String title;
   String author;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "reader_id")
   Reader r;
public Book(int id, String title, String author, Reader r) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.r = r;
}
public Reader getR() {
    return r;
}
public void setR(Reader r) {
    this.r = r;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getAuthor() {
    return author;
}
public void setAuthor(String author) {
    this.author = author;
}
public Book(int id, String title, String author) {
    this.id = id;
    this.title = title;
    this.author = author;
}
public Book() {
}

}
