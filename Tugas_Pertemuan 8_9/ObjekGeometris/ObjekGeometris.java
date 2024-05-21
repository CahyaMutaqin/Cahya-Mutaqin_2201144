package objekgeometris;

/**
 *
 * @author Cahya
 */

public class ObjekGeometris {
    private String warna = "putih";
    private boolean terisi;

    // Konstruktor default
    public ObjekGeometris() {
        this.terisi = false;
    }

    // Konstruktor dengan parameter
    public ObjekGeometris(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }

    // Getter dan setter untuk warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter dan setter untuk terisi
    public boolean isTerisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    @Override
    public String toString() {
        return "Warna: " + warna + " dan terisi: " + terisi;
    }
}
