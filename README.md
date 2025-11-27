# CSC-548-Spring-Boot-Assignment-4
This repository contains 5 Spring Boot assignments covering various concepts

## Task 1: Dev Tools Demo
- **Objective**: Customize REST controller endpoints to display personal information
- **Files Modified**: `FunRestController.java`
- **Endpoints**:
  - `/` - Displays my name
  - `/workout` - Displays favorite movie
  - `/fortune` - Displays favorite music

## Task 2: Spring Boot Actuator
- **Objective**: Configure actuator info properties
- **Files Modified**: `application.properties`
- **Configuration**:
  - App name: software engineering
  - Description: testing spring boot actuator
  - Version: 0.0.1
- **Test URL**: `http://localhost:8080/actuator/info`

## Task 3: Constructor Injection
- **Objective**: Create `/basketball` endpoint using dependency injection
- **Files Modified**: `DemoController.java`
- **Endpoint**: `/basketball` returns "Tennis is my favorite basketball."

## Task 4: Reading HTML Form Data
- **Objective**: Create form to collect name and favorite sport
- **Files Modified**: 
  - `helloworld-form.html`
  - `helloworld.html`
- **Form Fields**: Your Name, Favorite Sport Name

## Task 5: Adding Data to Model
- **Objective**: Create movie-themed form with model data
- **Files Modified**: 
  - `helloworld-form.html`
  - `Movie.html` (renamed from helloworld.html)
  - `HelloWorldController.java` (renamed method to `MovieName`)
- **Expected Output**: "Welcome to the Software Engineering Class. Moviename: [INPUT] [INPUT] is my favorite movie"

## Technologies Used
- Spring Boot
- Spring MVC
- Thymeleaf
- Spring Boot Actuator
- Spring Dependency Injection
```
