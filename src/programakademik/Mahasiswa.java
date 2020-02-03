/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programakademik;

import java.util.Scanner;

/**
 *
 * @author Taofik
 */
public class Mahasiswa extends Akademik{
    
    Scanner input = new Scanner(System.in);
        
        String def="Masukan "; 
        
        public void dataMahasiswa(){
            System.out.print(def + "NPM\t: " );
            setNPM(input.nextLine());
            System.out.print(def + "Nama\t: " );
            setNama(input.nextLine());
        }
}
