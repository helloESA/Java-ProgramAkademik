/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programakademik;

/**
 *
 * @author Rachmat Aji & Julio
 */
public class NilaiMatkul{

    static class MatkulEkskusi extends Matkul{
        String namaMatkul;
        int sks;

        public String getNamaMatkul() {
            return namaMatkul;
        }

        public void setNamaMatkul(String namaMatkul) {
            this.namaMatkul = namaMatkul;
        }

        public int getSks() {
            return sks;
        }

        public void setSks(int sks) {
            this.sks = sks;
        }
        

        @Override
        void info() {
               System.out.println("Matkul yang Tersedia");
               System.out.println("1.Bahasa Indonesia               2");
               System.out.println("2.DKAG                           3");
               System.out.println("3.WebPro2                        3");
               System.out.println("4.OrkomArkom                     3");
               System.out.println("5.AR&VR                          3");
               System.out.println("6.MobPro                         3");
               System.out.println("7.OOP                            3");
        }
    }
    static class Nilai{
        
    }
}
