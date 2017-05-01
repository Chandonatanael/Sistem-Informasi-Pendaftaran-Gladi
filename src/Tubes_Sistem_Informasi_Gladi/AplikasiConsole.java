/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_Sistem_Informasi_Gladi;

/**
 *
 * @author YangPentingHappy
 */
import GUI.TampUtama;
import java.util.*;

public class AplikasiConsole {

    private Aplikasi app;
    int a = 0;
    int c = 0;
    int n = 0;
    int t = 0;
    int e = 0;
    String b, d, q;
    Mahasiswa m = null;
    Lokasi l = null;

    public void menuUtama(Aplikasi apps) {
        Scanner input = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        app = apps;
        TampUtama g1 = new TampUtama();

        while (a != 4) {
            app.MenuMahasiswa();
            System.out.print(" Masukkan pilihan : ");
            a = inp.nextInt();
            switch (a) {
                case 1:
                    app.TambahMahasiswa();
                    break;
                case 2:
                    System.out.println("User Name :");
                    b = input.nextLine();
                    System.out.println("Password :");
                    c = inp.nextInt();
                    m = app.LoginMhs(b, c);
                    while (m != null) {
                        app.MenuLogMahasiswa();
                        c = inp.nextInt();
                        switch (c) {
                            case 1:
                                app.pilihLokasi(m);
                                n = inp.nextInt();
                                l = app.getDaftarLokasi(n - 1);
                                while (l != null) {
                                    app.MenuLokasi(m, l);
                                    int k = inp.nextInt();
                                    switch (k) {
                                        case 1:
                                            app.BuatKelBaru(m, l);
                                            l = null;
                                            break;
                                        case 2:
                                            app.KelSdhAda(m, l);
                                            l = null;
                                            break;
                                        case 3:
                                            app.LihatKel(l);
                                            break;
                                        case 4:
                                            l = null;
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                app.EditBiodata(m);
                                break;
                            case 3:
                                app.LihatDaftarGladi();
                                break;
                            case 4:
                                m = null;
                                break;
                        }
                    }

                    break;

                case 3:
                    c = 0;
                    boolean exit = false;
                    System.out.println("User Name :");
                    b = input.nextLine();
                    System.out.println("Password :");
                    c = inp.nextInt();
                    if (b.equals("admin") && c == 123) {
                        while (exit != true) {
                            app.MenuAdmin();
                            t = inp.nextInt();
                            switch (t) {
                                case 1:
                                    System.out.println("Masukkan : ");
                                    System.out.println("Nip : ");
                                    e = inp.nextInt();
                                    System.out.println("Nama Pembimbing : ");
                                    b = input.nextLine();
                                    System.out.println("Alamat : ");
                                    d = input.nextLine();
                                    app.pilihLokasiAdmin();
                                    c = inp.nextInt();
                                    app.AdminTamPemb(b, d, c - 1, e);
                                    break;
                                case 2:
                                    while (n != 3) {
                                        app.AdminEditKelompok();
                                        n = inp.nextInt();
                                        switch (n) {
                                            case 1:
                                                app.pilihLokasiAdmin();
                                                c = inp.nextInt();
                                                app.AdminBuatKelBaru(c - 1);
                                                break;
                                            case 2:
                                                System.out.println("Masukkan ");
                                                System.out.println("Nim             :");
                                                c = inp.nextInt();
                                                System.out.println("No. Kelompok    :");
                                                b = input.nextLine();
                                                System.out.println("Lokasi sekarang :");
                                                n = inp.nextInt();
                                                System.out.println("Lokasi baru     :");
                                                a = inp.nextInt();
                                                app.AdminHapusAnggota(n, a, b, c);
                                                break;
                                        }
                                    }
                                case 3:
                                    exit = true;
                                    break;
                            }
                        }
                    } else {
                        System.out.println("salah");
                    }
            }

        }
    }

}
