import java.util.Scanner;

// Custom Exception
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class ValidasiAngka {
    // Method untuk memvalidasi angka
    public static void validateNumber(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Error: Angka harus positif!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input angka dari pengguna
            System.out.print("Masukkan angka positif: ");
            int angka = scanner.nextInt();

            // Validasi angka
            validateNumber(angka);

            // Jika valid
            System.out.println("Angka valid: " + angka);

        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage()); // Menampilkan pesan error custom
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan angka!");
        } finally {
            scanner.close();
        }
    }
}
