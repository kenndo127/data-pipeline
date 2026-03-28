# Data Pipeline — Employee Records Analysis

A Java application that parses a CSV file of employee records and performs data analysis using the Java Streams API. Built for learning purposes to implement functional programming concepts and the Java Streams API.

## What It Does

Reads a dataset of employee records and runs a series of analyses including filtering by gender and joining year, grouping employees by city, and collecting results into unmodifiable lists.

## Dataset

The project uses an `Employee.csv` file containing records with the following fields: Education, JoiningYear, City, PaymentTier, Age, Gender, EverBenched, ExperienceInCurrentDomain, and LeaveOrNot.

## How to Run

1. Clone the repository
2. Open the project in IntelliJ IDEA or any Java IDE
3. Ensure `Employee.csv` is in `src/main/resources/`
4. Run `Main.java`

## Requirements

- Java 16+
- Maven