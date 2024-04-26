package posttest5;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static ArrayList<Senjata> listSenjata = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Germa 66 Weapon ===");
            System.out.println("1. Tambah Senjata");
            System.out.println("2. Lihat Senjata");
            System.out.println("3. Edit Senjata");
            System.out.println("4. Hapus Senjata");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    tambahSenjata();
                    break;
                case 2:
                    lihatSenjata();
                    break;
                case 3:
                    editSenjata();
                    break;
                case 4:
                    hapusSenjata();
                    break;
                case 0:
                    System.out.println("Sampai jumpa!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

    public static void tambahSenjata() {
        System.out.print("Masukkan nama senjata: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan warna senjata: ");
        String warna = scanner.nextLine();
        System.out.print("Masukkan jenis senjata: ");
        String jenis = scanner.nextLine();
    
        // Create an instance of Jenis with provided nama and jenis
        Senjata senjataBaru = new Jenis(nama, jenis);
        senjataBaru.setWarna(warna);
    
        listSenjata.add(senjataBaru);
        System.out.println("Senjata telah ditambahkan.");
    }
    
    

    public static void lihatSenjata() {
        System.out.println("Daftar Senjata:");
        for (Senjata senjata : listSenjata) {
            senjata.tampilSenjata();
        }
    }

    public static void editSenjata() {
        if (listSenjata.isEmpty()) {
            System.out.println("Tidak ada senjata yang tersedia untuk diubah.");
            return;
        }

        System.out.println("Pilih nomor senjata yang akan diubah:");
        for (int i = 0; i < listSenjata.size(); i++) {
            System.out.println((i + 1) + ". " + listSenjata.get(i).getNama());
        }

        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (index < 1 || index > listSenjata.size()) {
            System.out.println("Nomor senjata tidak valid.");
            return;
        }

        System.out.print("Masukkan nama baru: ");
        String namaBaru = scanner.nextLine();
        System.out.print("Masukkan warna baru: ");
        String warnaBaru = scanner.nextLine();
        System.out.print("Masukkan jenis baru: ");
        String jenisBaru = scanner.nextLine();

        Senjata senjata = listSenjata.get(index - 1);
        senjata.setNama(namaBaru);
        senjata.setWarna(warnaBaru);
        senjata.setJenis(jenisBaru);

        System.out.println("Senjata telah diubah.");
    }

    public static void hapusSenjata() {
        if (listSenjata.isEmpty()) {
            System.out.println("Tidak ada senjata yang tersedia untuk dihapus.");
            return;
        }

        System.out.println("Pilih nomor senjata yang akan dihapus:");
        for (int i = 0; i < listSenjata.size(); i++) {
            System.out.println((i + 1) + ". " + listSenjata.get(i).getNama());
        }

        int index = scanner.nextInt();
        if (index < 1 || index > listSenjata.size()) {
            System.out.println("Nomor senjata tidak valid.");
            return;
        }

        listSenjata.remove(index - 1);
        System.out.println("Senjata telah dihapus.");
    }
}

