package com.pluralsight;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader filereader = new FileReader("employees.csv");

        BufferedReader bufReader = new BufferedReader(filereader);
        bufReader.readLine();
        String input;

        while ((input = bufReader.readLine()) != null){
            String[] tokens = input.split(Pattern.quote("|"));

            int employeeID = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            float hoursWorked = Float.parseFloat(tokens[2]);
            double payRate = Double.parseDouble(tokens[3]);

            Employee theEmp = new Employee(employeeID, name, hoursWorked, payRate);
            displayEmployee(theEmp);


        }

        bufReader.close();


    }

    private static void displayEmployee(Employee e){
        System.out.printf("%d: %s Pay this period: %.2f\n", e.getEmployeeID(), e.getName(), e.getGrossPay());
    }
}