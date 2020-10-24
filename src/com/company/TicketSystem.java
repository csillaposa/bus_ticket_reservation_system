package com.company;

import java.util.ArrayList;

public class TicketSystem {
    private ArrayList<Bus> busArrayList = new ArrayList<Bus>();
    private ArrayList<Passenger> passengerArrayList = new ArrayList<Passenger>();

    //functions

    //creates a new Bus object and add it to the ArrayList
    public void createBus(String departure, String destination) {
        busArrayList.add(new Bus(departure, destination));
    }

    //creates a new Passenger object and add it to the ArrayList
    public void createPassenger(String name, String dob, String address) {
        passengerArrayList.add(new Passenger(name, dob, address));
    }

    //finds a bus by departure and destination
    public Bus findBus(String departure, String destination) {
        for (Bus bus : busArrayList) {
            if (bus.getDeparture().equals(departure) && bus.getDestination().equals(destination)) {
                return bus;
            }
        }
        return null;
    }

    //adds Passenger to a specific bus
    public void addPassengerToBus(Passenger p, String departure, String destination) {
        Bus bus = findBus(departure, destination);
        if (bus != null) {
            bus.reserveNextAvailableSeat(p);
        }
    }

    //removes Passenger from a specific bus
    public void removePassengerFromBus(Passenger p, String departure, String destination) {
        Bus bus = findBus(departure, destination);
        if (bus != null) {
            bus.deletePassengerReservation(p);
        }
    }

    //delete seat reservation
    public void deleteSeatReservation(String side, int row, int seat, String departure, String destination) {
        Bus bus = findBus(departure, destination);
        if (bus != null) {
            bus.deleteSeatReservation(side, row, seat);
        }
    }

    //checks if there is at least one available seat on the bus
    public boolean checkAvailability(String departure, String destination) {
        Bus bus = findBus(departure, destination);
        if (bus != null) {
            return bus.checkIfThereIsAvailableSeat();
        }
        return false;
    }

    //finds passenger by name
    public Passenger findPassengerByName(String name) {
        for (Passenger passenger: passengerArrayList) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        }
        return null;
    }

    //finds Passenger and prints tickets from Passenger
    public void printPassengerTickets(String name) {
        Passenger passenger = findPassengerByName(name);
        if (passenger != null) {
            System.out.println(passenger.getTickets());
        }
    }


}
