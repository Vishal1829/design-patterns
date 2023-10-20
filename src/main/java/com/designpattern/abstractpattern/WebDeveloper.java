package com.designpattern.abstractpattern;

public class WebDeveloper implements Employee {
  public int salary() {
    return 60000;
  }
  public String name() {
    System.out.println("I am a Web Developer");
    return "Web Developer";
  }
}

