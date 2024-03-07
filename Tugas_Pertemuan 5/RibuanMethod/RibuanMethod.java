package ribuanmethod;
import java.util.Scanner;

public class RibuanMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka1 = getInputAndCheckRibuan(input, "Masukkan angka pertama");
        int angka2 = getInputAndCheckRibuan(input, "Masukkan angka kedua");
        int angka3 = getInputAndCheckRibuan(input, "Masukkan angka ketiga");

        input.close();
    }
    
    public static int getInputAndCheckRibuan(Scanner input, String prompt) {
        System.out.print(prompt + ": ");
        int angka = input.nextInt();

        if (isRibuan(angka)) {
            System.out.println("Angka merupakan angka ribuan!");
        } else {
            System.out.println("Angka bukan angka ribuan");
        }

        return angka;
    }

    public static boolean isRibuan(int angka) {
        return angka >= 1000 && angka <= 9999;
    }
}

