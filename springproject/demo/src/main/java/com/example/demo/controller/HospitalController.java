package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HospitalDetails;
import com.example.demo.service.HospitalService;
@RestController
public class HospitalController {

    @Autowired
    HospitalService hService;
    @PostMapping(path = "/hospital/post")
    public HospitalDetails postDetails(@RequestBody HospitalDetails h) {
        return hService.saveDetails(h);
    }

    @GetMapping("/hospital/get")
    public List<HospitalDetails> getAllInfo() {
        return hService.getAllDetails();
    }

    @GetMapping("/hospital/get/{patientName}")
    public List<HospitalDetails> getThatInfo(@PathVariable String patientName) {
        return hService.gname(patientName);
    }

    @PutMapping("/hospital/update/{patientName}/{new}")
    public void updateInfo(@PathVariable("patientName") String name,@PathVariable("new") String f) {
        hService.updateDetails(name,f);
    }

    @DeleteMapping("/hospital/delete/{patientName}")
    public void deleteInfo(@PathVariable("patientName")String Name)
    {
        hService.deleteSpecificDetails(Name);
    }
}
