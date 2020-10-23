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
    public Bus(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    //expected functions:

    //check if there is available seat on the bus
    public boolean checkIfThereIsAvailableSeat() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 2; j++) {
                if (leftSide[i][j] == null || rightSide[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    //reserve the next available seat by placing Passenger p in one of the two arrays
    public void reserveNextAvailableSeat(Passenger p) {
        if (checkIfThereIsAvailableSeat()) {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 2; j++) {
                    if (leftSide[i][j] == null) {
                        leftSide[i][j] = p;
                        return;
                    }
                    if (rightSide[i][j] == null) {
                        rightSide[i][j] = p;
                        return;
                    }
                }
            }
        }
    }

    //delete seat reservation based on the place on the bus
    public void deleteSeatReservation(String side, int row, int seat) {
        if (side == "left") {
            leftSide[row][seat] = null;
        } else {
            rightSide[row][seat] = null;
        }
    }

    //check if Passenger is on the bus, if yes, delete
    public void deletePassengerReservation(Passenger p) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 2; j++) {
                if (leftSide[i][j] == p) {
                    deleteSeatReservation("left", i , j);
                    return;
                }
                if (rightSide[i][j] == p) {
                    deleteSeatReservation("right", i , j);
                    return;
                }
            }
        }
    }

    //override the default toString function and give back a nicely formatted passenger list
    @Override
    public String toString() {
        String passengerList = "";
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 2; j++) {
                passengerList += leftSide[i][j];
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 2; j++) {
                passengerList += rightSide[i][j];
            }
        }
        return passengerList + "\n";
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
