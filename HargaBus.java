/*
Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package TugasDaringPertemuan4;

import java.util.Scanner;

public class HargaBus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tujuan, kelas, jumlah;
        int harga = 0;
        double total, diskon = 0, bayar;
        
        System.out.println("=== PILIH TUJUAN ===");
        System.out.println("1. Jakarta");
        System.out.println("2. Yogya");
        System.out.println("3. Surabaya");
        System.out.print("Masukkan tujuan (1-3): ");
        tujuan = input.nextInt();
        
        System.out.println("\n=== PILIH KELAS ===");
        System.out.println("1. Eksekutif");
        System.out.println("2. Bisnis");
        System.out.println("3. Ekonomi");
        System.out.print("Masukkan kelas (1-3): ");
        kelas = input.nextInt();

        System.out.print("\nMasukkan jumlah tiket: ");
        jumlah = input.nextInt();
        if (tujuan == 1) { // Jakarta
            if (kelas == 1) harga = 70000;
            else if (kelas == 2) harga = 40000;
            else if (kelas == 3) harga = 10000;
        } 
        else if (tujuan == 2) { // Yogya
            if (kelas == 1) harga = 80000;
            else if (kelas == 2) harga = 50000;
            else if (kelas == 3) harga = 20000;
        } 
        else if (tujuan == 3) { // Surabaya
            if (kelas == 1) harga = 90000;
            else if (kelas == 2) harga = 60000;
            else if (kelas == 3) harga = 30000;
        }
        total = harga * jumlah;
        if (jumlah >= 4) {
            if ((tujuan == 3 && kelas == 1) || (tujuan == 2 && kelas == 3)) {
                diskon = 0.10 * total;
            }
        }
        bayar = total - diskon;
        System.out.println("\n=== HASIL ===");
        System.out.println("Harga per tiket : Rp " + harga);
        System.out.println("Total harga     : Rp " + total);
        System.out.println("Diskon          : Rp " + diskon);
        System.out.println("Total bayar     : Rp " + bayar);
    }
}
