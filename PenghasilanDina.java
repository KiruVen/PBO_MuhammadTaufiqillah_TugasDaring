/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package TugasDaringPertemuan4;

import java.util.Scanner;

public class PenghasilanDina {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int ttlHal = 50;
       int upahPerHal = 15000;
       
       System.out.print("Masukkan jumlah halaman yang selesai dikerjakan ");
       int x = input.nextInt();
       
       int uangTerima = x * upahPerHal;
       int sisaHal = ttlHal - x;
       int uangMax = sisaHal * upahPerHal;
       
       System.out.println("Uang yang sudah diterima Diana :Rp " +uangTerima);
       System.out.println("Uang yang masih bisa didapatkan: Rp " + uangMax);
       
       input.close();
    }
    
}
