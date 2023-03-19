package com.assignment.solutions.assignment3;

public class Reservation {
    private int ticketID;

    public Reservation(int ticketID) {
        this.ticketID = ticketID;
    }

    public void showTicket() {
        System.out.println("Ticket ID: " + ticketID);
    }

    public static void main(String[] args) {
        Reservation reservation = new Reservation(1234);
        reservation.showTicket();
    }
}

