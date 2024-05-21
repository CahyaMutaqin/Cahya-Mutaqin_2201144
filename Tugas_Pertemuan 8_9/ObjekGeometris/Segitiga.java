package objekgeometris;

/**
 *
 * @author Cahya
 */

public class Segitiga extends ObjekGeometris {
    private double sisi1;
    private double sisi2;
    private double sisi3;

    // Konstruktor default
    public Segitiga() {
        this(1.0, 1.0, 1.0);
    }

    // Konstruktor dengan parameter
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Getter untuk sisi-sisi
    public double getSisi1() {
        return sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    // Metode untuk menghitung luas
    public double getLuas() {
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    // Metode untuk menghitung keliling
    public double getKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }
}

