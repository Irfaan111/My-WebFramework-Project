package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HospitalDetails {
    @Id
    private int patientId;
    private String patientName;
    private String patientType;
    private String doctorInCharge;
    private int doctorId;
    private String diagnosedFor;
    private String recoveryStatus;
    private long treatmentCost;
    
    public HospitalDetails(int patientId, String patientName, String patientType, String doctorInCharge, int doctorId,
            String diagnosedFor, String recoveryStatus, long treatmentCost) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientType = patientType;
        this.doctorInCharge = doctorInCharge;
        this.doctorId = doctorId;
        this.diagnosedFor = diagnosedFor;
        this.recoveryStatus = recoveryStatus;
        this.treatmentCost = treatmentCost;
    }
    public HospitalDetails() {
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getPatientType() {
        return patientType;
    }
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }
    public String getDoctorInCharge() {
        return doctorInCharge;
    }
    public void setDoctorInCharge(String doctorInCharge) {
        this.doctorInCharge = doctorInCharge;
    }
    public int getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    public String getDiagnosedFor() {
        return diagnosedFor;
    }
    public void setDiagnosedFor(String diagnosedFor) {
        this.diagnosedFor = diagnosedFor;
    }
    public String getRecoveryStatus() {
        return recoveryStatus;
    }
    public void setRecoveryStatus(String recoveryStatus) {
        this.recoveryStatus = recoveryStatus;
    }
    public long getTreatmentCost() {
        return treatmentCost;
    }
    public void setTreatmentCost(long treatmentCost) {
        this.treatmentCost = treatmentCost;
    }
    
}
