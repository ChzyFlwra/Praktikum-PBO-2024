import java.util.ArrayList;
import java.util.Scanner;

class Senjata {
    private String nama;
    private JenisSenjata jenisSenjata;
    private WarnaSenjata warnaSenjata;

    public Senjata(String nama, JenisSenjata jenisSenjata, WarnaSenjata warnaSenjata) {
        this.nama = nama;
        this.jenisSenjata = jenisSenjata;
        this.warnaSenjata = warnaSenjata;
    }

    //getter
    public String getNama() {
        return nama;
    }

    public JenisSenjata getJenisSenjata() {
        return jenisSenjata;
    }

    public WarnaSenjata getWarnaSenjata() {
        return warnaSenjata;
    }

    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisSenjata(JenisSenjata jenisSenjata) {
        this.jenisSenjata = jenisSenjata;
    }

    public void setWarnaSenjata(WarnaSenjata warnaSenjata) {
        this.warnaSenjata = warnaSenjata;
    }
}

class JenisSenjata {
    //private
    private String jenis;

    //public 
    public JenisSenjata(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}

class WarnaSenjata {
    private String warna;

    public WarnaSenjata(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}

public class Germa66 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Senjata> databaseSenjata = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("=== Germa 66 Weapon ===");
            System.out.println("1. Tambah Senjata");
            System.out.println("2. Lihat Senjata");
            System.out.println("3. Edit Senjata");
            System.out.println("4. Hapus Senjata");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambahSenjata();
                    break;
                case 2:
                    tampilkanDataSenjata();
                    break;
                case 3:
                    editSenjata();
                    break;
                case 4:
                    hapusSenjata();
                    break;
                case 0:
                    System.out.println("Keluar dari program. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 0);
    }

    static void tambahSenjata() {
        System.out.print("Masukkan nama senjata: ");
        String namaSenjata = scanner.next();
        System.out.print("Masukkan jenis senjata: ");
        String jenisSenjata = scanner.next();
        System.out.print("Masukkan warna senjata: ");
        String warnaSenjata = scanner.next();

        JenisSenjata jenis = new JenisSenjata(jenisSenjata);
        WarnaSenjata warna = new WarnaSenjata(warnaSenjata);
        Senjata senjataBaru = new Senjata(namaSenjata, jenis, warna);

        databaseSenjata.add(senjataBaru);
        System.out.println("Senjata berhasil ditambahkan!");
    }

    static void editSenjata() {
        tampilkanDataSenjata();
        System.out.print("Pilih nomor senjata yang akan diubah: ");
        int index = scanner.nextInt();

        if (index >= 0 && index-1 < databaseSenjata.size()) {
            System.out.print("Masukkan nama senjata yang baru: ");
            String namaBaru = scanner.next();
            System.out.print("Masukkan jenis senjata yang baru: ");
            String jenisBaru = scanner.next();
            System.out.print("Masukkan warna senjata yang baru: ");
            String warnaBaru = scanner.next();

            Senjata senjata = databaseSenjata.get(index-1);
            senjata.setNama(namaBaru);
            senjata.getJenisSenjata().setJenis(jenisBaru);
            senjata.getWarnaSenjata().setWarna(warnaBaru);

            System.out.println("Senjata berhasil diubah!");
        } else {
            System.out.println("Nomor senjata tidak valid atau senjata tidak ditemukan.");
        }
    }

    static void hapusSenjata() {
        tampilkanDataSenjata();
        System.out.print("Pilih nomor senjata yang akan dihapus: ");
        int index = scanner.nextInt();

        if (index >= 0 && index-1 < databaseSenjata.size()) {
            databaseSenjata.remove(index-1);
            System.out.println("Senjata berhasil dihapus!");
        } else {
            System.out.println("Nomor senjata tidak valid atau senjata tidak ditemukan.");
        }
    }

    static void tampilkanDataSenjata() {
        System.out.println("=== Data Senjata ===");
        for (int i = 0; i < databaseSenjata.size(); i++) {
            Senjata senjata = databaseSenjata.get(i);
            System.out.println((i + 1) + ". " + senjata.getNama() + " - " +
                    senjata.getJenisSenjata().getJenis() + " - " +
                    senjata.getWarnaSenjata().getWarna());
        }
        System.out.println("====================");
    }
}
