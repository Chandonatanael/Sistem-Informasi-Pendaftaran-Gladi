/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_Sistem_Informasi_Gladi;

/**
 *
 * Nama : Gangsar Yoga Pamungkas NIM : 1301154096 KLS : IF 39 12
 */
import java.util.*;

public class Kelompok {

    private String NoKelompok;
    private String NamaKelompok;
    private int kapasitas;
    private ArrayList<Mahasiswa> Daftar = new ArrayList();
    int i = 0;

    public Kelompok(String NoKelompok, String NamaKelompok) {
        this.NoKelompok = NoKelompok;
        this.NamaKelompok = NamaKelompok;
    }

    public String getNoKelompok() {
        return NoKelompok;
    }

    public void setNoKelompok(String NoKelompok) {
        this.NoKelompok = NoKelompok;
    }

    public Mahasiswa getDaftar(int i) {
        return Daftar.get(i);
    }

    public void setDaftar(ArrayList<Mahasiswa> Daftar) {
        this.Daftar = Daftar;
    }

    public Mahasiswa searchMahasiswa(int nim) {
        Mahasiswa k = null;
        for (Mahasiswa m : Daftar) {
            if (m.getNim() == nim) {
                k = m;
            }
        }
        return k;
    }
//
//    public void setDaftar(Mahasiswa[] Daftar) {
//        this.Daftar = Daftar;
//    }

    public void AddMhs(Mahasiswa m) {
//        if (Daftar.size() != 10) {
//        } else {
//            System.out.println("Penuh");
//        }
        Daftar.add(m);

    }

    public void removeAnggota(int i) {
        Daftar.remove(i);
    }

    public String getNamaKelompok() {
        return NamaKelompok;
    }

    @Override
    public String toString() {
        return "Kelompok{" + "NoKelompok=" + NoKelompok + ", NamaKelompok=" + NamaKelompok + ", Daftar=" + Daftar + '}';
    }

    public int getSize() {
        return Daftar.size();
    }

//    public void ViewMhs() {
//        int i;
//        System.out.println("No Kelompok : " + this.NoKelompok);
//        System.out.println("Daftar Mahasiswa : ");
//        for (i = 0; i < Daftar.length; i++) {
//            System.out.println(Daftar[i].getNim() + " " + Daftar[i].getNama() + " " + Daftar[i].getAlamat() + " " + Daftar[i].getNotelp() + " " + Daftar[i].getJurusan() + " " + Daftar[i].getProdi());
//        }
//    }
}
