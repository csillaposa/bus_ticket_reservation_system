package com.company;

public class Bus {

    //two 2x20 two-dimensional arrays that hold Passenger objects
    //represent the left and right side of the bus
    private Passenger[][] leftSide = new Passenger[20][2];
    private Passenger[][] rightSide = new Passenger[20][2];

    //instance variables for place of departure and destination:
    private String departure;
    private String destination;

    //constructor for the instance variables and arrays
    public Bus(Passenger[][] leftSide, Passenger[][] rightSide, String Departure, String destination) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.departure = Departure;
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

    //override the default toString function and give back a nicely formatted passenger list
    @Override
    public String toString() {
    }

    //returns the place of departure
    public String getDeparture() {
        return departure;
    }

    //returns the destination
    public String getDestination() {
        return destination;
    }
}
