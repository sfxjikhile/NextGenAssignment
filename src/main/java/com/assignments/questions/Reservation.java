package com.assignments.questions;

// Reservation Class - Question 2;
public class Reservation {
    String ticketID;

    public Reservation(String ticketID){
        this.ticketID = ticketID;
    }

    public String getTicketID(){
        return this.ticketID;
    }

    public void setTicketID(String newTicketID){
        this.ticketID = newTicketID;
    }

    public void showTicket(){
        System.out.println("Your ticket ID is: " + this.ticketID);
    }

    public static void main(String[] args){
        Reservation reservation = new Reservation("125395");
        reservation.showTicket();
    }
}
