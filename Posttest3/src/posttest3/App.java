package posttest3;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static ArrayList<Senjata> listsenjata = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("=== Germa 66 Weapon ===");
            System.out.println("1. Tambah Senjata");
            System.out.println("2. Lihat Senjata");
            System.out.println("3. Edit Senjata");
            System.out.println("4. Hapus Senjata");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                tambahSenjata();
            } else if (choice == 2) {
                lihatSenjata();
            } else if (choice == 3) {
                editSenjata();
            } else if (choice == 4) {
                hapusSenjata();
            } else if (choice == 0) {
                System.out.println("babai");
                System.exit(0);
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }
    }

    public static void tambahSenjata() {
        System.out.println("Masukkan nama senjata: ");
        String nama = scanner.next();
        System.out.println("Masukkan warna senjata: ");
        String warna = scanner.next();
        System.out.println("Masukkan jenis senjata: ");
        String jenis = scanner.next();

        Senjata senjataBaru = new Senjata(nama, warna, jenis);
        listsenjata.add(senjataBaru);
        System.out.println("Senjata telah ditambahkan.");
    }

    public static void lihatSenjata() {
        System.out.println("Daftar Senjata:");
        for (Senjata senjata : listsenjata) {
            System.out.println(
                    "Nama: " + senjata.getNama() + ", Warna: " + senjata.getWarna() + ", Jenis: " + senjata.getJenis());
        }
    }

    public static void editSenjata() {
        if (listsenjata.isEmpty()) {
            System.out.println("Tidak ada senjata yang tersedia untuk diubah.");
            return;
        }

        System.out.println("Pilih nomor senjata yang akan diubah:");
        for (int i = 0; i < listsenjata.size(); i++) {
            System.out.println((i + 1) + ". " + listsenjata.get(i).getNama());
        }

        int index = scanner.nextInt() - 1;
        if (index < 0 || index >= listsenjata.size()) {
            System.out.println("Nomor senjata tidak valid.");
            return;
        }

        System.out.println("Masukkan nama baru: ");
        String namaBaru = scanner.next();
        System.out.println("Masukkan warna baru: ");
        String warnaBaru = scanner.next();
        System.out.println("Masukkan jenis baru: ");
        String jenisBaru = scanner.next();

        Senjata senjata = listsenjata.get(index);
        senjata.setNama(namaBaru);
        senjata.setWarna(warnaBaru);
        senjata.setJenis(jenisBaru);

        System.out.println("Senjata telah diubah.");
    }

    public static void hapusSenjata() {
        if (listsenjata.isEmpty()) {
            System.out.println("Tidak ada senjata yang tersedia untuk dihapus.");
            return;
        }

        System.out.println("Pilih nomor senjata yang akan dihapus:");
        for (int i = 0; i < listsenjata.size(); i++) {
            System.out.println((i + 1) + ". " + listsenjata.get(i).getNama());
        }

        int index = scanner.nextInt() - 1;
        if (index < 0 || index >= listsenjata.size()) {
            System.out.println("Nomor senjata tidak valid.");
            return;
        }

        listsenjata.remove(index);
        System.out.println("Senjata telah dihapus.");
    }
}

class Senjata {
    private String nama;
    private String warna;
    private String jenis;

    public Senjata(String nama, String warna, String jenis) {
        this.nama = nama;
        this.warna = warna;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
