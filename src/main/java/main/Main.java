package main;

import entity.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Reading the data from the csv file
        try{
            InputStream file = Main.class.getClassLoader().getResourceAsStream("Employee.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));

            String line; //hold the value of each line read from the file
            String[] lineArray; //hold the array of each string from the line
            Employee emp;
            List<Employee> employeeList = new ArrayList<>();

            reader.readLine(); //Used to skip the first line

            while ((line = reader.readLine()) != null){
                lineArray = line.split(",");

                emp = new Employee(
                        lineArray[0], Integer.parseInt(lineArray[1]), lineArray[2], Integer.parseInt(lineArray[3]),
                        Integer.parseInt(lineArray[4]), lineArray[5], lineArray[6], Integer.parseInt(lineArray[7]),
                        Integer.parseInt(lineArray[7]));

                employeeList.add(emp);
                employeeList.stream().forEach(n -> System.out.println(n.toString()));
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
