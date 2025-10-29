package TaxiTicket;

public class MainApp {
    // (Langkah 5 - Move Method)
    // Method main() nanti akan DIPINDAHKAN ke class baru MainApp.java
    public static void main(String[] args) {
        TaxiTicket ticket = new TaxiTicket(new TicketInfo("Alice", "Downtown", "Airport", 50.0, 30.0, 60.0));

        ticket.detailedInfo(); // Display full info
        ticket.checkStatus();           // Check taxi status
        ticket.displayRoute();           // Display route
        ticket.displayEstimatedDuration();          // Display estimated duration

        // Simulate slowing down and speeding up
        ticket.slowDown(20);
        ticket.speedUp(15);
    }

    public static interface Operational {
        // (Langkah 2 - Rename Method)
        // Method cS() → nanti diganti jadi checkStatus()
        void checkStatus();

        // (Langkah 2 - Rename Method)
        // Method dED() → nanti jadi displayEstimatedDuration()
        void displayEstimatedDuration();

        // (Langkah 2 - Rename Method)
        // Method dR() → nanti jadi displayRoute()
        void displayRoute();
    }
}
