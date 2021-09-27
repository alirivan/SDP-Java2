package com.company;

public class Driver {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "张明", 2000);

        new HumanResources(emp);
        new HighManagement(emp);

        emp.setSalary(2200);
        System.out.println("-------------------------------------------------");
        emp.setSalary(3300);
    }
}
