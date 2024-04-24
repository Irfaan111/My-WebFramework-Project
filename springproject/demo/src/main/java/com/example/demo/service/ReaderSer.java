package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Reader;
import com.example.demo.repository.Readerrepo;

@Service
public class ReaderSer {

    @Autowired
    private Readerrepo readerRepo;

    public Reader add(Reader readers) {
        return readerRepo.save(readers);
    }
    public List<Reader> jo()
    {
        return readerRepo.join();
    }
}
