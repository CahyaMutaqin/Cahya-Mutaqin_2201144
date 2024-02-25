package jumlah_mobil;
import java.util.Scanner;

public class Jumlah_Mobil{
    public static void main(String[] args) {
        // Membuat Scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah peserta
        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = input.nextInt();

        // Menghitung jumlah mobil yang diperlukan
        int jumlahMobil;

        if (jumlahPeserta <= 7) {
            jumlahMobil = 1;
        } else {
            jumlahMobil = jumlahPeserta / 7;
            if (jumlahPeserta % 7 > 0) {
                jumlahMobil++;
            }
        }

        // Menampilkan hasil
        System.out.println("Jumlah Mobil Yang Diperlukan: " + jumlahMobil);

        input.close();
    }
}

