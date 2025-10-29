package TaxiTicket;// ===============================
// TUGAS 2 - TAXI TICKET (Before Refactoring)
// Komentar disesuaikan dengan 7 langkah refactoring di modul Codelab
// ===============================

public class TaxiTicket extends Ticket implements Operational {
    public static final double TAX_RATE = 0.1;
    public double duration;
    private double speed; // sudah private (nanti tetap dipertahankan)

    // (Langkah 3 - Introduce Constant)
    // Konstanta MIN_SPEED dan MAX_SPEED sudah ada → nanti tetap, hanya TAX_RATE akan ditambah
    private static final double MIN_SPEED = 5;
    private static final double MAX_SPEED = 100;
    

    // Konstruktor awal dengan parameter panjang → (Langkah 7 - Introduce Parameter Object)
    // Nanti akan dibuat class TicketInfo untuk menampung parameter ini
    public TaxiTicket(TicketInfo ticketInfo) {
        this.passengerName = ticketInfo.passengerName();
        this.startLocation = ticketInfo.startLocation();
        this.destination = ticketInfo.destination();
        this.price = ticketInfo.price();
        this.duration = ticketInfo.duration();
        this.speed = ticketInfo.speed();
    }

    // (Langkah 2 - Rename Method)
    // Method cS() → nanti diganti jadi checkStatus()
    @Override
    public void checkStatus() {
        System.out.println("Your taxi is heading to " + destination);
    }

    // (Langkah 2 - Rename Method)
    // Method dED() → nanti jadi displayEstimatedDuration()
    @Override
    public void displayEstimatedDuration() {
        System.out.println("Estimated travel duration: " + duration + " minutes");
    }

    // (Langkah 2 - Rename Method)
    // Method dR() → nanti jadi displayRoute()
    @Override
    public void displayRoute() {
        System.out.println("Route: " + startLocation + " -> " + destination);
    }

    // Method untuk memperlambat taksi
    // Tidak diubah banyak, tapi nama variabel bisa diganti sesuai konvensi
    public void slowDown(double speedReduction) {
        speed -= speedReduction;
        if (speed < MIN_SPEED)
            speed = MIN_SPEED;
        duration += speedReduction * 0.5;
        System.out.println("Taxi slowed down! Current speed: " + speed + " km/h");
    }

    // Method untuk menambah kecepatan
    public void speedUp(double speedIncrease) {
        speed += speedIncrease;
        if (speed > MAX_SPEED)
            speed = MAX_SPEED;
        System.out.println("Taxi sped up! Current speed: " + speed + " km/h");
    }

    // (Langkah 2 - Rename Method)
    // Method dI() → nanti jadi displayInfo()
    // (Langkah 3 - Introduce Constant) angka 0.1 nanti jadi TAX_RATE
    // (Langkah 4 - Extract Method) rumus perhitungan harga akhir dipindah ke method baru
    @Override
    public void displayInfo() {
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Start Location  : " + startLocation);
        System.out.println("Destination     : " + destination);
        System.out.println("Price           : " + price);
        calculateFinalPrice(); // ← magic number 0.1
    }

    private void calculateFinalPrice() {
        System.out.println("Final Price     : " + (price + (price * TAX_RATE)));
    }

    // Menampilkan detail lengkap
    public void detailedInfo() {
        displayInfo();
        System.out.println("Duration        : " + duration + " minutes");
        System.out.println("Speed           : " + speed + " km/h");
    }

    class MainApp {

    }

}