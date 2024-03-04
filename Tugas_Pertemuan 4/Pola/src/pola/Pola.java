package pola;
import java.util.Scanner;

public class Pola {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan nilai N
        System.out.print("Masukkan nilai N (antara 1 dan 1000): ");
        int N = input.nextInt();

        // Proses untuk Menampilkan pola
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // untuk  membuat pindah baris setelah setiap baris bintang
        }

        input.close();
    }
}
