package com.designpattern.strategypattern.withStrategyPattern;

import com.designpattern.strategypattern.withStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
  
    DriveStrategy driveObject;

    //this is known as constructor injection
    public Vehicle(DriveStrategy driveObj) {
      this.driveObject = driveObj;
    }

    public void drive() {
        driveObject.drive();
    }

}
