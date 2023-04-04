public class Reservation {
    private int ticketID;

    public Reservation(int ticketID) {
        this.ticketID = ticketID;
    }

    public void ShowTicket() {
        System.out.println("Ticket ID: " + ticketID);
    }

    public static void main(String[] args) {
        Reservation reservation = new Reservation(1234);
        reservation.ShowTicket();
    }
}
