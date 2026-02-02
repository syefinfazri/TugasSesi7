# Tugas Praktikum Sesi 7 – Queue (Antrian)

* **Nama**: Syefin Fazri Nugraha
* **NIM**: 20210040097
* **Kelas**: TI25F
* **Mata Kuliah**: Algoritma dan Struktur Data
* **Dosen Pengampu**: Shinta Ayuningtias, S.Kom., M.Kom

---

## Penjelasan Singkat

Praktikum ini bertujuan untuk memahami konsep Queue (Antrian) sebagai salah satu struktur data linier dengan prinsip FIFO (First In First Out). Praktikum dilakukan dengan mengimplementasikan Queue menggunakan array manual dan library Java, serta menerapkannya pada studi kasus nyata berupa sistem antrian layanan.

---

## Aktivitas 1 – Queue Menggunakan Array

File Java: `AntrianArray.java`

Pada aktivitas ini, Queue diimplementasikan secara manual menggunakan array dengan kapasitas tertentu.
Operasi yang digunakan: enqueue, dequeue, peekFront, peekRear
Kapasitas queue ditentukan di awal
Saat jumlah elemen melebihi kapasitas, data baru tidak dapat ditambahkan

* **Kesimpulan Aktivitas 1**:
Queue berbasis array memiliki keterbatasan kapasitas. Jika queue penuh, operasi enqueue tidak dapat dilakukan. Hal ini menunjukkan bahwa implementasi manual memerlukan pengelolaan kapasitas secara eksplisit.
* Contoh:
Saat kapasitas 3 lalu ditambah 4 elemen, queue menolak elemen ke-4. Ini membuktikan queue array memiliki kapasitas terbatas.

---

## Aktivitas 2 – Queue Menggunakan ArrayDeque

File Java: `AntrianDeque.java`

Pada aktivitas ini, Queue diimplementasikan menggunakan ArrayDeque dari Java Collection Framework dengan menu interaktif.
Pengguna dapat menambah, melayani, dan melihat antrian
Tidak perlu menentukan kapasitas di awal
Operasi queue menjadi lebih fleksibel dan aman

* **Kesimpulan Aktivitas 2**:
Penggunaan ArrayDeque lebih efisien dan praktis dibandingkan array manual karena tidak memiliki batas kapasitas tetap serta sudah menyediakan method bawaan untuk operasi Queue.

---

## Aktivitas 3 – Studi Kasus Antrian Loket Bank

File Java: `AntrianBank.java`

Aktivitas ini mensimulasikan sistem antrian pada loket bank menggunakan Queue.
Setiap nasabah mendapatkan nomor tiket otomatis (A001, A002, dst.)
Antrian dilayani sesuai urutan kedatangan
Sistem dapat menampilkan antrian dan menghitung jumlah nasabah yang telah dilayani

* **Kesimpulan Aktivitas 3**:
Queue sangat cocok digunakan untuk sistem pelayanan berbasis antrian karena menjamin keadilan layanan sesuai urutan masuk (FIFO). Implementasi ini mencerminkan penggunaan Queue pada kasus nyata.

---

**Kesimpulan Akhir**

Queue adalah struktur data linier dengan prinsip First In First Out (FIFO) yang sangat sesuai untuk sistem antrian. Implementasi Queue dapat dilakukan secara manual menggunakan array maupun menggunakan library Java seperti ArrayDeque. Penggunaan Queue mempermudah pengelolaan data yang harus diproses secara berurutan dan adil, terutama pada sistem layanan dan simulasi dunia nyata.

---
