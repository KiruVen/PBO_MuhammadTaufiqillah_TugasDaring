/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package TugasDaringPertemuan4;

import java.util.Scanner;

public class AnivPNP {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int umur;
        System.out.print("Masukkan umur PNP: ");
        umur = input.nextInt();
        if (umur % 10 == 0) {
            int dekade = umur / 10;
            System.out.println("Dekade PNP Ke " + dekade);
        } else {
            System.out.println("Dies Natalis PNP Ke " + umur);
        }
    }
}
