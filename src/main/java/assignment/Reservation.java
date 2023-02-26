package assignment;

public class Reservation {
    // Assignment number 2
    String ticketId;
    public Reservation(String id){
        ticketId = id;
    }
    public void ShowTicket(){
        System.out.println("Ticket value is: " + ticketId);

    }
    public static void main(String[] args){
        Reservation show = new Reservation("valid");
        show.ShowTicket();
    }
}




