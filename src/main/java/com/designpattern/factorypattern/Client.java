package com.designpattern.factorypattern;

public class Client {
  public static void main(String[] args) {
      Employee employee1 = EmployeeFactory.getEmployee("Web Developer");
      System.out.println(employee1.salary());

      Employee employee2 = EmployeeFactory.getEmployee("Android Developer");
      System.out.println(employee2.salary());
  }
}

/*
Factory Design Pattern:-
When there is superclass and multiple subclasses and we want to get object of subclasses based on input and requirement.
Then we create factory class which takes the responsibility of creating object of class based on input.

Advantages of Factory Design Pattern:-
  1. Focus on creating object for interface rather than implementation.
  2. Loose coupling, more robust code.
*/
