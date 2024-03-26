package posttest3;

public class Jenis extends Senjata {
    private String jenis;

	public String getJenis() {
		return this.jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

    public Jenis(String nama, String jenis){
        super(nama);
        this.jenis = jenis;
    }
}
