package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;


    public Employee(int employeeID, String name, float hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public double getGrossPay(){
        if (hoursWorked > 40){
            double overTimeHours = hoursWorked - 40;
            return (payRate * 40) + (payRate * overTimeHours * 1.5);

        }
        else {
            return  hoursWorked * payRate;
        }
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return  hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
