package person;

/**
 *
 * @author Cahya
 */

import java.util.Date;

public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    protected final Date tanggalDipekerjakan;

    public Employee(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, Date tanggalDipekerjakan) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    public String getKantor() {
        return kantor;
    }

    public double getGaji() {
        return gaji;
    }

    public Date getTanggalDipekerjakan() {
        return tanggalDipekerjakan;
    }

    @Override
    public String toString() {
        return String.format(
            "Kelas: Employee\nNama: %s\nAlamat: %s\nNomor Telepon: %s\nEmail: %s\nKantor: %s\nGaji: %.2f\nTanggal Dipekerjakan: %s\n",
            nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan
        );
    }
}
