package objekgeometris;

/**
 *
 * @author Cahya
 */

import java.util.Scanner;

public class UjiSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi1 dari segitiga: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi2 dari segitiga: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi3 dari segitiga: ");
        double sisi3 = input.nextDouble();

        System.out.print("Masukkan warna segitiga: ");
        String warna = input.next();

        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean terisi = input.nextBoolean();

 
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

      
        System.out.println("Luas segitiga adalah: " + segitiga.getLuas());
        System.out.println("Keliling segitiga adalah: " + segitiga.getKeliling());
        System.out.println("Warna segitiga adalah: " + segitiga.getWarna());
        System.out.println("Apakah segitiga terisi? " + segitiga.isTerisi());
        System.out.println(segitiga.toString());

        input.close();
    }
}
