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
import static java.time.Clock.system;
import java.util.*;

public class Aplikasi {

    private DataBase db;
    private ArrayList<Lokasi> daftarLokasi;
    private ArrayList<Pembimbing> daftarPembimbing;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public Lokasi getDaftarLokasi(int i) {
        return daftarLokasi.get(i);
    }
    
    public int getsizelokasi (){
        return daftarLokasi.size();
    }

    public Aplikasi(DataBase db) {
        this.db = db;
        this.db.connect();
        daftarLokasi = new ArrayList();
        daftarPembimbing = new ArrayList();
        daftarMahasiswa = new ArrayList();
        Lokasi k = new Lokasi("Bandung", daftarLokasi.size() + 1);
        daftarLokasi.add(k);
        Lokasi l = new Lokasi("Jakarta", daftarLokasi.size() + 1);
        daftarLokasi.add(l);
        Lokasi m = new Lokasi("Yogyakarta", daftarLokasi.size() + 1);
        daftarLokasi.add(m);
        Lokasi n = new Lokasi("Surabaya", daftarLokasi.size() + 1);
        daftarLokasi.add(n);
        Lokasi o = new Lokasi("Semarang", daftarLokasi.size() + 1);
        daftarLokasi.add(o);

    }

    public DataBase getDb() {
        return db;
    }

    //Pembimbing
    public void addPembimbing(Pembimbing p) {
        daftarPembimbing.add(p);
    }

    public List<Pembimbing> getDaftarPembimbing() {
        return daftarPembimbing;
    }

    //kelompok
    public void addLokasi(Lokasi L) {
        daftarLokasi.add(L);
    }

    public List<Lokasi> getLokasi() {
        return daftarLokasi;
    }

    // Menu User as Mahsiswa
    public void MenuMahasiswa() {
        System.out.println(" 1. Tambah mahasiswa ");
        System.out.println(" 2. Login Mahasiswa ");
        System.out.println(" 3. Login Admin");
        System.out.println(" 4. Exit");

    }

    public void TambahMahasiswa() {
        System.out.println(" Masukkan Biodata ");
        Scanner in = new Scanner(System.in);
        System.out.print("Nama : ");
        String a = in.nextLine();
        System.out.print("Alamat : ");
        String b = in.nextLine();
        System.out.print("Prodi : ");
        String c = in.nextLine();
        System.out.print("Jurusan : ");
        String d = in.nextLine();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Nim : ");
        int e = in.nextInt();
        System.out.print("No.tlp : ");
        int f = in.nextInt();
        Mahasiswa m = new Mahasiswa(a, b, e, f, d, c);
        daftarMahasiswa.add(m);
        this.db.insertMhs(m);
    }

    public void DaftarMhsGui(String a, String b, String c, String d, int e, int f) {
        Mahasiswa m = new Mahasiswa(a, b, e, f, d, c);
        daftarMahasiswa.add(m);
        this.db.insertMhs(m);
    }

    public void loadMhs() {
        daftarMahasiswa = db.loadmhs();
    }

