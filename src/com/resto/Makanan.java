package com.resto;

/**
 * Kelas turunan untuk makanan.
 * Menambahkan keterangan apakah makanan pedas.
 */
public class Makanan extends MenuItem {
    private boolean pedas;

    public Makanan(String nama, int jumlah, boolean pedas) {
        super(nama, tentukanHargaMakanan(nama), jumlah);
        this.pedas = pedas;
    }

    private static double tentukanHargaMakanan(String nama) {
        switch (nama.toLowerCase()) {
            case "nasi goreng": return 15000;
            case "mie ayam": return 12000;
            case "ayam geprek": return 18000;
            case "soto ayam": return 13000;
            default: return 10000; // harga default
        }
    }

    @Override
    public String getDeskripsi() {
        return nama + (pedas ? " (Pedas)" : " (Tidak Pedas)");
    }
}
