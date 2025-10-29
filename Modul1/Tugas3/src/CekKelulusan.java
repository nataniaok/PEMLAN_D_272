import java.util.Scanner;

public class CekKelulusan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        int nilai;

        // Perulangan jika nilai < 60
        while (true) {
            System.out.print("Masukkan nilai ujian akhir: ");
            nilai = scanner.nextInt();

            if (nilai >= 60) {
                System.out.println("\n=== HASIL ===");
                System.out.println("Nama Mahasiswa: " + nama);
                System.out.println("Status: Lulus");
                break; // keluar dari perulangan jika nilai sudah lulus
            } else {
                System.out.println("Status: Tidak Lulus");
                System.out.println("Silakan masukkan kembali nilai ujian akhir!\n");
            }
        }

        scanner.close();
    }
}
