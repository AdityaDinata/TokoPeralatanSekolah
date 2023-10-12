/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tokoperalatansekolahh.Entitas;
import java.util.ArrayList;
/**
 *
 * @author Aditya D
 */
public class Pelanggan {
    private final String nama;
    private final String alamat;
    private final ArrayList<Transaksi> riwayatPembelian;

    public Pelanggan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.riwayatPembelian = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public ArrayList<Transaksi> getRiwayatPembelian() {
        return riwayatPembelian;
    }

    public void beliBarang(Barang barang, int jumlah) {
        Transaksi transaksi = new Transaksi(barang, jumlah);
        riwayatPembelian.add(transaksi);
        int stokBaru = barang.getStok() - jumlah;
        barang.setStok(stokBaru);
    }
}
