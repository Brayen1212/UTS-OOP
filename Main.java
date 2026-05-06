// Nama : Kadek Tomy Brayen 
// NIM : 2515101116
// Kelas : 2A ILKOM

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Barang  : ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan Harga Barang : Rp ");
        int harga = scanner.nextInt();

        System.out.print("Masukkan Persen Diskon (contoh: 10 untuk 10%): ");
        int diskon = scanner.nextInt();

        // Proses perhitungan dan cetak struk
        StrukSederhana struk = new StrukSederhana(namaBarang, harga, diskon);
        struk.getInfo();

        scanner.close();
    }
}
