package patternc;

public class PatternC {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

