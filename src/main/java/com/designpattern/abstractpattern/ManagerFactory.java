package com.designpattern.abstractpattern;

public class ManagerFactory extends EmployeeAbstractFactory {

  public Employee createEmployee() {
      return new Manager();
  }
}
