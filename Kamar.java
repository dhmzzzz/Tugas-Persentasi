public class Kamar implements CheckInOut {
    private int nomorKamar;
    private String tipe;
    private double harga;
    private boolean tersedia;

    public Kamar(int nomorKamar, String tipe, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipe = tipe;
        this.harga = harga;
        this.tersedia = true; // Awalnya kamar tersedia
    }

    public static Kamar inputKamar() {
        return new Kamar(101, "Suite", 500000);
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    @Override
    public void checkIn() {
        tersedia = false;
        System.out.println("Kamar nomor " + nomorKamar + " telah di-check-in.");
    }

    @Override
    public void checkOut() {
        tersedia = true;
        System.out.println("Kamar nomor " + nomorKamar + " telah di-check-out.");
    }
}
