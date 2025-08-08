# 🏥 Enterprise-Java-Development-4.02 - HOSPITAL API

A Spring Boot REST API for managing a hospital system — includes employees (doctors) and patients. 

---

## 🚀 Features

- View all employees (doctors)
- Filter employees by department or status (ON, OFF, ON_CALL)
- View all patients
- Filter patients by:
  - Date of birth range
  - Doctor’s department
  - Doctor’s status

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 In-Memory Database
- Maven
- Postman (for API testing)

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Salva985/Enterprise-Java-Development-4.02.git
   cd Enterprise-Java-Development-4.02

---

## 🧪 API Endpoints

### Employees

GET /employees - Get all doctors <br>
GET /employees/{id} - Get doctor by ID <br>
GET /employees/status/{status} - Get doctors by status (ON, OFF, ON_CALL) <br>
GET /employees/department/{department} - Get doctors by department <br>

### Patients

GET /patients - Get all patients <br>
GET /patients/{id} - Get patient by ID <br>
GET /patients/dob?start=YYYY-MM-DD&end=YYYY-MM-DD - Get patients born within a date range <br>
GET /patients/department/{department} - Get patients by admitting doctor’s department <br>
GET /patients/doctor-status/off - Get patients whose doctor is OFF <br>

## 📦 Postman Collection

You can find the exported collection in the root of the project:
```bash
hospital-api-postman-collection.json


