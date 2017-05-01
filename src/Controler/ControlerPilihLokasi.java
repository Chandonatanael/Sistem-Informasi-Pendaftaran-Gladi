/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import GUI.MenuPilihLokasi;
import GUI.*;
import Tubes_Sistem_Informasi_Gladi.Aplikasi;
import Tubes_Sistem_Informasi_Gladi.Lokasi;
import Tubes_Sistem_Informasi_Gladi.Mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author chando
 */
public class ControlerPilihLokasi {

    private MenuPilihLokasi g5;
    private Aplikasi app;
    private Mahasiswa s;

    public ControlerPilihLokasi(MenuPilihLokasi g5, Aplikasi app, Mahasiswa m) {
        this.g5 = g5;
        this.app = app;
        s = m;

        this.g5.SimpanLokListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a;
                Lokasi l = null;
                int i = g5.getCmbPilihLokasiLokasi();
//                try {
                if (g5.getTxtPilihKelompokSdhAdaLokasi().equals("")) {
                    a = g5.getTxtNamaKelompokLokasi();
                    l = app.getDaftarLokasi(i);
                    if (l != null) {
                        app.BuatKelBaruGUI(s, l, a);
                    } else {
                        JOptionPane.showMessageDialog(null, "Lokasi Tidak Ada");
                    }
                }
                if (g5.getTxtNamaKelompokLokasi().equals("")) {
                    int b = Integer.parseInt(g5.getTxtPilihKelompokSdhAdaLokasi());
                    l = app.getDaftarLokasi(i);
                    if (l != null) {
                        app.KelSdhAdaGUI(s, l, b);
                    } else {
                        JOptionPane.showMessageDialog(null, "Lokasi Tidak Ada");
                    }
                }
            }
        }
        );

        this.g5.backListen(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                g5.dispose();
                MenuLoginMhs g = new MenuLoginMhs();
                ControlerLoginMhs c = new ControlerLoginMhs(g, app, s);
                g.setVisible(true);
            }
        }
        );
        this.g5.InfoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {   
                g5.dispose();
                InfoLokasi g4 = new InfoLokasi();
                info c = new info(g4, app, s);
                g4.setVisible(true);
            }
        } );
    }

}
