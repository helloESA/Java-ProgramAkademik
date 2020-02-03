package programakademik;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riki subagja
 */
public class Akademik {
   private static String NPM;
   private static String nama;
   private static String kelas;
   private static String jurusan;
   private static String matkul;
   private static String sks;
    public static String getNPM() {
        return NPM;
    }

    public static void setNPM(String NPM) {
        Akademik.NPM = NPM;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Akademik.nama = nama;
    }

    public static String getKelas() {
        return kelas;
    }

    public static void setKelas(String kelas) {
        Akademik.kelas = kelas;
    }

    public static String getJurusan() {
        return jurusan;
    }

    public static void setJurusan(String jurusan) {
        Akademik.jurusan = jurusan;
    }

    public static String getMatkul() {
        return matkul;
    }

    public static void setMatkul(String matkul) {
        Akademik.matkul = matkul;
    }

    public static String getSks() {
        return sks;
    }

    public static void setSks(String sks) {
        Akademik.sks = sks;
    }

}