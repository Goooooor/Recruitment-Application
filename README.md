# Recruitment Application

## Overview
This is a recruitment management system designed for an amusement park. It allows applicants to register, submit applications, and specify their availability, while recruiters can review and manage applications.

## Features
- **User Authentication:** Applicants and recruiters can log in securely.
- **Application Submission:** Applicants can select competence, enter years of experience, and specify availability.
- **Recruiter Dashboard:** Recruiters can view application statuses.
- **Role-Based Access Control:** Different functionalities for applicants and recruiters.
- **Secure Password Handling:** Uses Spring Security and password hashing.

## Technologies Used
- **Backend:** Spring Boot, Hibernate, Spring Security, JPA
- **Frontend:** Thymeleaf, Bootstrap
- **Database:** PostgreSQL
- **Build Tool:** Maven

## Cloud Platform


## Installation
1. Clone repository
```bash
git clone https://github.com/Goooooor/Recruitment-Application.git
```
2. The database script for creating the database can be found in src/main/script/db/new-database.sql
3.Configure the database in application.properties
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.username=your_username
spring.datasource.password=your_password
```
