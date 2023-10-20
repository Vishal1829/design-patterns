package com.designpattern.abstractpattern;

public class WebDevFactory extends EmployeeAbstractFactory {

  public Employee createEmployee() {
      return new WebDeveloper();
  } 
}

