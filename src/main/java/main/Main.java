package main;

import entity.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String line; //hold the value of each line read from the file
        String[] lineArray; //hold the array of each string from the line
        Employee emp;
        List<Employee> employeeList = new ArrayList<>();

        //Reading the data from the csv file
        try{
            InputStream file = Main.class.getClassLoader().getResourceAsStream("Employee.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));

            reader.readLine(); //Used to skip the first line

            while ((line = reader.readLine()) != null){
                lineArray = line.split(",");

                emp = new Employee(
                        lineArray[0], Integer.parseInt(lineArray[1]), lineArray[2], Integer.parseInt(lineArray[3]),
                        Integer.parseInt(lineArray[4]), lineArray[5], lineArray[6], Integer.parseInt(lineArray[7]),
                        Integer.parseInt(lineArray[7]));

                employeeList.add(emp);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        //Using filter and forEach
        employeeList.stream()
                .filter(n -> n.getYear() >= 2010 && n.getGender().equalsIgnoreCase("male"))
                .forEach(n -> System.out.println(n.toString()));

        //Using Joining
        String employeeDepartment = employeeList.stream()
                .map(Employee::getEducation)
                .collect(Collectors.joining(", ", "[Education: ", " ]"));
        System.out.println(employeeDepartment);

        //Using grouping
        Map<String, List<Integer>> cityGrouping = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCity, Collectors.mapping(Employee::getAge, Collectors.toList())));
        cityGrouping.forEach((city,age) -> System.out.println(city + " : " + age));

        //Using grouping and unModifiableList
        List<Employee> maleEmployee = employeeList.stream()
                                                    .filter(n -> n.getGender().equalsIgnoreCase("male"))
                                                    .collect(Collectors.toUnmodifiableList());

    }
}
