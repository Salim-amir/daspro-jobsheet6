import java.util.Scanner;
public class Pemilihan2Percobaan216 {
   public static void main(String[] args) {
    Scanner input16 = new Scanner(System.in); 
    int pilihan_menu;
    String member;
    double harga = 0;
    double total_bayar;
    double diskon = 0;

    System.out.println("----------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundlng (Ricebowl + Ice Tea)");
        System.out.println("----------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input16.nextInt();
        input16.nextLine(); 
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input16.nextLine();
        System.out.println("----------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl: Rp " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice tea: Rp " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga paket boundlng: Rp " + harga);
                
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }
        
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl: Rp " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice tea: Rp " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga paket boundlng: Rp " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("Input status member tidak valid");
        }    
        System.out.println("----------------------"); 
   } 
}
