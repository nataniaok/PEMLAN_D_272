package com.resto;

/**
 * Kelas turunan untuk minuman.
 * Menambahkan keterangan apakah dingin atau panas.
 */
public class Minuman extends MenuItem {
    private boolean dingin;

    public Minuman(String nama, int jumlah, boolean dingin) {
        super(nama, tentukanHargaMinuman(nama), jumlah);
        this.dingin = dingin;
    }

    private static double tentukanHargaMinuman(String nama) {
        switch (nama.toLowerCase()) {
            case "es teh": return 5000;
            case "es jeruk": return 7000;
            case "kopi": return 8000;
            case "air mineral": return 4000;
            default: return 6000; // harga default
        }
    }

    @Override
    public String getDeskripsi() {
        return nama + (dingin ? " (Dingin)" : " (Panas)");
    }
}
