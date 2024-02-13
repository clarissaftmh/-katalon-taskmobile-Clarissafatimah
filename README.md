# katalon taskmobile Clarissafatimah

Panduan untuk pengujian aplikasi mobile Solodroid_E-CommerceApp Demo_3.2.0 menggunakan Katalon Studio untuk otomatisasi pengujian dan Android Studio untuk pengaturan perangkat virtual. Pengujian difokuskan pada fungsionalitas penting termasuk checkout, edit profil, tambah ke keranjang, dan pencarian. Semua kasus uji diatur dalam satu test suite untuk kenyamanan.

## Persyaratan
Katalon Studio terinstal (Panduan Instalasi)
Android Studio terinstal (Panduan Instalasi)
APK aplikasi Solodroid_E-CommerceApp Demo_3.2.0
Perangkat virtual diatur di Android Studio (Panduan Perangkat Virtual)

##Pengaturan Lingkungan Pengujian
Instal Katalon Studio: Ikuti panduan instalasi yang disediakan untuk menyiapkan Katalon Studio di sistem Anda.
Instal Android Studio: Rujuk panduan instalasi yang disediakan untuk menginstal Android Studio.
Unduh APK Solodroid_E-CommerceApp Demo_3.2.0: Dapatkan file APK untuk aplikasi Solodroid_E-CommerceApp Demo_3.2.0.
Buat Perangkat Virtual di Android Studio: Siapkan perangkat virtual menggunakan AVD Manager Android Studio.

## Eksekusi Kasus Uji
Impor APK Solodroid_E-CommerceApp Demo_3.2.0: Impor APK Solodroid_E-CommerceApp Demo_3.2.0 ke Katalon Studio.
Konfigurasi Perangkat Virtual: Jalankan perangkat virtual yang dibuat di Android Studio.
Buat Suite Uji di Katalon Studio: Susun kasus uji (checkout, edit profil, tambah ke keranjang, pencarian) dalam satu suite uji.
Jalankan Suite Uji: Jalankan suite uji terhadap perangkat virtual.

## Detail Kasus Uji
Checkout: Verifikasi proses checkout dengan menambahkan barang ke keranjang, memberikan detail pengiriman, dan menyelesaikan pembayaran.
Edit Profil: Pastikan fungsionalitas untuk mengedit detail profil pengguna seperti nama, email, dan alamat berfungsi dengan benar.
Tambah ke Keranjang: Validasi kemampuan untuk menambahkan barang ke keranjang belanja dari daftar produk.
Pencarian: Konfirmasi bahwa fungsionalitas pencarian mengambil produk yang relevan berdasarkan masukan pengguna.
Pelaporan
Setelah menjalankan suite uji, Katalon Studio memberikan laporan komprehensif yang mendetaili hasil pengujian, termasuk status lulus/gagal dan setiap kesalahan yang ditemui.

Catatan
Pastikan perangkat virtual di Android Studio memenuhi persyaratan sistem minimum untuk menjalankan aplikasi Solodroid_E-CommerceApp Demo_3.2.0.
Perbarui kasus uji sesuai kebutuhan untuk menyesuaikan perubahan fitur aplikasi atau alur pengguna.