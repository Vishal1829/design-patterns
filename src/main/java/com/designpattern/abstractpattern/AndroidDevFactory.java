package com.designpattern.abstractpattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {
    
  public Employee createEmployee() {
      return new AndroidDeveloper();
  }
}

