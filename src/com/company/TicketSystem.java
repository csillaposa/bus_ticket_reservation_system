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

    //
}
