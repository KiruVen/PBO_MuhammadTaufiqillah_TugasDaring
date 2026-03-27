/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package TugasDaringPertemuan4;

import java.util.Scanner;

public class BilanganGenap {
    public static void main(String[] args){
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka Genap = ");
        
        angka = input.nextInt();
        while(angka % 2 != 0){
            System.out.print("Masukan Angka Genap = ");
            angka = input.nextInt();
        }
        angka = angka + 1;
        System.out.println(angka);
    }
}
