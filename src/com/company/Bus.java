package com.company;

public class Bus {

    //two 2x20 two-dimensional arrays that hold Passenger objects
    //represent the left and right side of the bus
    Passenger[][] leftSide = new Passenger[2][20];
    Passenger[][] rightSide = new Passenger[2][20];

    //instance variables for place of departure and destination:
    private String placeOfDeparture;
    private String destination;

    //constructor for the instance variables and arrays
    public Bus(Passenger[][] leftSide, Passenger[][] rightSide, String placeOfDeparture, String destination) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.placeOfDeparture = placeOfDeparture;
        this.destination = destination;
    }

    //expected functions:

    //check if there is available seat on the bus
    public boolean checkIfThereIsAvailableSeat() {

    }

    //reserve the next available seat by placing Passenger p in one of the two arrays
    public void reserveNextAvailableSeat(Passenger p) {

    }

    //delete seat reservation based on the place on the bus
    public void deleteSeatReservation(String side, int row, int seat) {

    }

    //check if Passenger is on the bus, if yes, delete
    public void deletePassengerReservation(Passenger p) {
        
    }
}
