package com.company;

public class Main {

    public static void main(String[] args) {
		TicketSystem sys = new TicketSystem();

		sys.createPassenger("Roger", "1968", "Oslo");
		sys.createPassenger("Csilla", "1984", "Movar");

		sys.createBus("Oslo", "Madrid");
		sys.createBus("Stockholm", "Oslo");

		sys.findPassengerByName("Roger").createTicket("2020", "Oslo", "Madrid");
	}
}
