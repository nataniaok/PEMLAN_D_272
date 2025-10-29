import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> position = new ArrayList<>();
        ArrayList<Double> salary = new ArrayList<>();

        while (true) {
            System.out.println("=== SISTEM DATA KARYAWAN ===");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Lihat Data Karyawan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                System.out.print("Nama: ");
                name.add(input.nextLine());
                System.out.print("Jabatan: ");
                position.add(input.nextLine());
                System.out.print("Gaji: ");
                salary.add(input.nextDouble());
                input.nextLine();
            } else if (pilih == 2) {
                for (int i = 0; i < name.size(); i++) {
                    System.out.println((i + 1) + ". " + name.get(i) + " - " + position.get(i) + " - Rp" + salary.get(i));
                }
            } else if (pilih == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}