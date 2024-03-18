import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Class pengguna
class Pengguna {

    private String username;
    private String password;
    private int umur;

    // Constructor
    public Pengguna(String username, String password, int umur) {
        this.username = username;
        this.password = password;
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Getter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

// Class utama
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Pengguna> database = new HashMap<>();

        boolean berhenti = false;
        while (!berhenti) {
            System.out.println("\nSistem Login dan Registrasi Genshin Impact");
            System.out.println("Menu:");
            System.out.println("1. Registrasi");
            System.out.println("2. Login");
            System.out.println("3. Lihat ");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    registrasi(database, scanner);
                    break;
                case 2:
                    login(database, scanner);
                    break;
                case 3:
                    lihatData(database);
                    break;
                case 4:
                    berhenti = true;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }

    public static void registrasi(
            Map<String, Pengguna> database,
            Scanner scanner) {
        System.out.println("Registrasi:");
        System.out.print("Username: ");
        String usernameInput = scanner.next();
        System.out.print("Password: ");
        String passwordInput = scanner.next();
        System.out.print("Umur: ");
        int umurInput = scanner.nextInt();
        Pengguna pengguna = new Pengguna(usernameInput, passwordInput, umurInput);
        database.put(usernameInput, pengguna);
        System.out.println("Registrasi berhasil.");
    }

    public static void login(Map<String, Pengguna> database, Scanner scanner) {
        System.out.println("Login:");
        System.out.print("Username: ");
        String usernameInput = scanner.next();
        System.out.print("Password: ");
        String passwordInput = scanner.next();
        if (database.containsKey(usernameInput)) {
            Pengguna pengguna = database.get(usernameInput);
            if (pengguna.getPassword().equals(passwordInput)) {
                System.out.println(
                        "Login berhasil. Selamat datang, " + pengguna.getUsername() + "!");
            } else {
                System.out.println("Password salah.");
            }
        } else {
            System.out.println("Username tidak terdaftar.");
        }
    }

    public static void lihatData(Map<String, Pengguna> database) {
        System.out.println("Data Pengguna:");
        for (Map.Entry<String, Pengguna> entry : database.entrySet()) {
            System.out.println("Username: " + entry.getKey());
        }
    }
}