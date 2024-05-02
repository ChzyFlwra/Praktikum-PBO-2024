package posttest6;

public class Warna extends Jenis {
    private String warna;

    public Warna(String nama, String jenis, String warna) {
        super(nama, jenis); 
        this.warna = warna;
    }

    public String getWarna() {
        return this.warna;
    }

     public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void tampilData() {
        System.out.println("Warna Senjata   : " + warna);
    }
}
