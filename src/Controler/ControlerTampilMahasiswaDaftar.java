/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import GUI.TampMahasiswaDaftar;
import GUI.TampUtama;
import Tubes_Sistem_Informasi_Gladi.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;

/**
 *
 * @author chando
 */
public class ControlerTampilMahasiswaDaftar {

    private TampMahasiswaDaftar g4;
    private Aplikasi app;

    public ControlerTampilMahasiswaDaftar(TampMahasiswaDaftar g4, Aplikasi app) {
        this.g4 = g4;
        this.app = app;
        this.g4.AddListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = g4.getTxtNama();
                int b = Integer.parseInt(g4.getTxtNim());
                String c = g4.getTxtAlamat();
                String d = g4.getTxtJurusan();
                String f = g4.getTxtProdi();
                int g = Integer.parseInt(g4.getTxtNoTlp());
                app.DaftarMhsGui(a, c, f, d, b, g);
                TampUtama g3 = new TampUtama();
                ControlerTampilUtama h = new ControlerTampilUtama(g3, app);
                g4.dispose();
                g3.setVisible(true);
            }
        });
    }

}
