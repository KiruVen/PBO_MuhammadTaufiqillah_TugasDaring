/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package TugasDaringPertemuan4;

import java.util.Scanner;

public class Pola0x {
    public static void main(String[] args) {     
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                
                if (i == 1 || i == 5) {
                    System.out.print("0 ");
                } else if (i == j) {
                    System.out.print("0 ");
                } else {
                    System.out.print("x ");
                }  
            }
            System.out.println();
        }
    }
}

