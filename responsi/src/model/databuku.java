/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class databuku {
    private String id;
    private String nama_penyewa;
    private String judul_buku;
    private String jenis_buku;
    private String nomor_telepon;
    private double durasi_sewa;
    private double total_biaya;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama_penyewa() {
        return nama_penyewa;
    }

    public void setNama_penyewa(String nama_penyewa) {
        this.nama_penyewa = nama_penyewa;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getJenis_buku() {
        return jenis_buku;
    }

    public void setJenis_buku(String jenis_buku) {
        this.jenis_buku = jenis_buku;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public double getDurasi_sewa() {
        return durasi_sewa;
    }

    public void setDurasi_sewa(double durasi_sewa) {
        this.durasi_sewa = durasi_sewa;
    }

    public double getTotal_biaya() {
        return total_biaya;
    }

    public void setTotal_biaya(double total_biaya) {
        this.total_biaya = total_biaya;
    }
    
}
