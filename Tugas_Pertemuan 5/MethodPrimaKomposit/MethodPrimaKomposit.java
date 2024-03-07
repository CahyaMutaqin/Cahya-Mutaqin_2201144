package methodprimakomposit;
import java.util.Scanner;

public class MethodPrimaKomposit {

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
        tampilkanBilangan(batasAwal, batasAkhir, true);

        // Menampilkan hasil untuk bilangan komposit
        System.out.print("\nBilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah: ");
        tampilkanBilangan(batasAwal, batasAkhir, false);

        scanner.close();
    }

    // Prosedur untuk menampilkan bilangan prima atau komposit dalam rentang
    static void tampilkanBilangan(int batasAwal, int batasAkhir, boolean isPrima) {
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i) == isPrima) {
                System.out.print(i + " ");
            }
        }
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

