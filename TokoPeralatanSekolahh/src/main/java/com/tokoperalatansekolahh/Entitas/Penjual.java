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
public class Penjual {
    private final String nama;
    private final ArrayList<Barang> daftarBarang;

    public Penjual(String nama) {
        this.nama = nama;
        this.daftarBarang = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void editBarang(Barang barang, double harga, int stok) {
        barang.setHarga(harga);
        barang.setStok(stok);
    }

    public void hapusBarang(Barang barang) {
        daftarBarang.remove(barang);
    }
}
