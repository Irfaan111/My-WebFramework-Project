package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Reader;
import com.example.demo.model.Book;
@Repository
public interface Readerrepo extends JpaRepository<Reader,Integer>{
    @Query("select s from Reader s Left Join s.b a")
    public List<Reader> join();
    
} 