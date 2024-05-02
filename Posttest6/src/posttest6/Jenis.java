package posttest6;

public class Jenis extends Senjata {
    private String jenis;

    public Jenis(String nama, String jenis) {
        super(nama);
        this.jenis = jenis;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void tampilData() {
        super.nama();
        System.out.println("Jenis Senjata   : " + jenis);
        
    }
}
