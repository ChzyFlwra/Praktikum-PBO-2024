package posttest3;

public class WarnaSenjata extends Senjata{
    private String warna;

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public WarnaSenjata(String nama, String warna){
        super(nama);
        this.warna = warna;
    }

}
