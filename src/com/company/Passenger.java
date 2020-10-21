package com.company;

import java.util.ArrayList;

public class Passenger {

    //the array list that holds Ticket objects
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    //instance variables for this class:
    private String name;
    private String dob;
    private String address;

    //constructor
    public Passenger(String name, String dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    //expected functions:

    //getters:
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    //create a new ticket and add it to the array list
    public void createTicket(String date, String departure, String destination) {
        tickets.add(new Ticket(date, departure, destination));
    }

    //override the toString function and represent the Passenger object with nicely formatted info about him/her instead
    @Override
    public String toString() {
        return "Passenger information: \n" +
                "Name: " + getName() + "\n" +
                "Date of birth: " + getDob() + "\n" +
                "Address: " + getAddress() + "\n";
    }
}
