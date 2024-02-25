package ganjil_genap;
import java.util.Scanner;

public class Ganjil_Genap {
    public static void main(String[] args) {
        // Membuat Scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan bilangan pertama
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        // Meminta user memasukkan bilangan kedua
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        input.close();

        // Mengecek apakah kedua bilangan genap atau ganjil
        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            // Jika keduanya genap, tampilkan hasil penjumlahan
            System.out.println("Hasil penjumlahan: " + (bilangan1 + bilangan2));
        } else if (bilangan1 % 2 != 0 && bilangan2 % 2 != 0) {
            // Jika keduanya ganjil, tampilkan hasil perkalian
            System.out.println("Hasil perkalian: " + (bilangan1 * bilangan2));
        } else {
            // Jika satu bilangan genap dan satu bilangan ganjil, maka akan menampilkan pesan
            System.out.println("Kombinasi bilangan genap dan ganjil, tidak dapat melakukan operasi.");
        }
    }
}
