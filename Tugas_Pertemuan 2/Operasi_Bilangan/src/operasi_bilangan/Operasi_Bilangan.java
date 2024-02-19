package operasi_bilangan;
import java.util.Scanner;

public class Operasi_Bilangan {
    public static void main(String[] args) {
        // Deklarasi variabel untuk menyimpan pembilang dan penyebut dari tiga pecahan
        int pembilang1, penyebut1, pembilang2, penyebut2, pembilang3, penyebut3;

        // Deklarasi variabel untuk menyimpan nilai pecahan dalam bentuk desimal
        double pecahan1, pecahan2, pecahan3;

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan pecahan pertama
        System.out.print("Masukkan pecahan pertama (pembilang/penyebut): ");
        // Membaca dan memisahkan pembilang dan penyebut menggunakan "/"
        String pecahanStr1 = input.next();
        String[] pecahan1Array = pecahanStr1.split("/");
        // Mengonversi string menjadi integer untuk pembilang dan penyebut
        pembilang1 = Integer.parseInt(pecahan1Array[0]);
        penyebut1 = Integer.parseInt(pecahan1Array[1]);

        // Meminta pengguna memasukkan pecahan kedua
        System.out.print("Masukkan pecahan kedua (pembilang/penyebut): ");
        // Proses yang sama untuk pecahan kedua
        String pecahanStr2 = input.next();
        String[] pecahan2Array = pecahanStr2.split("/");
        pembilang2 = Integer.parseInt(pecahan2Array[0]);
        penyebut2 = Integer.parseInt(pecahan2Array[1]);

        // Meminta pengguna memasukkan pecahan ketiga
        System.out.print("Masukkan pecahan ketiga (pembilang/penyebut): ");
        // Proses yang serupa untuk pecahan ketiga
        String pecahanStr3 = input.next();
        String[] pecahan3Array = pecahanStr3.split("/");
        pembilang3 = Integer.parseInt(pecahan3Array[0]);
        penyebut3 = Integer.parseInt(pecahan3Array[1]);

        // Penanganan penyebut nol, jika penyebut ada yang nol maka program berhenti
        if (penyebut1 == 0 || penyebut2 == 0 || penyebut3 == 0) {
            System.out.println("Penyebut tidak boleh nol. Silakan masukkan pecahan dengan penyebut yang valid.");
            return;
        }

        // Menghitung nilai pecahan dalam bentuk desimal
        pecahan1 = (double) pembilang1 / penyebut1;
        pecahan2 = (double) pembilang2 / penyebut2;
        pecahan3 = (double) pembilang3 / penyebut3;

        // Menampilkan hasil penjumlahan, pengurangan, perkalian dari ketiga pecahan
        System.out.println("Hasil penjumlahan \t: " + (pecahan1 + pecahan2 + pecahan3));
        System.out.println("Hasil pengurangan \t: " + (pecahan1 - pecahan2 - pecahan3));
        System.out.println("Hasil perkalian \t: " + (pecahan1 * pecahan2 * pecahan3));

        // Penanganan pembagian dengan penyebut nol
        if (pecahan2 == 0 || pecahan3 == 0) {
            System.out.println("Pembagian tidak valid karena terdapat pecahan dengan penyebut nol.");
        } else {
            // Menampilkan hasil pembagian dari ketiga pecahan
            System.out.println("Hasil pembagian \t: " + (pecahan1 / pecahan2 / pecahan3));
        }
    }
}
