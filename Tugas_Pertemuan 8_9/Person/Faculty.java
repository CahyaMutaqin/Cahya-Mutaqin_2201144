package person;

/**
 *
 * @author Cahya
 */
import java.util.Date;

public class Faculty extends Employee {
    protected String jamKerja;
    protected String pangkat;

    public Faculty(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, Date tanggalDipekerjakan, String jamKerja, String pangkat) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    public String getJamKerja() {
        return jamKerja;
    }

    public String getPangkat() {
        return pangkat;
    }

    @Override
    public String toString() {
        return String.format(
            "Kelas: Faculty\nNama: %s\nAlamat: %s\nNomor Telepon: %s\nEmail: %s\nKantor: %s\nGaji: %.2f\nTanggal Dipekerjakan: %s\nJam Kerja: %s\nPangkat: %s\n",
            nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan, jamKerja, pangkat
        );
    }
}

