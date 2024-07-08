import java.util.Scanner;

public class Tamu extends Person {

    public Tamu(String nama, String alamat, String nomorTelepon) {
        super(nama, alamat, nomorTelepon);
    }

    public static Tamu inputTamu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama tamu: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan alamat tamu: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan nomor telepon tamu: ");
        String nomorTelepon = scanner.nextLine();
        return new Tamu(nama, alamat, nomorTelepon);
    }

    @Override
    public void showInfo() {
        System.out.println("Nama: " + getNama() + ", Alamat: " + getAlamat() + ", Nomor Telepon: " + getNomorTelepon());
    }
}
