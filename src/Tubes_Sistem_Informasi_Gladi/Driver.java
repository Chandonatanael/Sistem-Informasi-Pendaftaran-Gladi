/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_Sistem_Informasi_Gladi;

/**
 *
 * @author chand
 */
import java.util.*;
import GUI.TampUtama;
import Controler.ControlerTampilUtama;

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Aplikasi app = new Aplikasi(db);
        TampUtama g1 = new TampUtama();
        g1.setVisible(true);
        ControlerTampilUtama c = new ControlerTampilUtama(g1, app);
        AplikasiConsole a = new AplikasiConsole();
        a.menuUtama(app);

    }

    //Scanner input = new Scanner(System.in);
//        int n = 0;
//        int a ;
//        double b ,c ;
//        String d ,e ,f ,g ,h;
//        Mahasiswa arrMhs[] = new Mahasiswa[n];
//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan jumlah mahasiswa : ");
//        n = input.nextInt();
//        
//        if (n != 1)
//        {
//            for(int i=0;i<=n ; i++){
//                System.out.print("NIM: ");
//                a = input.nextInt();
//                
//                System.out.print("Nama: ");
//                d = input.next();
//                
//                System.out.print("Alamat: ");
//                e = input.next();
//                
//                System.out.print("No Telp: ");
//                c = input.nextDouble();
//                
//                System.out.print("Jurusan: ");
//                f = input.next();
//                
//                System.out.print("Prodi: ");
//                g = input.next();
//                
//                
//                Mahasiswa datMhs = new Mahasiswa();
//                datMhs.setNim(a);
//                datMhs.setKtp(b);
//                datMhs.setNama(d);
//                datMhs.setAlamat(e);
//                datMhs.setNotelp(c);
//                datMhs.setJurusan(f);
//                datMhs.setProdi(g);
//            }
//        }else{
//            for(int i=0;i<=n ; i++){
//                System.out.print("NIM: ");
//                a = input.nextInt();
//                
//                System.out.print("KTP: ");
//                b = input.nextInt();
//                
//                System.out.print("Nama: ");
//                d = input.next();
//                
//                System.out.print("Alamat: ");
//                e = input.next();
//                
//                System.out.print("No Telp: ");
//                c = input.nextDouble();
//                
//                System.out.print("Jurusan: ");
//                f = input.next();
//                
//                System.out.print("Prodi: ");
//                g = input.next();
//                
//                Mahasiswa datMhs = new Mahasiswa();
//                datMhs.setNim(a);
//                datMhs.setKtp(b);
//                datMhs.setNama(d);
//                datMhs.setAlamat(e);
//                datMhs.setNotelp(c);
//                datMhs.setJurusan(f);
//                datMhs.setProdi(g);
//            }
//        }
}
