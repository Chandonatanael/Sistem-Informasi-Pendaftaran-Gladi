/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import GUI.TampUtama;
import GUI.*;
import Tubes_Sistem_Informasi_Gladi.Aplikasi;
import Tubes_Sistem_Informasi_Gladi.Mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author chando
 */
public class ControlerTampilUtama {
    
    private TampUtama g1;
    private Aplikasi app;
    
    public ControlerTampilUtama(TampUtama g1, Aplikasi app) {
        this.g1 = g1;
        this.app = app;
        g1.setVisible(true);
        this.g1.DaftarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TampMahasiswaDaftar g4 = new TampMahasiswaDaftar();
                ControlerTampilMahasiswaDaftar c = new ControlerTampilMahasiswaDaftar(g4, app);
                g1.dispose();
                g4.setVisible(true);
            }
        });
        this.g1.LoginListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = g1.getTxtUserName();
                int b = Integer.parseInt(g1.getTxtPassword());
                if (a.equals("admin") && b == 123) {
                    MenuLoginAdmin g2 = new MenuLoginAdmin();
                    ControlerLoginAdmin c = new ControlerLoginAdmin(g2, app);
                    g1.dispose();
                    g2.setVisible(true);
                } else {
                    if (app.LoginMhs(a, b) != null) { 
                        Mahasiswa m = app.LoginMhs(a, b);
                        MenuLoginMhs g3 = new MenuLoginMhs();
                        ControlerLoginMhs c = new ControlerLoginMhs(g3, app , m);
                        g1.dispose();
                        g3.setVisible(true);
                    }
                }
            }
        });
    }
    
}
