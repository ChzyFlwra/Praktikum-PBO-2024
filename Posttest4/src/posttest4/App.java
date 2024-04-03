package posttest4;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static ArrayList<Senjata> listsenjata = new ArrayList<>();
    static ArrayList<Jenis> listjenis = new ArrayList<>();
    static ArrayList<WarnaSenjata> listwarna = new ArrayList<>();
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
        System.out.print("Masukkan nama senjata: ");
        String nama = scanner.next();
        System.out.print("Masukkan warna senjata: ");
        String warna = scanner.next();
        System.out.print("Masukkan jenis senjata: ");
        String jenis = scanner.next();

        Senjata senjataBaru = new Senjata(nama);
        WarnaSenjata warnaBaru = new WarnaSenjata(nama, warna);
        Jenis jenisBaru = new Jenis(nama, jenis);
        senjataBaru.setNama(nama);
        warnaBaru.setWarna(warna);
        jenisBaru.setJenis(jenis);
        listsenjata.add(senjataBaru);
        listwarna.add(warnaBaru);
        listjenis.add(jenisBaru);
        System.out.println("Senjata telah ditambahkan.");
    }

    public static void lihatSenjata() {
        System.out.println("Daftar Senjata:");
        for (int i = 0; i < listsenjata.size(); i++) {
            listjenis.get(i).tampilSenjata();
            System.out.println("Warna senjata : " + listwarna.get(i).getWarna());
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
        String nama = scanner.next();
        System.out.println("Masukkan warna baru: ");
        String warna= scanner.next();
        System.out.println("Masukkan jenis baru: ");
        String jenis = scanner.next();


        Senjata senjataBaru = new Senjata(nama);
        WarnaSenjata warnaBaru = new WarnaSenjata(nama, warna);
        Jenis jenisBaru = new Jenis(nama, jenis);
        senjataBaru.setNama(nama);
        warnaBaru.setWarna(warna);
        jenisBaru.setJenis(jenis);
        listsenjata.set(index, senjataBaru);
        listwarna.set(index, warnaBaru);
        listjenis.set(index, jenisBaru);

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
