package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Reader;
import com.example.demo.service.ReaderSer;

@RestController
public class ReaderController {

    @Autowired
    ReaderSer readerService;
    @PostMapping("/test1") 
    public Reader insertReaders(@RequestBody Reader readers) {
        return readerService.add(readers);
    }
    @GetMapping("/get")
    public List<Reader> ggo()
    {
        return readerService.jo();
    }
}
