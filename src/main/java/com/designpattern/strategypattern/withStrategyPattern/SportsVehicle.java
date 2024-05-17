package com.designpattern.strategypattern.withStrategyPattern;

import com.designpattern.strategypattern.withStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
  
  public SportsVehicle() {
    super(new SportsDriveStrategy());
  }
}
