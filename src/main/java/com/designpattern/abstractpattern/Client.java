package com.designpattern.abstractpattern;

public class Client {
    public static void main(String[] args) {
        
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(e1.name());

        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(e2.name());

        Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
        System.out.println(e3.name());
    }
}
