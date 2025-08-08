package com.example.hospitalapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.example.hospitalapi.repository.EmployeeRepository;
import com.example.hospitalapi.repository.PatientRepository;
import com.example.hospitalapi.model.Employee;
import com.example.hospitalapi.model.Patient;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class HospitalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApiApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(
			EmployeeRepository employeeRepo,
			PatientRepository patientRepo
	) {
		return args -> {
			// Create employees
			Employee e1 = new Employee(356712L, "cardiology", "Alonso Flores", Employee.Status.ON_CALL);
			Employee e2 = new Employee(564134L, "immunology", "Sam Ortega", Employee.Status.ON);
			Employee e3 = new Employee(761527L, "cardiology", "German Ruiz", Employee.Status.OFF);
			Employee e4 = new Employee(166552L, "pulmonary", "Maria Lin", Employee.Status.ON);
			Employee e5 = new Employee(156545L, "orthopaedic", "Paolo Rodriguez", Employee.Status.ON_CALL);
			Employee e6 = new Employee(172456L, "psychiatric", "John Paul Armes", Employee.Status.OFF);

			employeeRepo.saveAll(List.of(e1, e2, e3, e4, e5, e6));

			// Create patients
			Patient p1 = new Patient(1L, "Jaime Jordan", LocalDate.of(1984, 3, 2), e2);
			Patient p2 = new Patient(2L, "Marian Garcia", LocalDate.of(1972, 1, 12), e2);
			Patient p3 = new Patient(3L, "Julia Dusterdieck", LocalDate.of(1954, 6, 11), e1);
			Patient p4 = new Patient(4L, "Steve McDuck", LocalDate.of(1931, 11, 10), e3);
			Patient p5 = new Patient(5L, "Marian Garcia", LocalDate.of(1999, 2, 15), e6);

			patientRepo.saveAll(List.of(p1, p2, p3, p4, p5));
		};
	}

}
