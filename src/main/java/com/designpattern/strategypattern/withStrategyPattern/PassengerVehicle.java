package com.designpattern.strategypattern.withStrategyPattern;

import com.designpattern.strategypattern.withStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

  public PassengerVehicle() {
    super(new NormalDriveStrategy());
  }
}
