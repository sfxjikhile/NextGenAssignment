package com.assignments.questions;

public class Reservation {
    int ticketID;

    public int showTicket(){
        ticketID = 10;

        return ticketID;
    }

    public static void main(String[] args){
        Reservation reservation = new Reservation();

        System.out.println(reservation.showTicket());
    }

}
