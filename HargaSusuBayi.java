/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package TugasDaringPertemuan4;

import java.util.Scanner;

public class HargaSusuBayi {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        
        int pilihan, jumlah;
        double harga = 0, total = 0, diskon = 0, bayar = 0;
        
        System.out.println("=== PILIH MEREK SUSU ===");
        System.out.println("1. Merek X (Rp 40.000)");
        System.out.println("2. Merek Y (Rp 50.000)");
        System.out.println("3. Merek Z (Rp 60.000)");
        System.out.print("Masukkan pilihan (1-3): ");
        pilihan = input.nextInt();
        
        System.out.print("Masukkan jumlah kotak: ");
        jumlah = input.nextInt();
        
        switch (pilihan) {
            case 1:
                harga = 40000;
                total = harga * jumlah;
                if (jumlah >= 3) {
                    diskon = 0.10 * total;
                }
                break;
                
            case 2:
                harga = 50000;
                total = harga * jumlah;
                
                if (jumlah > 3) {
                    diskon = 0.12 * total;
                }
                break;
                
            case 3:
                harga = 60000;
                
                if (jumlah >= 1) {
                    total = harga; 
                }
                if (jumlah > 1) {
                    double sisa = jumlah - 1;
                    double hargaDiskon = sisa * harga;
                    diskon = 0.15 * hargaDiskon;
                    total = total + hargaDiskon;
                }
                break;
                
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        
        bayar = total - diskon;
        
        System.out.println("Total Pembelian : Rp " + total);
        System.out.println("Diskon          : Rp " + diskon);
        System.out.println("Total Bayar     : Rp " + bayar);
         
    }
}
