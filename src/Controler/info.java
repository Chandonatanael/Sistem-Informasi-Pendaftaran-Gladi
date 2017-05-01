/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import GUI.InfoLokasi;
import GUI.MenuPilihLokasi;
import Tubes_Sistem_Informasi_Gladi.Aplikasi;
import Tubes_Sistem_Informasi_Gladi.Mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author chando
 */
public class info {

    private InfoLokasi g6;
    private Aplikasi app;
    private Mahasiswa s;

    public info(InfoLokasi g6, Aplikasi app, Mahasiswa m) {
        this.g6 = g6;
        this.app = app;
        s = m;
        for (int i = 0; i < app.getsizelokasi(); i++) {
            app.getDaftarLokasi(i).setIsiKelompok(app.getDb().loadKel(app.getDaftarLokasi(i)));
            for (int j = 0; j < app.getDaftarLokasi(i).LihatPanKel(); j++) {
                app.getDaftarLokasi(i).getIsiKelompok(j).setDaftar(app.getDb().loadmhsKel(app.getDaftarLokasi(i).getIsiKelompok(j)));
                for (int k = 0; k < app.getDaftarLokasi(i).getIsiKelompok(j).getSize(); k++) {
                    if (app.getDaftarLokasi(i).getPembimbing() == null) {
                        g6.settable(app.getDaftarLokasi(i).getNamaLokasi(),
                                app.getDaftarLokasi(i).getIsiKelompok(j).getNoKelompok(),
                                app.getDaftarLokasi(i).getIsiKelompok(j).getNamaKelompok(),
                                app.getDaftarLokasi(i).getIsiKelompok(j).getDaftar(k).getNama(),
                                "");
                    } else {
                        g6.settable(app.getDaftarLokasi(i).getNamaLokasi(),
                                app.getDaftarLokasi(i).getIsiKelompok(j).getNoKelompok(),
                                app.getDaftarLokasi(i).getIsiKelompok(j).getNamaKelompok(),
                                app.getDaftarLokasi(i).getIsiKelompok(j).getDaftar(k).getNama(),
                                app.getDaftarLokasi(i).getPembimbing().getNama());
                    }
                }
            }
        }
        this.g6.backinfoListen(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g6.dispose();
                MenuPilihLokasi g7 = new MenuPilihLokasi();
                ControlerPilihLokasi c = new ControlerPilihLokasi(g7, app, s);
                g7.setVisible(true);
            }
        });
    }

}
