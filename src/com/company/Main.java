package com.company;

public class Main {

    public static void main(String[] args) {
		TicketSystem sys = new TicketSystem();

		sys.createBus("Oslo", "Stavanger");
		sys.createBus("Berlin", "Roma");

		sys.createPassenger("Adam", "1993", "Komarom");
		sys.createPassenger("Csilla", "1984", "Gyor");

		Passenger p1 = sys.findPassengerByName("Adam");
		p1.createTicket("2020.11.", "Oslo", "Stavanger");

		Passenger p2 = sys.findPassengerByName("Csilla");
		p2.createTicket("2020.11.", "Oslo", "Stavanger");
		p2.createTicket("2021.03.", "Berlin", "Roma");
		sys.printPassengerTickets("Adam");

		System.out.println(sys.checkAvailability("Oslo", "Stavanger"));

		sys.addPassengerToBus(p1, "Oslo", "Stavanger");
		sys.addPassengerToBus(p2, "Oslo", "Stavanger");

		sys.printPassengerTickets("Csilla");

	}
}
