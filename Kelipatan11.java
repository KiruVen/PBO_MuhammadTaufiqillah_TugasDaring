/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package TugasDaringPertemuan4;

import java.util.Scanner;

public class Kelipatan11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, awal, akhir , rata_rata;
        int jml = 0,total = 0;
        
        System.out.print("Masukan Batas Awal = ");
        awal = input.nextInt();
        System.out.print("Masukan Batas Akhir = ");
        akhir = input.nextInt();
        
        jml = 0;
        total = 0;
        if(awal < akhir){
            for(i=awal; i<=akhir; i++){
                if(i % 11 == 0 && i % 2 != 0){
                    System.out.print(i+" ");
                    jml++;
                    total = total + i;
                }
            }
        }
        else {
            for(i=awal; i>=akhir; i--){
                if(i % 11 == 0 && i % 2 != 0){
                    System.out.print(i+" ");
                    jml++;
                    total = total + i;
                }
            }
        }
        rata_rata = total / jml;
        System.out.println("\nJumlah angka \t:"+jml);
        System.out.println("Total \t\t:"+total);
        System.out.println("Rata-rata \t:"+rata_rata);
    }
}
