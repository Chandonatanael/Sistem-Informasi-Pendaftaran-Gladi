/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import GUI.MenuLoginMhs;
import GUI.MenuPilihLokasi;
import GUI.TampUtama;
import Tubes_Sistem_Informasi_Gladi.Aplikasi;
import Tubes_Sistem_Informasi_Gladi.Mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author chando
 */
public class ControlerLoginMhs {

    private MenuLoginMhs g2;
    private Aplikasi app;
    private Mahasiswa s;

    public ControlerLoginMhs(MenuLoginMhs g2, Aplikasi app, Mahasiswa m) {
        this.g2 = g2;
        this.app = app;
        s = m;
        g2.settable(s.getNama(), Integer.toString(s.getNim()), s.getAlamat(), Integer.toString(s.getNotelp()));

        this.g2.PlhLokasiListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuPilihLokasi g3 = new MenuPilihLokasi();
                ControlerPilihLokasi h = new ControlerPilihLokasi(g3, app, m);
                g2.dispose();
                g3.setVisible(true);

            }
        });
        this.g2.UpdateNimListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!g2.getTxtNimMhs().equals("")) {
                        s.setNim(Integer.parseInt(g2.getTxtNimMhs()));
                        //               } else if (!g2.getTxtNimMhs().equals("")) {
                        //                   s.setNim(Integer.parseInt(g2.getTxtNimMhs()));
                        //               } else if (!g2.getTxtAlamatMhs().equals("")) {
                        //                   s.setAlamat(g2.getTxtAlamatMhs());
                        //              } else if (!g2.getTxtNoTlpMhs().equals("")) {
                        //                   s.setNotelp(Integer.parseInt(g2.getTxtNoTlpMhs()));
                        //               } else if (!g2.getTxtNamaMhs().equals("") && !g2.getTxtNimMhs().equals("")) {
                        //                   s.setNama(g2.getTxtNamaMhs());
                        //                   s.setNim(Integer.parseInt(g2.getTxtNimMhs()));
                        //               } else if (!g2.getTxtNimMhs().equals("") && !g2.getTxtAlamatMhs().equals("")) {
                        //                   s.setNim(Integer.parseInt(g2.getTxtNimMhs()));
                        //                   s.setAlamat(g2.getTxtAlamatMhs());
                        //                } else if (!g2.getTxtAlamatMhs().equals("") && !g2.getTxtNoTlpMhs().equals("")) {
                        //          s.setAlamat(g2.getTxtAlamatMhs());
                        //                s.setNotelp(Integer.parseInt(g2.getTxtNoTlpMhs()));
                        //            } else if (!g2.getTxtNamaMhs().equals("") && !g2.getTxtNoTlpMhs().equals("")) {
                        //                s.setNama(g2.getTxtNamaMhs());
                        //                s.setAlamat(g2.getTxtAlamatMhs());
                        //            } else if (!g2.getTxtNoTlpMhs().equals("") && !g2.getTxtNimMhs().equals("")) {
                        //                s.setNim(Integer.parseInt(g2.getTxtNimMhs()));
                        //              s.setNotelp(Integer.parseInt(g2.getTxtNoTlpMhs()));
                        //          } else if (!g2.getTxtNamaMhs().equals("") && !g2.getTxtAlamatMhs().equals("")) {
                        //                s.setNama(g2.getTxtNamaMhs());
                        //               s.setAlamat(g2.getTxtAlamatMhs());
                        //          } else if (!g2.getTxtAlamatMhs().equals("") && !g2.getTxtNoTlpMhs().equals("") && !g2.getTxtNamaMhs().equals("")) {
                        //              s.setAlamat(g2.getTxtAlamatMhs());
                        //              s.setNotelp(Integer.parseInt(g2.getTxtNoTlpMhs()));
                        //             s.setNama(g2.getTxtNamaMhs());
                        //         } else if (!g2.getTxtAlamatMhs().equals("") && !g2.getTxtNoTlpMhs().equals("") && !g2.getTxtNimMhs().equals("")) {
                        //             s.setNim(Integer.parseInt(g2.getTxtNimMhs()));
                        //             s.setAlamat(g2.getTxtAlamatMhs());
                        //            s.setNotelp(Integer.parseInt(g2.getTxtNoTlpMhs()));
                        //        } else if (!g2.getTxtNimMhs().equals("") && !g2.getTxtNoTlpMhs().equals("") && !g2.getTxtNamaMhs().equals("")) {
                        //            s.setNim(Integer.parseInt(g2.getTxtNimMhs()));
                        //            s.setNotelp(Integer.parseInt(g2.getTxtNoTlpMhs()));
                        //           s.setNama(g2.getTxtNamaMhs());
                        //      } else if (!g2.getTxtNimMhs().equals("") && !g2.getTxtAlamatMhs().equals("") && !g2.getTxtNamaMhs().equals("")) {
                        //          s.setNim(Integer.parseInt(g2.getTxtNimMhs()));
                        //          s.setAlamat(g2.getTxtAlamatMhs());
                        //         s.setNama(g2.getTxtNamaMhs());
                        //     } else if (!g2.getTxtNimMhs().equals("") && !g2.getTxtAlamatMhs().equals("") && !g2.getTxtNamaMhs().equals("") && !g2.getTxtNoTlpMhs().equals("")) {
                        //         s.setNim(Integer.parseInt(g2.getTxtNimMhs()));
                        //         s.setAlamat(g2.getTxtAlamatMhs());
                        //        s.setNama(g2.getTxtNamaMhs());
                        //         s.setNotelp(Integer.parseInt(g2.getTxtNoTlpMhs()));
                    }
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dirubah");
                    g2.remove();
                    g2.settable(Integer.toString(s.getNim()), s.getNama(), s.getAlamat(), Integer.toString(s.getNotelp()));
                    app.getDb().updateMhs(s);
                } catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(g2, f);
                }
            }
        });
        this.g2.UpdateNamaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!g2.getTxtNamaMhs().equals("")) {
                        s.setNama(g2.getTxtNamaMhs());
                    }
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dirubah");
                    g2.remove();
                    g2.settable(Integer.toString(s.getNim()), s.getNama(), s.getAlamat(), Integer.toString(s.getNotelp()));
                    app.getDb().updateMhs(s);
                } catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(g2, f);
                }
            }
        });
        this.g2.UpdateAlamatListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!g2.getTxtAlamatMhs().equals("")) {
                        s.setAlamat(g2.getTxtAlamatMhs());
                    }
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dirubah");
                    g2.remove();
                    g2.settable(Integer.toString(s.getNim()), s.getNama(), s.getAlamat(), Integer.toString(s.getNotelp()));
                    app.getDb().updateMhs(s);
                } catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(g2, f);
                }
            }
        });
        this.g2.UpdateTlpListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!g2.getTxtNoTlpMhs().equals("")) {
                        s.setNotelp(Integer.parseInt(g2.getTxtNoTlpMhs()));
                    }
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dirubah");
                    g2.remove();
                    g2.settable(Integer.toString(s.getNim()), s.getNama(), s.getAlamat(), Integer.toString(s.getNotelp()));
                    app.getDb().updateMhs(s);
                } catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(g2, f);
                }
            }
        });

        this.g2.LogoutListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TampUtama g4 = new TampUtama();
                ControlerTampilUtama h = new ControlerTampilUtama(g4, app);
                g2.dispose();
                g4.setVisible(true);
            }
        });
    }

}
