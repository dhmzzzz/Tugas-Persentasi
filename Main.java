import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input manual untuk Hotel
        Hotel hotel = Hotel.inputHotel();

        // Input manual untuk Kamar
        Kamar kamar = Kamar.inputKamar();
        hotel.tambahKamar(kamar);

        // Input manual untuk Tamu
        Tamu tamu = Tamu.inputTamu();

        // Input manual untuk Reservasi
        Reservasi reservasi = Reservasi.inputReservasi(tamu, kamar);
        hotel.reservasi(tamu, kamar, reservasi);

        // Input manual untuk Pembayaran
        Pembayaran pembayaran = Pembayaran.inputPembayaran(reservasi);
        pembayaran.setLunas(true);

        // Output informasi reservasi setelah check-in
        System.out.println("\nDaftar Reservasi Setelah Check-in:");
        for (Reservasi r : hotel.getDaftarReservasi()) {
            System.out.println("Tamu: " + r.getTamu().getNama() + ", Kamar: " + r.getKamar().getNomorKamar() + ", Tanggal Check-in: " + r.getTanggalCheckIn());
        }

        // Contoh penggunaan fasilitas
        Fasilitas fasilitas = Fasilitas.inputFasilitas();
        System.out.println("\nInformasi Fasilitas:");
        System.out.println("Nama: " + fasilitas.getNamaFasilitas());
        System.out.println("Deskripsi: " + fasilitas.getDeskripsi());
    }
}
