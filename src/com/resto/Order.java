package com.resto;

import java.util.ArrayList;

/**
 * Mengelola daftar pesanan dan perhitungan total pembayaran.
 */
public class Order {
    private ArrayList<MenuItem> daftarPesanan = new ArrayList<>();

    public void tambahPesanan(MenuItem item) {
        daftarPesanan.add(item);
    }

    public double hitungSubtotal() {
        double total = 0;
        for (MenuItem item : daftarPesanan) {
            total += item.getTotalHarga();
        }
        return total;
    }

    public double hitungPajak(double subtotal) {
        return subtotal * 0.1;
    }

    public double hitungDiskon(double subtotal) {
        return subtotal > 50000 ? subtotal * 0.05 : 0;
    }

    public void cetakNota() {
        System.out.println("\n======= NOTA PEMESANAN =======");
        for (MenuItem item : daftarPesanan) {
            System.out.printf("%-25s x%d\tRp %.0f%n", item.getDeskripsi(), item.getJumlah(), item.getTotalHarga());
        }

        double subtotal = hitungSubtotal();
        double pajak = hitungPajak(subtotal);
        double diskon = hitungDiskon(subtotal);
        double totalAkhir = subtotal + pajak - diskon;

        System.out.println("----------------------------------");
        System.out.printf("Subtotal\t: Rp %.0f%n", subtotal);
        System.out.printf("Pajak (10%%)\t: Rp %.0f%n", pajak);
        System.out.printf("Diskon (5%%)\t: Rp %.0f%n", diskon);
        System.out.println("----------------------------------");
        System.out.printf("TOTAL BAYAR\t: Rp %.0f%n", totalAkhir);
        System.out.println("======= TERIMA KASIH =======");
    }
}
