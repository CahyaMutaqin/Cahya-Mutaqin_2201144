package methodpola;
import java.util.Scanner;

public class MethodPola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan nilai N
        System.out.print("Masukkan nilai N (antara 1 dan 1000): ");
        int N = input.nextInt();

        // Menampilkan pola segitiga
        tampilkanPolaSegitiga(N);

        input.close();
    }

    // Prosedur untuk menampilkan pola segitiga
    static void tampilkanPolaSegitiga(int N) {
        for (int i = 1; i <= N; i++) {
            tampilkanBarisBintang(i);
            System.out.println(); // untuk membuat pindah baris setelah setiap baris bintang
        }
    }

    // Prosedur untuk menampilkan baris bintang
    static void tampilkanBarisBintang(int jumlahBintang) {
        for (int j = 1; j <= jumlahBintang; j++) {
            System.out.print("* ");
        }
    }
}

