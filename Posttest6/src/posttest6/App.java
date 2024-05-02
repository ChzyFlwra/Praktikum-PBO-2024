package posttest6;

import java.util.Scanner;

public class App {
    
    static Scanner scanner = new Scanner(System.in);
    static crud obj = new crud();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n");
            System.out.println("+====== Germa 66 Weapon ======+");
            System.out.println("| 1. Tambah Senjata           |");
            System.out.println("| 2. Lihat Senjata            |");
            System.out.println("| 3. Edit Senjata             |");
            System.out.println("| 4. Hapus Senjata            |");
            System.out.println("| 0. Keluar                   |");
            System.out.println("+=============================+");
            System.out.print("| Masukkan Pilihan: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    obj.tambahSenjata();
                    break;
                case 2:
                    obj.lihatSenjata();
                    break;
                case 3:
                    obj.editSenjata();
                    break;
                case 4:
                    obj.hapusSenjata();
                    break;
                case 0:
                    System.out.println("Sampai jumpa!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}

