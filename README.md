# 💼 Tugas 2 – Pemrograman Lanjut (PEMLAN_D_272)

## 📌 Deskripsi Program
Program ini merupakan simulasi sederhana mengenai **manajemen karyawan (Employee)**.  
Program menampilkan informasi karyawan sebelum dan sesudah mendapatkan **bonus dan promosi jabatan**.

## 🧩 Struktur Program
tugas2/
├── src/
│ ├── Employee.java
│ └── MainApp.java
├── .idea/
├── out/
├── .gitignore
├── tugas2.iml
└── README.md

## 🧠 Penjelasan Kelas

### `Employee.java`
Kelas `Employee` merepresentasikan data dan perilaku seorang karyawan.  
Berisi atribut:
- `name` : Nama karyawan
- `salary` : Gaji karyawan
- `position` : Jabatan karyawan
- `BONUS_RATE` : Konstanta bonus sebesar 20% dari gaji

Metode utama:
- `giveBonus()` → Menambahkan bonus ke gaji berdasarkan `BONUS_RATE`
- `promote(String newPosition, double raise)` → Mengubah jabatan dan menambahkan kenaikan gaji
- `displayInfo()` → Menampilkan informasi karyawan

Kelas ini juga menerapkan **enkapsulasi** dengan menggunakan modifier `private` pada atribut, serta menyediakan **getter dan setter** untuk mengakses atau mengubah data dengan aman.  
Selain itu, dilakukan **refactoring** pada metode `calculateBonus()` agar kode lebih modular dan mudah dipelihara.

### `MainApp.java`
Kelas utama (`main`) untuk menjalankan program.  
Langkah yang dilakukan:
1. Membuat objek `Employee`
2. Menampilkan informasi sebelum promosi
3. Memberikan bonus dan promosi jabatan
4. Menampilkan informasi setelah promosi

## 🧾 Contoh Output
=== BEFORE PROMOTION ===
Name: Natania Oktaviani
Position: Staff
Salary: 5000000.0
=== AFTER PROMOTION ===
Name: Natania Oktaviani
Position: Supervisor
Salary: 7200000.0

## 🎯 Tujuan Pembelajaran
- Menerapkan **konsep kelas dan objek** dalam Java
- Mempraktikkan **enkapsulasi** dan penggunaan **modifier akses**
- Mengimplementasikan **konstanta (final)** dan **refactoring method**
- Menguji interaksi antar objek melalui **method call**

## ⚙️ Cara Menjalankan Program
1. Buka project di **IntelliJ IDEA** atau IDE Java lainnya.
2. Pastikan file `MainApp.java` berada di folder `src/`.
3. Jalankan program dengan menekan tombol ▶️ **Run** pada `MainApp.java`.

---

📚 **Dibuat oleh:**  
**Natania Oktaviani**  
Kelas: D-272  
Mata Kuliah: Pemrograman Lanjut – Modul 3  
