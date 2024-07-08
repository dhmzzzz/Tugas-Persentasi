import java.util.Date;

public class Reservasi implements CheckInOut {
    private Tamu tamu;
    private Kamar kamar;
    private Date tanggalCheckIn;
    private Date tanggalCheckOut;
    private boolean checkedIn;

    public Reservasi(Tamu tamu, Kamar kamar, Date tanggalCheckIn, Date tanggalCheckOut) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.tanggalCheckIn = tanggalCheckIn;
        this.tanggalCheckOut = tanggalCheckOut;
        this.checkedIn = false; // Awalnya belum check-in
    }

    public static Reservasi inputReservasi(Tamu tamu, Kamar kamar) {
        return new Reservasi(tamu, kamar, new Date(), new Date());
    }

    public Tamu getTamu() {
        return tamu;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public Date getTanggalCheckIn() {
        return tanggalCheckIn;
    }

    public Date getTanggalCheckOut() {
        return tanggalCheckOut;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    @Override
    public void checkIn() {
        checkedIn = true;
        System.out.println("Reservasi untuk tamu " + tamu.getNama() + " telah di-check-in.");
    }

    @Override
    public void checkOut() {
        checkedIn = false;
        System.out.println("Reservasi untuk tamu " + tamu.getNama() + " telah di-check-out.");
    }
}
