/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tokoperalatansekolahh.Entitas;

/**
 *
 * @author Aditya D
 */
final class Transaksi {
    private final Barang barang;
    private final int jumlah;

    public Transaksi(Barang barang, int jumlah) {
        this.barang = barang;
        this.jumlah = jumlah;
    }

    public double getTotalHarga() {
        return barang.getHarga() * jumlah;
    }
}
