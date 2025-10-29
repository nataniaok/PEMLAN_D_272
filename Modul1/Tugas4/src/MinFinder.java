public class MinFinder {

    // Fungsi untuk mencari nilai minimum dari tiga bilangan
    public static int findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    // Main method untuk menguji fungsi findMin()
    public static void main(String[] args) {
        // Skenario 1
        int hasil1 = findMin(1, 2, 3);
        System.out.println("Skenario 1 (1, 2, 3) -> Minimum: " + hasil1);

        // Skenario 2
        int hasil2 = findMin(-1, -2, -3);
        System.out.println("Skenario 2 (-1, -2, -3) -> Minimum: " + hasil2);

        // Skenario 3
        int hasil3 = findMin(0, 0, 1);
        System.out.println("Skenario 3 (0, 0, 1) -> Minimum: " + hasil3);
    }
}
