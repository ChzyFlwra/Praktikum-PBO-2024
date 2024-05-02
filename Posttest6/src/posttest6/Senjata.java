package posttest6;

abstract class Senjata {

    public final String kategori = "Senjata";
    public String nama;
   
    public Senjata(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public abstract void tampilData();

    public void nama(){
        System.out.println("\n");
        System.out.println("Nama Senjata    : " + nama);
    }

}
