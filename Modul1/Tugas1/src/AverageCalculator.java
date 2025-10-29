import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah angka
        System.out.print("Masukkan jumlah angka: ");
        int n = scanner.nextInt();

        // Membuat array untuk menyimpan angka
        int[] angka = new int[n];

        // Input angka-angka
        System.out.println("Masukkan angka-angka:");
        for (int i = 0; i < n; i++) {
            angka[i] = scanner.nextInt();
        }

        // Menghitung total
        int total = 0;
        for (int i = 0; i < n; i++) { // Perbaikan index -> mulai dari 0
            total += angka[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / n;
        System.out.println("Rata-rata adalah: " + rataRata);

        scanner.close();
    }
}
