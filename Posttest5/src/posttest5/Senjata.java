package posttest5;

abstract class Senjata {
    // Final variable
    final String nama;
    String warna;

    // Constructor
    public Senjata(String nama) {
        this.nama = nama;
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }

    // Setter for nama
    public void setNama(String nama) {
        // Implement this if needed
        // This method can be abstract or concrete depending on your requirements
    }

    // Getter for warna
    public String getWarna() {
        return warna;
    }

    // Setter for warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter for jenis
    public abstract String getJenis();

    // Setter for jenis
    public abstract void setJenis(String jenis);

    // Abstract method
    abstract void tampilSenjata();

    // Final method
    final void tampilJenisSenjata(String jenis) {
        tampilSenjata();
        System.out.println("Jenis Senjata: " + jenis);
    }
}
