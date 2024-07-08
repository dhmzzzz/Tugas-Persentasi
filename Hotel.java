import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nama;
    private String lokasi;
    private List<Kamar> daftarKamar;
    private List<Reservasi> daftarReservasi;

    public Hotel(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.daftarKamar = new ArrayList<>();
        this.daftarReservasi = new ArrayList<>();
    }

    public static Hotel inputHotel() {
        return new Hotel("Hotel Bintang", "Jakarta");
    }

    public void tambahKamar(Kamar kamar) {
        daftarKamar.add(kamar);
    }

    public void reservasi(Tamu tamu, Kamar kamar, Reservasi reservasi) {
        daftarReservasi.add(reservasi);
        kamar.setTersedia(false);
        System.out.println("Reservasi berhasil untuk tamu " + tamu.getNama() + " dengan kamar nomor " + kamar.getNomorKamar());
    }

    public void checkOut(Reservasi reservasi) {
        Kamar kamar = reservasi.getKamar();
        kamar.setTersedia(true);
        daftarReservasi.remove(reservasi);
        System.out.println("Check-out berhasil untuk tamu " + reservasi.getTamu().getNama() + " dari kamar nomor " + kamar.getNomorKamar());
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public List<Kamar> getDaftarKamar() {
        return daftarKamar;
    }

    public List<Reservasi> getDaftarReservasi() {
        return daftarReservasi;
    }
}
