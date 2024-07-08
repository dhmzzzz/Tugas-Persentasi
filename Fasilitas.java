public class Fasilitas {
    private String namaFasilitas;
    private String deskripsi;

    public Fasilitas(String namaFasilitas, String deskripsi) {
        this.namaFasilitas = namaFasilitas;
        this.deskripsi = deskripsi;
    }

    public static Fasilitas inputFasilitas() {
        return new Fasilitas("Kolam Renang", "Kolam renang outdoor dengan pemandangan kota.");
    }

    public String getNamaFasilitas() {
        return namaFasilitas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
