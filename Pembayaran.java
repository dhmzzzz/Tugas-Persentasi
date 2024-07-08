public class Pembayaran {
    private Reservasi reservasi;
    private double jumlahPembayaran;
    private boolean lunas;

    public Pembayaran(Reservasi reservasi, double jumlahPembayaran) {
        this.reservasi = reservasi;
        this.jumlahPembayaran = jumlahPembayaran;
        this.lunas = false; // Awalnya belum lunas
    }

    public static Pembayaran inputPembayaran(Reservasi reservasi) {
        return new Pembayaran(reservasi, 500000);
    }

    public Reservasi getReservasi() {
        return reservasi;
    }

    public double getJumlahPembayaran() {
        return jumlahPembayaran;
    }

    public boolean isLunas() {
        return lunas;
    }

    public void setLunas(boolean lunas) {
        this.lunas = lunas;
        System.out.println("Pembayaran untuk tamu " + reservasi.getTamu().getNama() + " sejumlah " + jumlahPembayaran + " telah dilunasi.");
    }
}
