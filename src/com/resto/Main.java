package com.resto;

import java.util.Scanner;

/**
 * Program utama sistem restoran interaktif.
 * - Harga otomatis dari nama menu.
 * - Validasi jenis: tidak bisa input makanan di menu minuman, dan sebaliknya.
 * - Pesan ramah saat input salah agar user tidak bingung.
 * - Fitur pedas/dingin sesuai kategori.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.println("=== SISTEM PEMESANAN RESTORAN ===");

        boolean lanjut = true;
        while (lanjut) {
            System.out.print("\nPilih jenis menu (1. Makanan / 2. Minuman): ");
            int jenis = sc.nextInt();
            sc.nextLine(); // bersihkan buffer

            System.out.print("Nama item: ");
            String nama = sc.nextLine().toLowerCase(); // ubah ke huruf kecil agar mudah dibandingkan

            // Validasi jenis menu berdasarkan nama
            boolean adalahMakanan = cekNamaMakanan(nama);
            boolean adalahMinuman = cekNamaMinuman(nama);

            // Validasi langsung setelah input nama (sebelum minta jumlah)
            if (jenis == 1 && adalahMinuman) {
                System.out.println("⚠️  Yang kamu masukkan adalah MINUMAN, bukan MAKANAN!");
                System.out.println("👉 Silakan masukkan nama makanan, misalnya: nasi goreng, mie ayam, soto ayam, dll.");
                continue; // ulangi input
            } else if (jenis == 2 && adalahMakanan) {
                System.out.println("⚠️  Yang kamu masukkan adalah MAKANAN, bukan MINUMAN!");
                System.out.println("👉 Silakan masukkan nama minuman, misalnya: es teh, kopi, air mineral, dll.");
                continue; // ulangi input
            }

            System.out.print("Jumlah: ");
            int jumlah = sc.nextInt();
            sc.nextLine(); // bersihkan buffer

            if (jenis == 1) {
                System.out.print("Apakah makanan ini pedas? (y/n): ");
                boolean pedas = sc.next().equalsIgnoreCase("y");
                Makanan makanan = new Makanan(nama, jumlah, pedas);
                order.tambahPesanan(makanan);

            } else if (jenis == 2) {
                System.out.print("Apakah minuman ini dingin? (y/n): ");
                boolean dingin = sc.next().equalsIgnoreCase("y");
                Minuman minuman = new Minuman(nama, jumlah, dingin);
                order.tambahPesanan(minuman);

            } else {
                System.out.println("⚠️ Jenis tidak valid! Pilih 1 (Makanan) atau 2 (Minuman).");
                continue;
            }

            System.out.print("\nTambah item lagi? (y/n): ");
            lanjut = sc.next().equalsIgnoreCase("y");
            sc.nextLine(); // bersihkan buffer
        }

        order.cetakNota();
        sc.close();
    }

    /**
     * Mengecek apakah nama yang dimasukkan termasuk kategori makanan.
     */
    private static boolean cekNamaMakanan(String nama) {
        return nama.contains("nasi") || nama.contains("mie") || nama.contains("ayam")
                || nama.contains("soto") || nama.contains("bakso") || nama.contains("pecel")
                || nama.contains("rawon") || nama.contains("padang") || nama.contains("rendang");
    }

    /**
     * Mengecek apakah nama yang dimasukkan termasuk kategori minuman.
     */
    private static boolean cekNamaMinuman(String nama) {
        return nama.contains("es") || nama.contains("kopi") || nama.contains("air")
                || nama.contains("teh") || nama.contains("susu") || nama.contains("jus")
                || nama.contains("coklat") || nama.contains("lemon") || nama.contains("thai");
    }
}
