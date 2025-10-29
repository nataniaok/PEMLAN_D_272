package com.resto;

/**
 * Kelas induk untuk item menu di restoran.
 */
public class MenuItem {
    protected String nama;
    protected double harga;
    protected int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getTotalHarga() {
        return harga * jumlah;
    }

    public String getDeskripsi() {
        return nama;
    }
}
