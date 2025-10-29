import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ==================== Spesifikasi Formal ====================
        // Precondition (P):
        // - Input nama berupa string.
        // - Input nilai berupa bilangan bulat (integer) dengan syarat nilai >= 0.
        //
        // Command (C):
        // - Program membaca input nama mahasiswa.
        // - Program membaca input nilai ujian akhir.
        // - Program memeriksa apakah nilai >= 60.
        //   Jika ya -> status = "Lulus"
        //   Jika tidak -> status = "Tidak Lulus"
        //
        // Postcondition (Q):
        // - Program menampilkan "Nama: <nama> | Status: <Lulus/Tidak Lulus>"

        // ==================== Spesifikasi Informal ====================
        // Deskripsi:
        // Program menentukan status kelulusan mahasiswa berdasarkan nilai ujian akhir.
        //
        // Input:
        // - Nama mahasiswa (String)
        // - Nilai ujian akhir (integer, minimal 0)
        //
        // Proses:
        // - Jika nilai >= 60 -> mahasiswa dinyatakan Lulus
        // - Jika nilai < 60 -> mahasiswa dinyatakan Tidak Lulus
        //
        // Output:
        // - Nama mahasiswa beserta status kelulusannya

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai ujian akhir: ");
        int nilai = input.nextInt();

        String status;
        if (nilai >= 60) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }

        System.out.println("Nama: " + nama + " | Status: " + status);
        input.close();
    }
}