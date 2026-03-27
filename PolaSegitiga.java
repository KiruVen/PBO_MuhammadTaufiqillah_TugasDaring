/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package TugasDaringPertemuan4;

import java.util.Scanner;

public class PolaSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, j, k;
        System.out.print("Masukan Angka = ");
        n = input.nextInt();
        for(i=n; i>=1; i--){
            for(j=1; j<i; j++){
                System.out.print(" ");
            }
            for(k=i;k<=n; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    } 
}
