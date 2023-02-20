package com.solutions.done;

public class Reservation {

    String ticketID;
    public Reservation() {
        ticketID = "Wakanda_001";
    }

    public void ShowTicket(){
        System.out.println(ticketID);
    }

    public static void main(String[] args){
        Reservation id = new Reservation();
        id.ShowTicket();
        System.out.println(id.ticketID);
    }
}
