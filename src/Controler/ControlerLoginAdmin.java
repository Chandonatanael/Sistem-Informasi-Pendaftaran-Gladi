/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import GUI.MenuLoginAdmin;
import GUI.TampUtama;
import Tubes_Sistem_Informasi_Gladi.Aplikasi;
import Tubes_Sistem_Informasi_Gladi.Lokasi;
import Tubes_Sistem_Informasi_Gladi.Mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author chando
 */
public class ControlerLoginAdmin {

    private MenuLoginAdmin g3;
    private Aplikasi app;
    private Mahasiswa s;

    public ControlerLoginAdmin(MenuLoginAdmin g3, Aplikasi app) {
        this.g3 = g3;
        this.app = app;
        for (int i = 0; i < app.getsizelokasi(); i++) {
            app.getDaftarLokasi(i).setIsiKelompok(app.getDb().loadKel(app.getDaftarLokasi(i)));
            for (int j = 0; j < app.getDaftarLokasi(i).LihatPanKel(); j++) {
                app.getDaftarLokasi(i).getIsiKelompok(j).setDaftar(app.getDb().loadmhsKel(app.getDaftarLokasi(i).getIsiKelompok(j)));
                for (int k = 0; k < app.getDaftarLokasi(i).getIsiKelompok(j).getSize(); k++) {
                    if (app.getDaftarLokasi(i).getPembimbing() == null) {
                        g3.settable(app.getDaftarLokasi(i).getNamaLokasi(),
                                app.getDaftarLokasi(i).getIsiKelompok(j).getNoKelompok(),
                                app.getDaftarLokasi(i).getIsiKelompok(j).getDaftar(k).getNama(),
                                "");
                    } else {
                        g3.settable(app.getDaftarLokasi(i).getNamaLokasi(),
                                app.getDaftarLokasi(i).getIsiKelompok(j).getNoKelompok(),
                                app.getDaftarLokasi(i).getIsiKelompok(j).getDaftar(k).getNama(),
                                app.getDaftarLokasi(i).getPembimbing().getNama());
                    }
                }
            }
        }
        this.g3.LogoutAdminListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TampUtama g4 = new TampUtama();
                ControlerTampilUtama h = new ControlerTampilUtama(g4, app);
                g3.dispose();
                g4.setVisible(true);
            }

        });

        this.g3.setKelBaruAdminListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = g3.getTxtNamaKelompokAdmin();
                int b = g3.getCmbPilihLokasiAdmin();
                app.AdminBuatKelBaruGUI(b, a);
            }
        });

        this.g3.setPmAdminListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = g3.getTxtNamaPembimbingAdmin();
                String b = g3.getTxtAlamatPembimbingAdmin();
                int c = g3.getCmbPilihLokasiAdminPM();
                int d = Integer.parseInt(g3.getTxtNIPPembimbingAdmin());
                app.AdminTamPemb(a, b, c, d);
            }
        });

        this.g3.setEditKelAdmin(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(g3.getTxtNimAdmin());
                int b = g3.getcmbLokasiSekarangAdmin();
                int c = g3.getcmbLokasiBaruAdmin();
                String d = g3.getTxtNoKelompokAdmin();
                int f = Integer.parseInt(g3.getTxtNoKelompokBaruAdmin());
                app.AdminHapusAnggotaGUI(b, c, d, a, f);

            }
        });

    }

}
