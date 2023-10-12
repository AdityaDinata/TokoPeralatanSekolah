# TokoPeralatanSekolah

# README - Aplikasi Toko Peralatan Sekolah

Aplikasi "Toko Peralatan Sekolah" adalah aplikasi sederhana yang memungkinkan pengguna untuk berperan sebagai pembeli atau penjual dalam sebuah toko peralatan sekolah. Aplikasi ini dirancang untuk memberikan contoh penggunaan beberapa konsep dasar dalam pemrograman berorientasi objek, termasuk penggunaan kelas, dan objek.

## Fitur Aplikasi
Aplikasi ini memiliki beberapa fitur utama, termasuk:

1. **Pembeli**:
   - Melihat daftar barang yang tersedia di toko.
   - Membeli barang dengan memasukkan nama barang dan jumlah yang diinginkan.
   
2. **Penjual**:
   - Melihat daftar barang yang dijual di toko.
   - Menambah barang baru ke dalam daftar.
   - Mengedit informasi barang yang sudah ada.
   - Menghapus barang dari daftar.

## Method yang Digunakan
Berikut adalah daftar method yang digunakan dalam kode aplikasi:

1. `main(String[] args)`: Method utama yang memulai eksekusi program. Ini adalah method yang pertama kali dijalankan saat program dijalankan.

2. `menuPembeli(Pelanggan pelanggan, Penjual penjual, Scanner scanner)`: Method untuk menampilkan menu pembeli dan mengelola interaksi pembeli dengan toko.

3. `lihatBarang(ArrayList<Barang> daftarBarang)`: Method untuk menampilkan daftar barang yang tersedia.

4. `beliBarang(Pelanggan pelanggan, Penjual penjual, Scanner scanner)`: Method untuk memproses pembelian barang oleh pelanggan.

5. `menuPenjual(Penjual penjual, Scanner scanner)`: Method untuk menampilkan menu penjual dan mengelola interaksi penjual dengan daftar barang.

6. `tambahBarang(Penjual penjual, Scanner scanner)`: Method untuk menambahkan barang baru ke dalam daftar barang penjual.

7. `editBarang(Penjual penjual, Scanner scanner)`: Method untuk mengedit informasi barang yang sudah ada dalam daftar penjual.

8. `hapusBarang(Penjual penjual, Scanner scanner)`: Method untuk menghapus barang dari daftar penjual.

Selain method-method di atas, terdapat juga beberapa method pada kelas `Penjual`, `Pelanggan`, `Barang`, dan `Transaksi` yang digunakan untuk mengelola data dan operasi yang berkaitan dengan masing-masing entitas.

## Access Modifier yang Digunakan
Dalam kode aplikasi ini, access modifier yang digunakan adalah sebagai berikut:

- `public`: Digunakan pada class `TokoPeralatanSekolahh` dan beberapa method yang perlu diakses dari luar class.
- `private`: Digunakan pada beberapa atribut dan method yang hanya diakses di dalam class itu sendiri.
- `final`: Digunakan pada beberapa class, atribut, dan parameter method yang nilainya tidak dapat diubah setelah inisialisasi.

## Collection yang Digunakan
Aplikasi ini menggunakan beberapa koleksi (collections) untuk menyimpan dan mengelola data, seperti:

- `ArrayList`: Digunakan untuk menyimpan daftar barang (kelas `Barang`), baik pada sisi penjual maupun pembeli.

## Best Practice dari Penggunaan Final Class
Dalam kode aplikasi ini, beberapa class dinyatakan sebagai `final`. Ini mengikuti praktik terbaik dalam pemrograman Java untuk memastikan bahwa class tersebut tidak dapat diwarisi (subclassed). Class yang dinyatakan sebagai `final` tidak dapat diubah atau diperluas oleh class lain, sehingga mencegah perubahan yang tidak diinginkan atau konflik dalam penggunaan class tersebut. Class-class yang dianggap tidak perlu diwarisi atau diubah oleh class lain adalah `Pelanggan`, `Transaksi`, dan `Barang`.

Semoga README ini membantu dalam memahami aplikasi "Toko Peralatan Sekolah" ini dan memberikan wawasan tentang penggunaan beberapa konsep dasar dalam pemrograman berorientasi objek dengan Java.


