package com.designpattern.abstractpattern;

public class AndroidDeveloper implements Employee {
    public int salary() {
      return 45000;
    }
    public String name() {
      System.out.println("I am a Android Developer");
      return "Android Developer";
    }
}

