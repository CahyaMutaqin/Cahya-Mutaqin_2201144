package palindrom;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tiga digit integer: ");
        int angka = scanner.nextInt();
        
        if (isPalindrome(angka)) {
            System.out.println(angka + " adalah palindrom");
        } else {
            System.out.println(angka + " bukan palindrom");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrome(int num) {
        int angkaAsli = num;
        int angkaReverse = 0;
        
        while (num != 0) {
            int digit = num % 10;
            angkaReverse = angkaReverse * 10 + digit;
            num /= 10;
        }
        
        return angkaAsli == angkaReverse;
    }
}