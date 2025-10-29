package TaxiTicket;

public abstract class Ticket {
    // (Langkah 1 - Encapsulate Field nanti)
    // Saat ini semua atribut masih public → akan diubah jadi private
    public String passengerName;
    public String startLocation;
    public String destination;
    public double price;

    // (Langkah 2 - Rename Method)
    // Method dI() → nanti jadi displayInfo()
    // (Langkah 3 - Introduce Constant) angka 0.1 nanti jadi TAX_RATE
    // (Langkah 4 - Extract Method) rumus perhitungan harga akhir dipindah ke method baru
    public abstract void displayInfo();
}
