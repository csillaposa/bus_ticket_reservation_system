package com.company;

public interface ITicketSystem {
    void createBus(String departure, String destination);
    void createPassenger(String name, String dob, String address);
    Bus findBus(String departure, String destination);
    void addPassengerToBus(Passenger p, String departure, String destination);
    void removePassengerFromBus(Passenger p, String departure, String destination);
    void deleteSeatReservation(String side, int row, int seat, String departure, String destination);
    boolean checkAvailability(String departure, String destination);
    Passenger findPassengerByName(String name);
    void printPassengerTickets(String name);
}
