package com.designpattern.abstractpattern;

public class Manager implements Employee {
  public int salary() {
    return 80000;
  }
  public String name() {
    System.out.println("I am a Manager");
    return "Manager";
  }
}
