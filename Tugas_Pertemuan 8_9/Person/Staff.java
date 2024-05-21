package person;

/**
 *
 * @author Cahya
 */
import java.util.Date;

public class Staff extends Employee {
    protected String gelar;

    public Staff(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, Date tanggalDipekerjakan, String gelar) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }

    public String getGelar() {
        return gelar;
    }

    @Override
    public String toString() {
        return String.format(
            "Kelas: Staff\nNama: %s\nAlamat: %s\nNomor Telepon: %s\nEmail: %s\nKantor: %s\nGaji: %.2f\nTanggal Dipekerjakan: %s\nGelar: %s\n",
            nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan, gelar
        );
    }
}

