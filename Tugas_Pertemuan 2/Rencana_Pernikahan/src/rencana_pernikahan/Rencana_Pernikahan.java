package rencana_pernikahan;
import java.util.Scanner;

public class Rencana_Pernikahan {
      public static void main(String[] args) {
        // Inisialisasi variabel
        double tabungan;
        boolean calonPasangan;

        // Membuat objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah tabungan
        System.out.print("Masukkan jumlah tabungan Anda dalam satuan jutaan Rupiah: ");
        tabungan = input.nextDouble();

        // Meminta input keberadaan calon pasangan (true/false)
        System.out.print("Apakah sudah mempunyai calon pasangan? (true/false): ");
        calonPasangan = input.nextBoolean();

        // Menentukan apakah seseorang akan menikah berdasarkan kondisi
        if (tabungan > 100 && calonPasangan) {
            System.out.println("Anda sudah siap untuk menikah!");
        } else {
            System.out.println("Anda belum siap untuk menikah.");
        }

        // Menutup objek Scanner
        input.close();
    }
}

