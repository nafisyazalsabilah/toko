package com.mycompany.toko;

public class Toko {

    public static void main(String[] args) {
        Member member;
        member = new Member (){};
        Karyawan karyawan = new Karyawan();
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        transaksi.prosesTransaksi(member, transaksi, barang);
        
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
    }
}
