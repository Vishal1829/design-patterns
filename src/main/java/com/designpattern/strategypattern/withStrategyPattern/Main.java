package com.designpattern.strategypattern.withStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new PassengerVehicle();
        vehicle.drive();
    }
}
