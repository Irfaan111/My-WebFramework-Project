package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.example.demo.model.HospitalDetails;

import jakarta.transaction.Transactional;


@Repository
public interface HospitalRepo extends JpaRepository<HospitalDetails,Integer> {

    
    @Query("select a from HospitalDetails a where a.patientName=?1")
    public List<HospitalDetails> getbyname(String name);
    

    @Modifying
    @Transactional
    @Query("update HospitalDetails set patientName=?2 where patientName=?1")
    public void up(String fname,String lname);
    @Modifying
    @Transactional
    @Query("delete from HospitalDetails a where a.patientName=?1")
    public void deleteByname(String fname);

}
