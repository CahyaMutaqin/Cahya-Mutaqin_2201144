package bilanganprima_komposit;
import java.util.Scanner;

public class BilanganPrima_Komposit {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Meminta input batas awal
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        // Meminta input batas akhir
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        // Menampilkan hasil untuk bilangan prima
        System.out.print("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        // Menampilkan hasil untuk bilangan komposit
        System.out.print("\nBilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    // Fungsi untuk mengecek apakah suatu bilangan prima atau tidak
    static boolean isPrima(int bilangan) {
        if (bilangan <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(bilangan); i++) {
            if (bilangan % i == 0) {
                return false;
            }
        }
        return true;
    }
}
