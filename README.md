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

## Deployment on AWS (EC2 Instance)

The application is deployed on an AWS EC2 instance, which serves as our backend server. The EC2 instance is a virtual machine where Java and PostgreSQL are installed to support our Spring Boot application and database.

### **Setup Overview:**
1. **EC2 Instance**  
   - The backend runs on an AWS EC2 instance, acting as our application server.
   - The instance has Java installed to run the Spring Boot backend.
   - PostgreSQL is installed and configured to store application data.

2. **Backend Server Execution**  
   - The Spring Boot application runs on the EC2 instance, listening for API requests.
   - It serves as the backend for our server-side rendered application.

3. **Database Connection**  
   - The application connects to a PostgreSQL database hosted on the EC2 instance.
   - Database credentials are configured in `application.properties` for secure access.

Link to the deployed app: http://16.170.244.146:8080/

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
