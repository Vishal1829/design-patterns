package com.designpattern.strategypattern.withStrategyPattern;

import com.designpattern.strategypattern.withStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

  public OffRoadVehicle() {
    super(new SportsDriveStrategy());
  }
}
