/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tokoperalatansekolahh;
import com.tokoperalatansekolahh.Entitas.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aditya D
 */
public class TokoPeralatanSekolahh {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Penjual penjual = new Penjual("Toko Peralatan Sekolah");
        final Pelanggan pelanggan = new Pelanggan("Pelanggan", "Jalan Pintu Masuk");

        String peran;

        do {
            System.out.println("=== Selamat Datang di Aplikasi Toko Peralatan Sekolah ===");
            System.out.println("1. Masuk sebagai Pembeli");
            System.out.println("2. Masuk sebagai Penjual");
            System.out.println("0. Keluar");

            System.out.print("Pilih peran Anda: ");
            peran = scanner.nextLine();

            if ("1".equals(peran)) {
                menuPembeli(pelanggan, penjual, scanner);
            } else if ("2".equals(peran)) {
                menuPenjual(penjual, scanner);
            }

        } while (!"0".equals(peran));

        System.out.println("Terima kasih!");
    }

    static void menuPembeli(final Pelanggan pelanggan, final Penjual penjual, Scanner scanner) {
        System.out.println("=== Menu Pembeli ===");
        System.out.println("1. Lihat Barang");
        System.out.println("2. Beli Barang");
        System.out.println("0. Kembali");

        String pilihan;
        do {
            System.out.print("Pilih tindakan Anda: ");
            pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1" -> lihatBarang(penjual.getDaftarBarang());
                case "2" -> beliBarang(pelanggan, penjual, scanner);
            }
        } while (!"0".equals(pilihan));
    }

    static void lihatBarang(final ArrayList<Barang> daftarBarang) {
        System.out.println("=== Daftar Barang ===");
        for (Barang barang : daftarBarang) {
            System.out.println(barang.toString());
        }
    }

    static void beliBarang(final Pelanggan pelanggan, final Penjual penjual, Scanner scanner) {
        System.out.print("Masukkan nama barang yang ingin Anda beli: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan jumlah barang yang ingin Anda beli: ");
        int jumlah = Integer.parseInt(scanner.nextLine());

        for (Barang barang : penjual.getDaftarBarang()) {
            if (barang.getNama().equalsIgnoreCase(namaBarang) && barang.getStok() >= jumlah) {
                pelanggan.beliBarang(barang, jumlah);
                System.out.println("Anda telah berhasil membeli " + jumlah + " " + namaBarang);
                return;
            }
        }

        System.out.println("Barang tidak ditemukan atau stok tidak mencukupi.");
    }

    static void menuPenjual(final Penjual penjual, Scanner scanner) {
        System.out.println("=== Menu Penjual ===");
        System.out.println("1. Lihat Barang");
        System.out.println("2. Tambah Barang");
        System.out.println("3. Edit Barang");
        System.out.println("4. Hapus Barang");
        System.out.println("0. Kembali");

        String pilihan;
        do {
            System.out.print("Pilih tindakan Anda: ");
            pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1" -> lihatBarang(penjual.getDaftarBarang());
                case "2" -> tambahBarang(penjual, scanner);
                case "3" -> editBarang(penjual, scanner);
                case "4" -> hapusBarang(penjual, scanner);
            }
        } while (!"0".equals(pilihan));
    }
    
    static void tambahBarang(final Penjual penjual, Scanner scanner) {
        System.out.print("Masukkan nama barang baru: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan harga barang: ");
        double harga = Double.parseDouble(scanner.nextLine());
        System.out.print("Masukkan stok barang: ");
        int stok = Integer.parseInt(scanner.nextLine());

        Barang barangBaru = new Barang(namaBarang, harga, stok);
        penjual.tambahBarang(barangBaru);
        System.out.println("Barang berhasil ditambahkan ke daftar.");
    }

    static void editBarang(final Penjual penjual, Scanner scanner) {
        System.out.print("Masukkan nama barang yang ingin diedit: ");
        String namaBarang = scanner.nextLine();
        for (Barang barang : penjual.getDaftarBarang()) {
            if (barang.getNama().equalsIgnoreCase(namaBarang)) {
                System.out.print("Masukkan harga baru: ");
                double hargaBaru = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukkan stok baru: ");
                int stokBaru = Integer.parseInt(scanner.nextLine());

                penjual.editBarang(barang, hargaBaru, stokBaru);
                System.out.println("Barang berhasil diubah.");
                return;
            }
        }

        System.out.println("Barang tidak ditemukan.");
    }

    static void hapusBarang(final Penjual penjual, Scanner scanner) {
        System.out.print("Masukkan nama barang yang ingin dihapus: ");
        String namaBarang = scanner.nextLine();

        for (Barang barang : penjual.getDaftarBarang()) {
            if (barang.getNama().equalsIgnoreCase(namaBarang)) {
                penjual.hapusBarang(barang);
                System.out.println("Barang berhasil dihapus dari daftar.");
                return;
            }
        }

        System.out.println("Barang tidak ditemukan.");
    }
}
