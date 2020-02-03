/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programakademik;

import java.util.Scanner;

/**
 *
 * @author Rima & Fahmi
 */
public class Kelas extends Akademik{
    Scanner input = new Scanner(System.in);
        
        String kelas, jurusan, def="Masukan "; 
   
        public void dataKelas(){
            System.out.print(def + "Kelas\t: " );
            setKelas(input.nextLine());
            System.out.print(def + "Jurusan\t: ");
            setJurusan(input.nextLine());
            System.out.println("\n");
        }
}
