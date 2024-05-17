package com.designpattern.strategypattern.withStrategyPattern;

import com.designpattern.strategypattern.withStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
  
  public GoodsVehicle() {
    super(new NormalDriveStrategy());
  }
}
