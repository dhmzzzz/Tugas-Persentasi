public abstract class Person {
    private String nama;
    private String alamat;
    private String nomorTelepon;

    public Person(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    // Metode abstrak
    public abstract void showInfo();
}
