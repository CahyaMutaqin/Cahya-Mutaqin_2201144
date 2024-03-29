package persegipanjang;

public class PersegiPanjang {
    int panjang;
    int lebar;
    
    PersegiPanjang(int panjangBaru, int lebarBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    int getLuas() {
        return panjang * lebar;
    }
    
    int getKeliling() {
        return 2 * (panjang + lebar);
    }
    
    void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }
    
    void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }

    public static void main(String[] args) {
        PersegiPanjang PersegiPanjang1 = new PersegiPanjang(1, 1);
        PersegiPanjang PersegiPanjang2 = new PersegiPanjang(30, 40);
        PersegiPanjang PersegiPanjang3 = new PersegiPanjang(25, 35);

        System.out.println("PersegiPanjang1:");
        System.out.println("Luas: " + PersegiPanjang1.getLuas());
        System.out.println("Keliling: " + PersegiPanjang1.getKeliling());

        System.out.println("\nPersegiPanjang2:");
        System.out.println("Luas: " + PersegiPanjang2.getLuas());
        System.out.println("Keliling: " + PersegiPanjang2.getKeliling());

        System.out.println("\nPersegiPanjang3:");
        System.out.println("Luas: " + PersegiPanjang3.getLuas());
        System.out.println("Keliling: " + PersegiPanjang3.getKeliling());
    }
}
