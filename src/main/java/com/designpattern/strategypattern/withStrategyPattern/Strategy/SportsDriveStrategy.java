package com.designpattern.strategypattern.withStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy {
  
  @Override
  public void drive() {
    
      System.out.println("sports drive capability");
  }

}
