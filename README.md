# Project Setup Guide

## Step 1: Pull Both Files
Firstly, pull both the frontend and backend files from the repository.

## Step 2: Open Frontend in Visual Studio Code
After pulling, open the frontend code in Visual Studio Code.

## Step 3: Open Backend in IntelliJ
Similarly, open the backend code in IntelliJ IDEA.

## Step 4: Create Database in MySQL
Create a database named "customer" in MySQL.

## Step 5: Set Up and Run
After completing the above steps, set up any necessary configurations and directly run the project in IntelliJ.

## Step 6: Check Conditions
Once the backend is running, open the frontend in your default web browser and check all conditions.

Feel free to reach out if you encounter any issues or have questions!


##  for database
spring.datasource.url=jdbc:mysql://localhost:3306/customer
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
