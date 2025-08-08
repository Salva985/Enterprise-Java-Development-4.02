package com.example.hospitalapi.model;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    private Long employeeId;

    private String department;
    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        ON_CALL,
        ON,
        OFF
    }

    //CONSTRUCTOR
    public Employee() {}

    public Employee(Long employeeId, String department, String name, Status status) {
        this.employeeId = employeeId;
        this.department = department;
        this.name = name;
        this.status = status;
    }

    //GETTERS & SETTERS

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