    public Mahasiswa LoginMhs(String nama, int nim) {
        loadMhs();
        Mahasiswa k = null;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getNama().equals(nama) && m.getNim() == nim) {
                k = m;
            }
        }
        return k;
    }

    public void MenuLogMahasiswa() {
        System.out.println("1. Pilih Lokasi");
        System.out.println("2. Edit biodata");
        System.out.println("3. Lihat Daftar Gladi");
        System.out.println("4. Exit");
        System.out.print("Pilihan :");
    }

    public void EditBiodata(Mahasiswa m) {
        System.out.println("Masukkan Biodata baru ");
        Scanner in = new Scanner(System.in);
        System.out.print("Nama :");
        String a = in.nextLine();
        m.setNama(a);
        System.out.print("Alamat :");
        String b = in.nextLine();
        m.setAlamat(b);
        System.out.print("Prodi :");
        String c = in.nextLine();
        m.setProdi(c);
        System.out.print("Jurusan :");
        String d = in.nextLine();
        m.setJurusan(d);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Nim");
        int e = in.nextInt();
        m.setNim(e);
        System.out.print("No.tlp :");
        int f = in.nextInt();
        m.setNotelp(f);
        db.updateMhs(m);
    }

    public void LihatDaftarGladi() {
        for (int i = 0; i < daftarLokasi.size(); i++) {
            System.out.println("Nama Kota       :" + daftarLokasi.get(i).getNamaLokasi());
            if (daftarLokasi.get(i).getPembimbing() != null) {
                System.out.println("Nama Pembimbing :" + daftarLokasi.get(i).getPembimbing().getNama());
            }
            daftarLokasi.get(i).setIsiKelompok(db.loadKel(daftarLokasi.get(i)));
            for (int j = 0; j < daftarLokasi.get(i).LihatPanKel(); j++) {
                System.out.println("No Kelompok     :" + daftarLokasi.get(i).getIsiKelompok(j).getNoKelompok());
                System.out.println("Nama Kelompok   :" + daftarLokasi.get(i).getIsiKelompok(j).getNamaKelompok());
                System.out.println("Anggota       :");
                daftarLokasi.get(i).getIsiKelompok(j).setDaftar(db.loadmhsKel(daftarLokasi.get(i).getIsiKelompok(j)));
                for (int k = 0; k < daftarLokasi.get(i).getIsiKelompok(j).getSize(); k++) {
                    System.out.println("Nama           :" + daftarLokasi.get(i).getIsiKelompok(j).getDaftar(k).getNama());
                    System.out.println("NIM            :" + daftarLokasi.get(i).getIsiKelompok(j).getDaftar(k).getNim());
                }
                System.out.println("");
            }
        }
    }

    public void pilihLokasi(Mahasiswa m) {
        System.out.println("1.Bandung");
        System.out.println("2.Jakarta");
        System.out.println("3.Yogyakarta");
        System.out.println("4.Surabaya");
        System.out.println("5.Semarang");
        System.out.println(" Pilih Lokasi : ");
    }

    public void pilihLokasiAdmin() {
        System.out.println("1.Bandung");
        System.out.println("2.Jakarta");
        System.out.println("3.Yogyakarta");
        System.out.println("4.Surabaya");
        System.out.println("5.Semarang");
        System.out.println(" Pilih Lokasi : ");
    }

    public void MenuLokasi(Mahasiswa m, Lokasi l) {
        System.out.println("Pilihan : ");
        System.out.println("1. Tambah Kelompok");
        System.out.println("2. Pilih kelompok ");
        System.out.println("3. Lihat kelompok");
    }

    public void BuatKelBaru(Mahasiswa m, Lokasi l) {
        l.setIsiKelompok(db.loadKel(l));
        System.out.println("Nama Kelompok : ");
        Scanner p = new Scanner(System.in);
        String a = p.nextLine();
        l.createKelompok(a, m);
        db.tambahkel(l.getIsiKelompok(l.LihatPanKel() - 1), m, l);
        db.tambahkelMhs(l.getIsiKelompok(l.LihatPanKel() - 1), m, l);
    }

    public void BuatKelBaruGUI(Mahasiswa m, Lokasi l, String c) {
        l.setIsiKelompok(db.loadKel(l));
        l.createKelompok(c, m);
        db.tambahkel(l.getIsiKelompok(l.LihatPanKel() - 1), m, l);
        db.tambahkelMhs(l.getIsiKelompok(l.LihatPanKel() - 1), m, l);
    }

    public void KelSdhAda(Mahasiswa m, Lokasi l) {
        l.setIsiKelompok(db.loadKel(l));
        System.out.println("Masukkan No. Kelompok :");
        Scanner n = new Scanner(System.in);
        int b = n.nextInt();
        l.getIsiKelompok((b % 10) - 1).setDaftar(db.loadmhsKel(l.getIsiKelompok((b % 10) - 1)));
        if (l.getIsiKelompok((b % 10) - 1).getSize() != 10) {
            l.getIsiKelompok((b % 10) - 1).AddMhs(m);
            db.tambahkelMhs(l.getIsiKelompok((b % 10) - 1), m, l);
        } else {
            System.out.println("Sudah Penuh");
        }
    }

    public void KelSdhAdaGUI(Mahasiswa m, Lokasi l, int b) {
        l.setIsiKelompok(db.loadKel(l));
        l.getIsiKelompok((b % 10) - 1).setDaftar(db.loadmhsKel(l.getIsiKelompok((b % 10) - 1)));
        if (l.getIsiKelompok((b % 10) - 1).getSize() != 10) {
            l.getIsiKelompok((b % 10) - 1).AddMhs(m);
            db.tambahkelMhs(l.getIsiKelompok((b % 10) - 1), m, l);
        } else {
            System.out.println("Sudah Penuh");
        }
    }

    public void LihatKel(Lokasi l) {
        for (int i = 0; i < l.LihatPanKel(); i++) {
            l.getIsiKelompok(i).toString();
        }
    }
    //menu admin

    public void MenuAdmin() {
        System.out.println("1. Tambah Pembimbing");
        System.out.println("2. Edit Kelompok");
        System.out.println("3. Exit");
        System.out.print(" Pilihan : ");
    }

    public void AdminEditKelompok() {
        System.out.println("1. Tambah Kelompok");
        System.out.println("2. Move anggota");
        System.out.println("3. Exit");
        System.out.print("Pilihan :");
    }

    public void AdminBuatKelBaru(int i) {
        System.out.print("Nama Kelompok : ");
        Scanner p = new Scanner(System.in);
        String a = p.nextLine();
        daftarLokasi.get(i).createKelompokAdmin(a);
        db.tambahkeladmin(daftarLokasi.get(i).getIsiKelompok(daftarLokasi.get(i).LihatPanKel() - 1), daftarLokasi.get(i));
    }

    public void AdminBuatKelBaruGUI(int i, String a) {
        daftarLokasi.get(i).createKelompokAdmin(a);
        db.tambahkeladmin(daftarLokasi.get(i).getIsiKelompok(daftarLokasi.get(i).LihatPanKel() - 1), daftarLokasi.get(i));
    }

    public void AdminHapusAnggota(int nolokasi, int lokasibaru, String nokelompok, int nim) {
        int i = 0;
        boolean nemu = false;
        daftarLokasi.get(nolokasi - 1).setIsiKelompok(db.loadKel(daftarLokasi.get(nolokasi - 1)));
        daftarLokasi.get(nolokasi - 1).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1).setDaftar(db.loadmhsKel(daftarLokasi.get(nolokasi - 1).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1)));
        if (daftarLokasi.get(nolokasi - 1).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1).searchMahasiswa(nim) != null) {
            while (nemu != true) {
                if (daftarLokasi.get(nolokasi - 1).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1).getDaftar(i).getNim() == nim) {
                    nemu = true;
                } else {
                    i++;
                }
            }
            db.deleteAnggota(daftarLokasi.get(nolokasi - 1).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1), daftarLokasi.get(nolokasi - 1).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1).getDaftar(i));
            daftarLokasi.get(nolokasi - 1).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1).removeAnggota(i);
            AdminMoveAngg(lokasibaru, nim, nolokasi, Integer.parseInt(nokelompok));
        } else {
            System.out.println("Tidak ada");
        }

    }

    public void AdminMoveAngg(int kota, int nim, int lokasilama, int nokelama) {
        daftarMahasiswa = db.loadmhs();
        Mahasiswa k = null;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getNim() == nim) {
                k = m;
            }
        }
        if (k != null) {
            System.out.print("Masukkan No. Kelompok :");
            Scanner n = new Scanner(System.in);
            int b = n.nextInt();
            daftarLokasi.get(kota - 1).setIsiKelompok(db.loadKel(daftarLokasi.get(kota - 1)));
            daftarLokasi.get(kota - 1).getIsiKelompok(b % 10 - 1).setDaftar(db.loadmhsKel(daftarLokasi.get(kota - 1).getIsiKelompok(b % 10 - 1)));
            daftarLokasi.get(kota - 1).getIsiKelompok(b % 10 - 1).AddMhs(k);
            db.tambahkelMhs(daftarLokasi.get(kota - 1).getIsiKelompok((b % 10) - 1), k, daftarLokasi.get(kota - 1));
        } else {
            System.out.println("Tidak Ketemu");
            daftarLokasi.get(lokasilama - 1).getIsiKelompok(nokelama % 10 - 1).AddMhs(k);
            db.tambahkelMhs(daftarLokasi.get(lokasilama - 1).getIsiKelompok(daftarLokasi.get(lokasilama - 1).LihatPanKel() - 1), k, daftarLokasi.get(lokasilama - 1));
        }
    }

    public void AdminTamPemb(String n, String al, int id, int idpem) {
        Pembimbing p = new Pembimbing(n, al, idpem);
        daftarLokasi.get(id).setPembimbing(p);
        db.tambahPembimbing(p, daftarLokasi.get(id));
    }
