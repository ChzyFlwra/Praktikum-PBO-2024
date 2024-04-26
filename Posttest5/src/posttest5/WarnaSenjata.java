package posttest5;

public class WarnaSenjata extends Senjata {
    // Variabel warna
    private String warna;
    private String jenis;

    // Constructor
    public WarnaSenjata(String nama, String warna) {
        super(nama); // Call superclass constructor
        this.warna = warna;
    }

    // Getter untuk warna
    public String getWarna() {
        return this.warna;
    }

    @Override
    public String getJenis() {
        // TODO Auto-generated method stub
        return jenis;
    }

    @Override
    public void setJenis(String jenis) {
        // TODO Auto-generated method stub
    }

    // Setter untuk warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Implementasi dari abstract method tampilSenjata
    @Override
    public void tampilSenjata() {
        System.out.println("Nama Senjata : " + getNama()); // Access superclass's nama
        System.out.println("Warna Senjata: " + warna);
    }
}
