package com.company;

import java.util.ArrayList;

public class TicketSystem {
    private ArrayList<Bus> bus = new ArrayList<Bus>();
    private ArrayList<Passenger> passenger = new ArrayList<Passenger>();

    //functions

    //creates a new Bus object and add it to the ArrayList
    public void createBus(String departure, String destination) {
        bus.add(new Bus(departure, destination));
    }

    //creates a new Passenger object and add it to the ArrayList
    public void createPassenger(String name, String dob, String address) {
        passenger.add(new Passenger(name, dob, address));
    }

    //finds a bus by departure and destination
    public Bus findBus(String departure, String destination) {
        for (Bus bus : bus) {
            if (bus.getDeparture().equals(departure) && bus.getDestination().equals(destination)) {
                return bus;
            } else {
                System.out.println("There is no bus from " + departure + " to" + destination);
            }
        }
        return null;
    }

    //adds Passenger to a specific bus
    public void addPassengerToBus(Passenger p, String departure, String destination) {
        for (Bus bus : bus) {
            if (bus.getDeparture().equals(departure) && bus.getDestination().equals(destination)) {
                passenger.add(p);
            } else {
                System.out.println("There is no bus with from " + departure + " to" + destination);
            }
        }
    }

    //removes Passenger from a specific bus
    public void removePassengerFromBus(Passenger p, String departure, String destination) {
        for (Bus bus : bus) {
            if (bus.getDeparture().equals(departure) && bus.getDestination().equals(destination)) {
                passenger.remove(p);
                System.out.println("Passenger " + p + " is removed from the bus from " + departure + " to " + destination);
            } else {
                System.out.println("There is no bus with from " + departure + " to" + destination);
            }
        }
    }

    //delete seat reservation
    public void deleteSeatReservation(String side, int row, int seat, String departure, String destination) {
        for (Bus bus : bus) {
            if (bus.getDeparture().equals(departure) && bus.getDestination().equals(destination)) {
                bus.deleteSeatReservation(side, row, seat);
                System.out.println("Bus ticket reservation from " + departure + " to " + destination + " " + side +
                        " side, " + row + "th row, #" + seat + " seat is cancelled." );
            } else {
                System.out.println("There is no bus with from " + departure + " to" + destination);
            }
        }
    }

    //checks if there is at least one available seat on the bus
    public boolean checkAvailability(String departure, String destination) {
        for (Bus bus : bus) {
            if (bus.getDeparture().equals(departure) && bus.getDestination().equals(destination)) {
                if (bus.checkIfThereIsAvailableSeat()) {
                    return true;
                }
            } else {
                System.out.println("There is no bus with from " + departure + " to" + destination);
            }
        }
        return false;
    }

    //finds passenger by name
    public Passenger findPassengerByName(String name) {
        for (Passenger p : passenger) {
            if (p.getName().equals(name)) {
                return p;
            } else {
                System.out.println("No passenger found by the name: " + name);
            }
        }
        return null;
    }

    //finds Passenger and prints tickets from Passenger
    public void printPassengerTickets(String name) {
        for (Passenger p : passenger) {
            if (p.getName().equals(name)) {

            } else {
                System.out.println("No passenger found by the name: " + name);
            }
        }
    }


}
