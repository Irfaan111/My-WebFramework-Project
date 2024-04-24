package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.HospitalDetails;
import com.example.demo.repository.HospitalRepo;


@Service
public class HospitalService {

    @Autowired
    private HospitalRepo hRepo;

    //posting
    public HospitalDetails saveDetails(HospitalDetails h)
    {
        return hRepo.save(h);
    }

    public void updateDetails(String fname,String lname)
    {
         hRepo.up(fname,lname);
    }

    //getting 1
    public List<HospitalDetails> getAllDetails()
    {
        return hRepo.findAll();
    }

    //getting 2
    public Optional<HospitalDetails> getSpecificDetail(int id)
    {
        return hRepo.findById(id);
    }
    public List<HospitalDetails> gname(String name)
    {
        return hRepo.getbyname(name);
    }
    //delete
    public void deleteSpecificDetails(String name)
    {
        hRepo.deleteByname(name);
    }
}
