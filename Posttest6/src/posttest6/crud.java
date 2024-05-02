package posttest6;

import java.util.ArrayList;
import java.util.Scanner;

public final class crud implements menu{

    static ArrayList<Senjata> listnama = new ArrayList<>();
    static ArrayList<Jenis> listjenis = new ArrayList<>();
    static ArrayList<Warna> listwarna = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void tambahSenjata() {
        System.out.println("\n");
        System.out.print("Masukkan nama senjata     : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jenis senjata    : ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan warna senjata    : ");
        String warna = scanner.nextLine();
    
        Warna listSenjata =  new Warna(nama, jenis, warna);
        listSenjata.setNama(nama);;
        listSenjata.setWarna(warna);
        listSenjata.setJenis(jenis);
    
        listnama.add(listSenjata);
        listjenis.add(listSenjata);
        listwarna.add(listSenjata);
        System.out.println("Senjata telah ditambahkan.");
    }

    @Override
    public void lihatSenjata() {
    System.out.println("\n");
    System.out.println("+============= Daftar Senjata =============+");
        for (int i = 0; i < listnama.size(); i++) {
            System.out.println("[ Indeks ke " + (i+1) + " ]");

            Senjata senjata = listnama.get(i);
            Warna warnaSenjata = listwarna.get(i);
            Jenis jenisSenjata = listjenis.get(i);
            
            System.out.println("Kategori    : " + senjata.kategori);
            System.out.println("Nama        : " + senjata.getNama());
            System.out.println("Jenis       : " + jenisSenjata.getJenis());
            System.out.println("Warna       : " + warnaSenjata .getWarna());
            System.out.println("+==========================================+");
        }

        if (listnama.size() == 0){
            System.out.println("Data masih kosong");
            System.out.println("Tekan enter untuk melanjutkan...");
            try {
                System.in.read();
            } catch (Exception e) {
                System.err.println("Terjadi kesalahan saat membaca input: " + e.getMessage()); 
            } 
        }
    }

    @Override
    public void editSenjata() {
        System.out.println("Pilih nomor senjata yang akan diubah:");
        for (int i = 0; i < listnama.size(); i++) {
            System.out.println((i + 1) + ". " + listnama.get(i).getNama());
        }
        int index = scanner.nextInt();
        scanner.nextLine();
    
        if (index < 1 || index > listnama.size()) {
            System.out.println("Nomor senjata tidak valid.");
            return;
        }
    
        Senjata senjata = listnama.get(index - 1);
        
        System.out.println("\n");
        System.out.println("Pilih properti yang akan diubah:");
        System.out.println("1. Nama");
        System.out.println("2. Jenis");
        System.out.println("3. Warna");
        String pilihan = scanner.nextLine();
        switch (pilihan) {
            case "1":
                System.out.print("Masukkan nama baru: ");
                String namaBaru = scanner.nextLine();
                if (senjata instanceof Senjata) {
                    ((Senjata) senjata).setNama(namaBaru);
                } else {
                    System.out.println("Properti tidak dapat diubah.");
                }
                break;
            case "2":
                System.out.print("Masukkan jenis baru: ");
                String jenisBaru = scanner.nextLine();
                if (senjata instanceof Jenis) {
                    ((Jenis) senjata).setJenis(jenisBaru);
                } else {
                    System.out.println("Properti tidak dapat diubah.");
                }
                break;
            case "3":
                System.out.print("Masukkan warna baru: ");
                String warnaBaru = scanner.nextLine();
                if (senjata instanceof Warna) {
                    ((Warna) senjata).setWarna(warnaBaru);
                } else {
                    System.out.println("Properti tidak dapat diubah.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
    
    @Override
    public final void hapusSenjata() {
        if (listnama.isEmpty()) {
            System.out.println("Tidak ada senjata yang tersedia untuk dihapus.");
            return;
        }

        System.out.println("Pilih nomor senjata yang akan dihapus:");
        for (int i = 0; i < listnama.size(); i++) {
            System.out.println((i + 1) + ". " + listnama.get(i).getNama());
        }

        int index = scanner.nextInt();
        if (index < 1 || index > listnama.size()) {
            System.out.println("Nomor senjata tidak valid.");
            return;
        }

        listnama.remove(index - 1);
        listjenis.remove(index - 1);
        listwarna.remove(index - 1);
        System.out.println("Senjata telah dihapus.");
    }
    
}