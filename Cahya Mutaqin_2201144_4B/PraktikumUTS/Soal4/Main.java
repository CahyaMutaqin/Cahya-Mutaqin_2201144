package main;

class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok() {
        panjang = 1;
        lebar = 1;
        tinggi = 1;
    }

    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }

    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    public int getVolume() {
        return panjang * lebar * tinggi;
    }

    public void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }

    public void setTinggi(int tinggiBaru) {
        tinggi = tinggiBaru;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }
}

public class Main {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(30, 40, 50);
        Balok balok3 = new Balok(25, 35, 45);

        System.out.println("Balok dengan panjang : " + balok1.getPanjang() + ", lebar : " + balok1.getLebar() + ", dan tinggi : " + balok1.getTinggi());
        System.out.println("Kelilingnya : " + balok1.getKeliling() + " dan volumenya : " + balok1.getVolume());
        System.out.println();

        System.out.println("Balok dengan panjang : " + balok2.getPanjang() + ", lebar : " + balok2.getLebar() + ", dan tinggi : " + balok2.getTinggi());
        System.out.println("Kelilingnya : " + balok2.getKeliling() + " dan volumenya : " + balok2.getVolume());
        System.out.println();

        System.out.println("Balok dengan panjang : " + balok3.getPanjang() + ", lebar : " + balok3.getLebar() + ", dan tinggi : " + balok3.getTinggi());
        System.out.println("Kelilingnya : " + balok3.getKeliling() + " dan volumenya : " + balok3.getVolume());
    }
}
