package com.example.hospitalapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Patient {

    @Id
    private Long patientId;

    private String name;

    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "admitted by")
    private Employee admittedBy;

    //CONSTRUCTOR
    public Patient() {}

    public Patient(Long patientId, String name, LocalDate dateOfBirth, Employee admittedBy) {
        this.patientId = patientId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.admittedBy = admittedBy;
    }

    //GETTERS & SETTERS

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Employee getAdmittedBy() {
        return admittedBy;
    }

    public void setAdmittedBy(Employee admittedBy) {
        this.admittedBy = admittedBy;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
