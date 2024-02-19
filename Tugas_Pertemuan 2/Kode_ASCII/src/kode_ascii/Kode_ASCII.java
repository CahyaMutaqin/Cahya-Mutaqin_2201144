package kode_ascii;

public class Kode_ASCII {
    public static void main(String[] args) {
        // Mendefinisikan karakter 'X' dan 'y'
        char karakterX = 'X';
        char karakterY = 'y';

        // Menghitung kode ASCII dari karakter 'X' dan 'y'
        int asciiX = (int) karakterX; // Mengonversi karakter 'X' ke kode ASCII
        int asciiY = (int) karakterY; // Mengonversi karakter 'y' ke kode ASCII

        // Menjumlahkan kode ASCII
        int jumlahASCII = asciiX + asciiY; // Menjumlahkan kode ASCII dari 'X' dan 'y'

        // Menampilkan hasil
        System.out.println("Kode ASCII dari 'X': " + asciiX); // Menampilkan kode ASCII 'X'
        System.out.println("Kode ASCII dari 'y': " + asciiY); // Menampilkan kode ASCII 'y'
        System.out.println("Jumlah kode ASCII dari 'X' dan 'y': " + jumlahASCII); // Menampilkan jumlah kode ASCII
    }
}
