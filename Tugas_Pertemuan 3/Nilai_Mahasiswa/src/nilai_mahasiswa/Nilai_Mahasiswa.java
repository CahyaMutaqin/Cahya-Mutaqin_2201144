package nilai_mahasiswa;
import java.util.Scanner;

public class Nilai_Mahasiswa {
    public static void main(String[] args) {
        // Membuat Scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Meminta input nilai UTS, UAS, dan Tugas
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double tugas = input.nextDouble();

        // Menghitung Nilai Akhir (NA) dengan bobot 35% UTS, 45% UAS, dan 20% Tugas
        double na = (0.35 * uts) + (0.45 * uas) + (0.20 * tugas);

        // Menampilkan Nilai Akhir (NA)
        System.out.println("Nilai Akhir (NA): " + na);

        // Menentukan nilai indeks berdasarkan switch
        char nilaiIndeks;
        switch ((int) na / 10) {
            case 10:
            case 9:
                nilaiIndeks = 'A';
                break;
            case 8:
                nilaiIndeks = 'B';
                break;
            case 7:
                nilaiIndeks = 'C';
                break;
            default:
                nilaiIndeks = 'E';
                break;
        }

        // Menampilkan nilai indeks
        System.out.println("Nilai Indeks: " + nilaiIndeks);

        input.close();
    }
}

