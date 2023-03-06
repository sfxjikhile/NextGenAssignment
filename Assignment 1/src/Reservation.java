public class Reservation { // This creates the Reservation class
    private int ticketID; // This creates the private int variable ticketID

    public Reservation(int ticketID) { // This constructor initializes the variable
        this.ticketID = ticketID;
    }

    //Getter method for ticketID
    public int showTicket() {
        //This method shows the ticket ID public void showTicket()
        System.out.println("Ticket ID: " + ticketID);
        return ticketID;

}
public static void main(String[] args) {
    // This creates an object of the Reservation class
    Reservation reservation = new Reservation(12345);
    System.out.println(reservation.showTicket());

    // This calls the showTicket() method reservation.showTicket();
}
}
