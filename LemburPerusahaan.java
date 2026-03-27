/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package TugasDaringPertemuan4;

import java.util.Scanner;

public class LemburPerusahaan {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);   
        int jamLembur, upahPerJam, totalUpah;
        int maksimal = 50; 
        System.out.print("Masukkan jumlah jam lembur: ");
        jamLembur = input.nextInt();
        if (jamLembur > maksimal) {
            jamLembur = maksimal;
            System.out.println("Jam lembur dibatasi maksimal 50 jam.");
        }
        if (jamLembur <= 20) {
            upahPerJam = 2000;
        } else {
            upahPerJam = 3000;
        }
        totalUpah = jamLembur * upahPerJam;
        System.out.println("Total upah lembur: Rp " + totalUpah);

    }
}
