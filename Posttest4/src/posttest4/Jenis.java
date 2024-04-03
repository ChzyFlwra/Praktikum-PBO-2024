package posttest4;

public class Jenis extends Senjata {
    private String jenis;

	public Jenis(String nama, String jenis){
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
	public void tampilSenjata(){
		super.tampilSenjata();
		System.out.println("Jenis Senjata: " + jenis);
	}
}
