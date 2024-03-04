package ribuan;
import java.util.Scanner;

public class Ribuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan tiga angka
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        // Memeriksa apakah angka1 merupakan angka ribuan
        if (angka1 >= 1000 && angka1 <= 9999) {
            System.out.println("Angka pertama merupakan angka ribuan!");
        } else {
            System.out.println("Angka pertama bukan angka ribuan");
        }

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        // Memeriksa apakah angka2 merupakan angka ribuan
        if (angka2 >= 1000 && angka2 <= 9999) {
            System.out.println("Angka kedua merupakan angka ribuan!");
        } else {
            System.out.println("Angka kedua bukan angka ribuan");
        }

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = input.nextInt();
        // Memeriksa apakah angka3 merupakan angka ribuan
        if (angka3 >= 1000 && angka3 <= 9999) {
            System.out.println("Angka ketiga merupakan angka ribuan!");
        } else {
            System.out.println("Angka ketiga bukan angka ribuan");
        }

        input.close();
    }
}
