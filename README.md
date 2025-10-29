/*
# 🍽️ Aplikasi Nota Pemesanan Restoran (Interaktif)

Program ini merupakan implementasi dari **Modul 3 - Pemrograman Lanjut (Modern Programming Environment & Documentation Style)**.
Aplikasi dikembangkan menggunakan bahasa **Java** dengan konsep **Object-Oriented Programming (OOP)**,
serta memanfaatkan fitur **autocomplete**, **Live Template**, dan **JavaDoc** pada **IntelliJ IDEA**.

## ✨ Deskripsi Program
Aplikasi ini mensimulasikan sistem pemesanan makanan dan minuman di restoran.
User dapat:
- Memilih jenis menu (makanan atau minuman)
- Memasukkan nama menu (dengan harga otomatis)
- Menentukan jumlah pesanan
- Menentukan apakah makanan pedas atau tidak
- Menentukan apakah minuman dingin atau panas

Program menghitung subtotal, pajak (10%), dan diskon (5%) jika total > Rp50.000, lalu menampilkan nota lengkap di konsol.

## 🧩 Fitur Utama
- 🍜 Harga Otomatis dari nama menu
- 🌶️ Pedas/Tidak Pedas untuk makanan
- ❄️ Dingin/Panas untuk minuman
- ⚠️ Validasi cerdas: tidak bisa input makanan di menu minuman dan sebaliknya
- 💬 Pesan interaktif
- 💰 Hitung otomatis (subtotal, pajak, diskon)
- 📋 Nota pembelian di konsol
- 🧱 OOP: Inheritance (MenuItem → Makanan/Minuman)
- 🧾 JavaDoc dan modularisasi sesuai Modul 3

## 🧱 Struktur Kelas
- MenuItem.java → Kelas induk
- Makanan.java → Turunan untuk makanan
- Minuman.java → Turunan untuk minuman
- Order.java → Mengelola daftar pesanan
- Main.java → Program utama

## 🧾 Pengembang
**Nama:** Natania Oktaviani  
**NIM:** 272  
**Mata Kuliah:** Pemrograman Lanjut (Modul 3 - 2025/2026)  
**Universitas:** Universitas Muhammadiyah Malang
*/
