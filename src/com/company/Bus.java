package com.company;

public class Bus {

    //two 2x20 two-dimensional arrays that hold Passenger objects
    //represent the left and right side of the bus
    Passenger[][] leftSide = new Passenger[2][20];
    Passenger[][] rightSide = new Passenger[2][20];

    //instance variables for place of departure and destination:
    private String placeOfDeparture;
    private String destination;
}
