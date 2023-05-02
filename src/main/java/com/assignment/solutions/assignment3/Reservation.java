package com.assignment.solutions.assignment3;

public class Reservation {

    int ticketID;
    Reservation(int ticketID) {
        this.ticketID = ticketID;
    }

    void showTicket(){
        System.out.println(this.ticketID);
    }

    public static void main(String[] args){
        Reservation reservation = new Reservation(7888);
        reservation.showTicket();

    }
}
