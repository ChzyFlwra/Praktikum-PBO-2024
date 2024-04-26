package posttest5;

// Kelas Jenis yang meng-extend abstract class Senjata
public class Jenis extends Senjata {
    // Variabel jenis
    private String jenis;

    // Constructor
    public Jenis(String nama, String jenis) {
        super(nama);
        this.jenis = jenis;
    }

    // Getter untuk jenis
    public String getJenis() {
        return this.jenis;
    }

    // Setter untuk jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Implementasi dari abstract method tampilSenjata
    @Override
    public void tampilSenjata() {
        System.out.println("Nama Senjata : " + jenis);
        
    }
}
