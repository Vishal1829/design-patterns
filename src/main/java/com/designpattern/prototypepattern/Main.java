package com.designpattern.prototypepattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Creating Object using prototype design");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);
        System.out.println();

        //we want new object of network connection

        try {
          NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
          NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
          System.out.println(networkConnection2);
          System.out.println(networkConnection3);
        } catch (CloneNotSupportedException e) {
          e.printStackTrace();
        }
    }
}

/*
Prototype Design Pattern:-
The concept is to copy an existing object rather than creating a new instance from scratch, because creating new object may be costly.

This approach saves costly resources and time, especially when object creation is a heavy process.
*/
