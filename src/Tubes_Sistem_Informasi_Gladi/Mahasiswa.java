/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_Sistem_Informasi_Gladi;

import java.util.Scanner;

/**
 *
 * Nama : Gangsar Yoga Pamungkas NIM : 1301154096 KLS : IF 39 12
 */
public class Mahasiswa extends Orang {

    private int nim;
    private int notelp;
    private String jurusan, prodi;

    public Mahasiswa(String nama, String alamat, int nim, int notelp, String jurusan, String prodi) {

        super(nama, alamat);
        this.nim = nim;
        this.notelp = notelp;
        this.jurusan = jurusan;
        this.prodi = prodi;
    }

    public String getNama() {
        return super.nama;
    }

    public String getAlamat() {
        return super.alamat;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNotelp() {
        return notelp;
    }

    public void setNotelp(int notelp) {
        this.notelp = notelp;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

}
