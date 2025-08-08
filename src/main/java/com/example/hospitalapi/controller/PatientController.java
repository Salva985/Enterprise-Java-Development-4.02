package com.example.hospitalapi.controller;

import com.example.hospitalapi.model.Employee;
import com.example.hospitalapi.model.Patient;
import com.example.hospitalapi.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientRepository.findById(id).orElseThrow();
    }

    @GetMapping("/dob")
    public List<Patient> getPatientByDateRange(@RequestParam String start, @RequestParam String end) {
        return patientRepository.findByDateOfBirthBetween(LocalDate.parse(start), LocalDate.parse(end));
    }

    @GetMapping("/department/{department}")
    public List<Patient> getByDoctorDepartment(@PathVariable String department) {
        return patientRepository.findByAdmittedBy_Department(department);
    }

    @GetMapping("/doctor-status/off")
    public List<Patient> getByDoctorStatusOff() {
        return patientRepository.findByAdmittedBy_Status(Employee.Status.OFF);
    }
}
