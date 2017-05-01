/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_Sistem_Informasi_Gladi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chando
 */
public class DataBase {

    private String url = "jdbc:mysql://localhost/tubes";
    private String user = "root";
    private String pass = "";
    private Connection con;

    public void connect() {
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("connected");
        } catch (SQLException ex) {
            System.out.println("Gagal");
        }
    }

    public void insertMhs(Mahasiswa m) {
        try {
            String sql = "insert into mahasiswa values ('"
                    + m.getNim() + "','" + m.getNama() + "','" + m.getAlamat()
                    + "','" + m.getNotelp() + "','" + m.getJurusan() + "','" + m.getProdi() + "','')";
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal" + ex.getMessage());
        }
    }

    public void insertLokasi(Lokasi l) {
        try {
            String sql = "insert into lokasi values ("
                    + l.getId() + ",'" + l.getNamaLokasi() + "')";
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal" + ex.getMessage());
        }
    }

    public void tambahkel(Kelompok k, Mahasiswa m, Lokasi l) {
        try {
            String sql = "insert into kelompok values ('"
                    + k.getNoKelompok() + "','" + k.getNamaKelompok() + "',"
                    + k.getSize() + "," + l.getId() + ")";
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal" + ex.getMessage());
        }
    }

    public void tambahkeladmin(Kelompok k, Lokasi l) {
        try {
            String sql = "insert into kelompok values ('"
                    + k.getNoKelompok() + "','" + k.getNamaKelompok() + "',"
                    + k.getSize() + "," + l.getId() + ")";
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal" + ex.getMessage());
        }
    }

    public void tambahkelMhs(Kelompok k, Mahasiswa m, Lokasi l) {
        try {
            String sql = "update mahasiswa set NoKelompok = '"
                    + k.getNoKelompok() + "' where Nim = " + m.getNim() + "; ";
            String sql2 = "update kelompok set Kapasitas = " + k.getSize()
                    + " where NoKelompok ='" + k.getNoKelompok() + "';";
            Statement stmt = con.createStatement();
            Statement stmt2 = con.createStatement();
            stmt.executeUpdate(sql);
            stmt2.executeUpdate(sql2);
            stmt.close();
            stmt2.close();
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal " + ex.getMessage());
        }
    }

    public ArrayList<Mahasiswa> loadmhs() {
        try {
            ArrayList<Mahasiswa> m = new ArrayList<>();
            Mahasiswa mhs;
            String sql = "select * from mahasiswa";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                mhs = new Mahasiswa(rs.getString("Nama"), rs.getString("Alamat"), rs.getInt("Nim"), rs.getInt("NoTlp"), rs.getString("Jurusan"), rs.getString("Prodi"));
                m.add(mhs);
            }
            return m;
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal" + ex.getMessage());
        }
    }

    public void tambahPembimbing(Pembimbing p, Lokasi l) {
        try {
            String sql = "insert into Pembimbing values ("
                    + p.getIdPembimbing() + ",'" + p.getNama() + "','"
                    + p.getAlamat() + "','" + l.getId() + "')";
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal" + ex.getMessage());
        }
    }

    public void updateMhs(Mahasiswa m) {
        try {
            String sql = "update mahasiswa set Nama = '"
                    + m.getNama() + "', Nim = " + m.getNim()
                    + ", Alamat = '" + m.getAlamat() + "', Jurusan = '" + m.getJurusan()
                    + "', Prodi = '" + m.getProdi() + "', NoTlp = " + m.getNotelp() + "; ";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal " + ex.getMessage());
        }
    }

    public void deleteAnggota(Kelompok k, Mahasiswa m) {
        try {
            String sql = "update mahasiswa set NoKelompok = '' where Nim =" + m.getNim() + ";";
            String sql2 = "update kelompok set Kapasitas = " + (k.getSize() - 1) + " where NoKelompok ='" + k.getNoKelompok() + "';";
            Statement stmt = con.createStatement();
            Statement stmt2 = con.createStatement();
            stmt.executeUpdate(sql);
            stmt2.executeUpdate(sql2);
            stmt.close();
            stmt2.close();
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal " + ex.getMessage());
        }
    }

    public ArrayList<Kelompok> loadKel(Lokasi l) {
        try {
            Kelompok kel;
            ArrayList<Kelompok> k = new ArrayList<>();
            String sql = "select * from kelompok where idLokasi = " + l.getId();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                kel = new Kelompok(rs.getString("NoKelompok"), rs.getString("Nama_Kelompok"));
                k.add(kel);
            }
            return k;
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal" + ex.getMessage());
        }
    }

    public ArrayList<Mahasiswa> loadmhsKel(Kelompok k) {
        try {
            ArrayList<Mahasiswa> m = new ArrayList<>();
            Mahasiswa mhs;
            String sql = "select * from mahasiswa where NoKelompok = '" + k.getNoKelompok() + "';";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                mhs = new Mahasiswa(rs.getString("Nama"), rs.getString("Alamat"), rs.getInt("Nim"), rs.getInt("NoTlp"), rs.getString("Jurusan"), rs.getString("Prodi"));
                m.add(mhs);
            }
            return m;
        } catch (SQLException ex) {
            throw new IllegalArgumentException("Gagal" + ex.getMessage());
        }
    }
}
