package person;

/**
 *
 * @author Cahya
 */

import java.util.Calendar;

public class MyDate {
    protected int tahun;
    protected int bulan;
    protected int hari;

    public MyDate() {
        Calendar calendar = Calendar.getInstance();
        this.tahun = calendar.get(Calendar.YEAR);
        this.bulan = calendar.get(Calendar.MONTH);
        this.hari = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d", tahun, bulan + 1, hari);
    }
}
