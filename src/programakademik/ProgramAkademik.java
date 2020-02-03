/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programakademik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mohamad Esa
 */
public class ProgramAkademik {
        
    public static void main(String[] args) {
       int i=0;
        Scanner inputMenu = new Scanner(System.in);
        Scanner inputPlihan = new Scanner(System.in);
        Scanner inputNilai = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
            
        
        String keputusan = "Y";
        
        int pilihMenu, pilihMatkul;
            
        String matkul[] = new String[100],
               dosen[] = new String[100],
               index[] = new String[100],
               keterangan[] = new String[100];
        double[] nilaiTugas = new double[100], 
                 nilaiKuis  = new double[100],
                 nilaiUTS   = new double[100],
                 nilaiUAS   = new double[100],
                 nilaiHadir  = new double[100],
                 nilaiTotal = new double[100];
        int[] sks = new int[100];
        
        
        //instansiasi class Matkul dan Dosen
                NilaiMatkul.MatkulEkskusi matkul1 = new NilaiMatkul.MatkulEkskusi();
                Dosen dosen1 = new Dosen();
                NilaiMatkul.MatkulEkskusi matkul2 = new NilaiMatkul.MatkulEkskusi();
                Dosen dosen2 = new Dosen();
                NilaiMatkul.MatkulEkskusi matkul3 = new NilaiMatkul.MatkulEkskusi();
                Dosen dosen3 = new Dosen();
                NilaiMatkul.MatkulEkskusi matkul4 = new NilaiMatkul.MatkulEkskusi();
                Dosen dosen4 = new Dosen();
                NilaiMatkul.MatkulEkskusi matkul5 = new NilaiMatkul.MatkulEkskusi();
                Dosen dosen5 = new Dosen();
                NilaiMatkul.MatkulEkskusi matkul6 = new NilaiMatkul.MatkulEkskusi();
                Dosen dosen6 = new Dosen();
                NilaiMatkul.MatkulEkskusi matkul7 = new NilaiMatkul.MatkulEkskusi();
                Dosen dosen7 = new Dosen();
                
        //instansiasi Class
            Mahasiswa mahasiswa = new Mahasiswa();
            Kelas kelas = new Kelas();
                        
            //mengeset matkul dan dosennya
                matkul1.setNamaMatkul("Bahasa Indonesia");
                matkul1.setSks(2);
                dosen1.setNamadosen("Deni Lastari, M.Pd.");

                matkul2.setNamaMatkul("DKAG");
                matkul2.setSks(3);
                dosen2.setNamadosen("Mohammad Guntur, M.Kom.");

                matkul3.setNamaMatkul("WebPro2");
                matkul3.setSks(3);
                dosen3.setNamadosen("Agus Heryanto, ST., M.Kom.");

                matkul4.setNamaMatkul("Arkom Orkom");
                matkul4.setSks(3);
                dosen4.setNamadosen("Fahmi Abdullah, S.T., M.Kom.");

                matkul5.setNamaMatkul("ARVR");
                matkul5.setSks(3);
                dosen5.setNamadosen("Andri Nugroho, S.Kom.");

                matkul6.setNamaMatkul("Mobile Programming");
                matkul6.setSks(3);
                dosen6.setNamadosen("Niken Riyanti, ST.");

                matkul7.setNamaMatkul("OOP 1");
                matkul7.setSks(3);
                dosen7.setNamadosen("Iis Ismawati, S.Kom., M.Kom.");
                
                
            
            
                //pilih Menu
                System.out.println();
                System.out.println(">> Menginpukan Identitas");
                System.out.println();
    
                //penginputan data
                mahasiswa.dataMahasiswa();
                kelas.dataKelas();
                do {
                    System.out.println("=======================================================================================================================================");
                    System.out.println("                                                    PROGRAM PENILAIAN AKADEMIK                                                         ");
                    System.out.println("=======================================================================================================================================");
                    System.out.println(">> Silahkan Pilih Menu Dengan Keyword yang Sudah disediakan");
                    System.out.println("    1. Menginputkan Nilai");
                    System.out.println("    2. Lihat Data");
                    System.out.println("    3. Tentang");
                    System.out.println("    0. Exit Program\n");
                    System.out.println("=======================================================================================================================================");
                    System.out.print(">> Pilihan Menu = "); 
                    pilihMenu = inputMenu.nextInt();
                    
                    switch(pilihMenu){
                        case 1 :
   
                            System.out.println(">> Menginputkan Matkul");
                            System.out.println();
                            do{
                                matkul1.info();
                                System.out.println("Matkul yang dipilih = ");
                                pilihMatkul = inputPlihan.nextInt();
                            switch(pilihMatkul){
                                case 1 :
                                    matkul[i] = matkul1.getNamaMatkul();
                                    sks[i] = matkul1.getSks();
                                    dosen[i] = dosen1.getNamadosen();
                                    break;
                                case 2 :
                                    matkul[i] = matkul2.getNamaMatkul();
                                    sks[i] = matkul2.getSks();
                                    dosen[i] = dosen2.getNamadosen();
                                    break;
                                case 3 :
                                    matkul[i] = matkul3.getNamaMatkul();
                                    sks[i] = matkul3.getSks();
                                    dosen[i] = dosen3.getNamadosen();
                                    break;
                                case 4 :
                                    matkul[i] = matkul4.getNamaMatkul();
                                    sks[i] = matkul4.getSks();
                                    dosen[i] = dosen4.getNamadosen();
                                    break;
                                case 5 :
                                    matkul[i] = matkul5.getNamaMatkul();
                                    sks[i] = matkul5.getSks();
                                    dosen[i] = dosen5.getNamadosen();
                                    break;
                                case 6 :
                                    matkul[i] = matkul6.getNamaMatkul();
                                    sks[i] = matkul6.getSks();
                                    dosen[i] = dosen6.getNamadosen();
                                    break;
                                case 7 :
                                    matkul[i] = matkul7.getNamaMatkul();
                                    sks[i] = matkul7.getSks();
                                    dosen[i] = dosen7.getNamadosen();
                                    break;
                                default:
                                    if(pilihMatkul > 7){
                                    System.out.println("Data Tidak Ada");
                                    } 
                                    break;
                            }
                            System.out.println("----------------------------------------------------");
                            System.out.println("Matkul yang anda pilih\t: "+matkul[i]);
                            System.out.println("Banyaknya SKS\t\t: "+sks[i]);
                            System.out.println("Dosen Pengampu\t\t: "+dosen[i]);

                            double hadir,tugas, kuis, uts, uas;
                            System.out.print("Masukkan Nilai Kehadiran :");
                            nilaiHadir[i] = inputNilai.nextDouble();
                            hadir = nilaiHadir[i]*15/100;

                            System.out.print("Masukkan Nilai Tugas\t:");
                            nilaiTugas[i] = inputNilai.nextDouble();
                            tugas = nilaiTugas[i]*20/100;

                            System.out.print("Masukkan Nilai Kuis\t:");
                            nilaiKuis[i] = inputNilai.nextDouble();
                            kuis = nilaiKuis[i]*10/100;

                            System.out.print("Masukkan Nilai UTS\t:");
                            nilaiUTS[i] = inputNilai.nextDouble();
                            uts = nilaiUTS[i]*35/100;

                            System.out.print("Masukkan Nilai UAS\t:");
                            nilaiUAS[i] = inputNilai.nextDouble();
                            uas = nilaiUAS[i]*30/100; 
                            
                            nilaiTotal[i] = hadir+tugas+kuis+uts+uas;
                            if(nilaiTotal[i]>90){
                                index[i] = "A";
                                keterangan[i] = "LULUS";
                            } else if(nilaiTotal[i]>80){
                                index[i] = "AB";
                                keterangan[i] = "LULUS";
                            } else if(nilaiTotal[i]>75){
                                index[i] = "B";
                                keterangan[i] = "LULUS";
                            } else if(nilaiTotal[i]>65){
                                index[i] = "BC";
                                keterangan[i] = "LULUS";
                            } else if(nilaiTotal[i]>60){
                                index[i] = "C";
                                keterangan[i] = "DIPERTIMBANGKAN";
                            } else if(nilaiTotal[i]>50){
                                index[i] = "D";
                                keterangan[i] = "TIDAK LULUS";
                            } else if(nilaiTotal[i]>30){
                                index[i] = "E";
                                keterangan[i] = "TIDAK LULUS";
                            }
                            

                            System.out.print("Apakah anda ingin menginputkan matkul lagi lagi ? Y/T : ");
                            
                            try{
                                keputusan = input2.readLine();
                            }catch(IOException e){
                                 System.out.println("Gagal Membaca Keyboard");
                            }
                            i++;
                            } while (keputusan.equals("Y")||keputusan.equals("y"));
                            break;
                        
                        case 2:
                            System.out.println();
                            System.out.println("===================================================================================================================================================================================");
                            System.out.println("                                                                                 REKAPITULASI NILAI                                                                                ");
                            System.out.println("===================================================================================================================================================================================\n");
                            System.out.println("\tNama\t: "+String.valueOf(Mahasiswa.getNama()));
                            System.out.println("\tNPM\t: "+String.valueOf(Mahasiswa.getNPM()));
                            System.out.println("\tKelas\t: "+String.valueOf(Kelas.getKelas())+" - "+String.valueOf(Kelas.getJurusan()));
                            System.out.println();
                            System.out.println("===================================================================================================================================================================================");
                            System.out.printf("%25s %5s %35s %10s %10s %10s %10s %10s %20s %10s %25s","MATKUL |","SKS |","DOSEN |","HADIR |","TUGAS |","KUIS |","UTS |","UAS |","NILAI AKHIR |","INDEX |","KETERANGAN |");
                            System.out.println();
                            System.out.print("===================================================================================================================================================================================\n");
                            try {
                                for(int v=0; v<i;v++){
                                    System.out.printf("%25s %5s %35s %10s %10s %10s %10s %10s %20s %10s %25s",matkul[v]+" |",sks[v]+" |",dosen[v]+" |",nilaiHadir[v]+" |",
                                                    nilaiTugas[v]+" |",nilaiKuis[v]+" |",nilaiUTS[v]+" |",nilaiUAS[v]+" |",nilaiTotal[v]+" |",index[v]+" |",keterangan[v]+" |");
                                    System.out.println();
                                }
                            } catch (Exception e) {
                                System.out.println("Tabel Gagal Dieksekusi"+e);
                            }
                            break;
                        
                        case 3 :
                            System.out.println();
                            System.out.println(">> Tentang Program");
                            System.out.println("    Program ini merupakan program yang bertujuan untuk menginputkan\n");
                            System.out.println("    data nilai Mahasiswa berbasis Console\n"
                                             + "    Dikerjakan bersama oleh Kelompok 1 17B CID RM");
                            break;
                        
                        case 0 : 
                            System.out.println("TERIMA KASIH");
                            System.exit(0);
                            break;
                        
                        default:
                            System.out.println("Inputan yang Anda masukkan Salah!");
                            
                }
                    System.out.print("Kembali ke Halaman Utama? (Y/N)"); keputusan = inputPlihan.next();
                    System.out.println(); 
            } while (keputusan.equals("Y")||keputusan.equals("y"));
    }
    
}
