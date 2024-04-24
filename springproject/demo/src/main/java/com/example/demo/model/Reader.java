package com.example.demo.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Reader {
@Id
int id;
String fname;   
String lname;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "book_id")
List<Book> b;



public Reader(int id, String fname, String lname, List<Book> b) {
    this.id = id;
    this.fname = fname;
    this.lname = lname;
    this.b = b;
}
public List<Book> getB() {
    return b;
}
public void setB(List<Book> b) {
    this.b = b;
}
public Reader() {
}
public Reader(int id, String fname, String lname) {
    this.id = id;
    this.fname = fname;

    this.lname = lname;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getFname() {
    return fname;
}
public void setFname(String fname) {
    this.fname = fname;
}
public String getLname() {
    return lname;
}
public void setLname(String lname) {
    this.lname = lname;
}
 
}
