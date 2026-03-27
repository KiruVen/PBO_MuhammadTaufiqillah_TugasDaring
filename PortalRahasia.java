/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package TugasDaringPertemuan4;

import java.util.Scanner; 

public class PortalRahasia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal, akhir;
        System.out.print("Masukkan nomor awal: ");
        awal = input.nextInt();
        System.out.print("Masukkan nomor akhir: ");
        akhir = input.nextInt();
        System.out.println("\nMisi yang membuka portal rahasia:");
        for (int i=awal;i<=akhir;i++) {
            // Kelipatan 3 dan 4 (berarti kelipatan 12)
            if (i%3==0&&i%4==0) {
                System.out.print(i+" ");
            }
        }
    }
}
