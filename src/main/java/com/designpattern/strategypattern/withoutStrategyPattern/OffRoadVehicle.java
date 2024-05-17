package com.designpattern.strategypattern.withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {

  @Override
  public void drive() {
      //different drive logic
      System.out.println("sports drive capability");
  }
  
}
