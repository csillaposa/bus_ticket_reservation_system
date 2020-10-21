package com.company;

public class Main {

    public static void main(String[] args) {
	    Bus bus = new Bus("Győr", "Komárom");
	    Passenger passenger = new Passenger("Adam", "1993.", "Komarom");
	    Ticket ticket = new Ticket("Adam", "2020.", "Gyor", "Komarom");


		System.out.println(bus.checkIfThereIsAvailableSeat());
		bus.reserveNextAvailableSeat(passenger);
		System.out.println(bus.toString());

    }
}
