package com.company;

public class Ticket {

    //ticket serial num int that is increased by 1 each time we create a new ticket obj
    //each ticket should have a unique serial num
    //use static
    private static int serialNumber;

    //instance variables
    private String ticketHolder;
    private String date;
    private String departure;
    private String destination;

    //constructor
    public Ticket(String ticketHolder, String date, String departure, String destination) {
        this.ticketHolder = ticketHolder;
        this.date = date;
        this.departure = departure;
        this.destination = destination;
    }

    //getters and setters
    public String getTicketHolder() {
        return ticketHolder;
    }

    public void setTicketHolder(String ticketHolder) {
        this.ticketHolder = ticketHolder;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    //overrides the default toString and returns a nicely formatted String info about the ticket
    @Override
    public String toString() {
        
    }
}
