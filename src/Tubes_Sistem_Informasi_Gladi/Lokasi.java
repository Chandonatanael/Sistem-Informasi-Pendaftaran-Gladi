/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_Sistem_Informasi_Gladi;

import java.util.ArrayList;

/**
 *
 * @author chand
 */
public class Lokasi {

    private int id;
    private String namaLokasi;
    private Pembimbing pembimbing = null;
    private ArrayList<Kelompok> isiKelompok;

    public Lokasi(String namaLokasi, int i) {
        this.namaLokasi = namaLokasi;
        id = i;
        isiKelompok = new ArrayList();
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public Kelompok getIsiKelompok(int i) {
        return isiKelompok.get(i);
    }

    public int LihatPanKel() {
        return isiKelompok.size();
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public Pembimbing getPembimbing() {
        return pembimbing;
    }

    public void setPembimbing(Pembimbing p) {
        this.pembimbing = p;
    }

    public void setIsiKelompok(ArrayList<Kelompok> isiKelompok) {
        this.isiKelompok = isiKelompok;
    }

    public int getId() {
        return id;
    }

    public void createKelompok(String NamaKelompok, Mahasiswa M) {
        Kelompok k = new Kelompok(Integer.toString((id * 10) + isiKelompok.size() + 1), NamaKelompok);
        k.AddMhs(M);
        isiKelompok.add(k);
    }

    public void createKelompokAdmin(String NamaKelompok) {
        Kelompok k = new Kelompok(Integer.toString((id * 10) + isiKelompok.size() + 1), NamaKelompok);
        isiKelompok.add(k);
    }

    public void removeKelompok(String id) {
        boolean nemu = false;
        int i = 0;
        while (nemu != true) {
            if (isiKelompok.get(i).getNoKelompok().equals(id)) {
                nemu = true;
            } else {
                i++;
            }
        }
        if (nemu == true) {
            isiKelompok.remove(i);
        }
    }

    @Override
    public String toString() {
        return "Nama Lokasi : " + this.namaLokasi + '\n' + "Kapasitas kelompok : " + isiKelompok.size() + '\n';
    }
}