//////baru////////////////////////////////////////////////////////////////////////////////////////////////////

    public void AdminHapusAnggotaGUI(int nolokasi, int lokasibaru, String nokelompok, int nim, int b) {
        int i = 0;
        boolean nemu = false;
        daftarLokasi.get(nolokasi).setIsiKelompok(db.loadKel(daftarLokasi.get(nolokasi)));
        daftarLokasi.get(nolokasi).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1).setDaftar(db.loadmhsKel(daftarLokasi.get(nolokasi).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1)));
        if (daftarLokasi.get(nolokasi).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1).searchMahasiswa(nim) != null) {
            while (nemu != true) {
                if (daftarLokasi.get(nolokasi).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1).getDaftar(i).getNim() == nim) {
                    nemu = true;
                } else {
                    i++;
                }
            }
            db.deleteAnggota(daftarLokasi.get(nolokasi).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1), daftarLokasi.get(nolokasi).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1).getDaftar(i));
            daftarLokasi.get(nolokasi).getIsiKelompok(Integer.parseInt(nokelompok) % 10 - 1).removeAnggota(i);
            AdminMoveAnggGUI(lokasibaru, nim, nolokasi, Integer.parseInt(nokelompok),b);
        } else {
            System.out.println("Tidak ada");
        }

    }

    public void AdminMoveAnggGUI(int kota, int nim, int lokasilama, int nokelama, int nokelbar) {
        daftarMahasiswa = db.loadmhs();
        Mahasiswa k = null;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getNim() == nim) {
                k = m;
            }
        }
        if (k != null) {
            int b = nokelbar;
            daftarLokasi.get(kota).setIsiKelompok(db.loadKel(daftarLokasi.get(kota)));
            daftarLokasi.get(kota).getIsiKelompok(b % 10 - 1).setDaftar(db.loadmhsKel(daftarLokasi.get(kota).getIsiKelompok(b % 10 - 1)));
            daftarLokasi.get(kota).getIsiKelompok(b % 10 - 1).AddMhs(k);
            db.tambahkelMhs(daftarLokasi.get(kota).getIsiKelompok((b % 10) - 1), k, daftarLokasi.get(kota));
        } else {
            System.out.println("Tidak Ketemu");
            daftarLokasi.get(lokasilama).getIsiKelompok(nokelama % 10 - 1).AddMhs(k);
            db.tambahkelMhs(daftarLokasi.get(lokasilama).getIsiKelompok(daftarLokasi.get(lokasilama).LihatPanKel() - 1), k, daftarLokasi.get(lokasilama));
        }
    }
}
