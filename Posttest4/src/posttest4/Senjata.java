package posttest4;

public class Senjata {
    private String nama;

    public Senjata(String nama){
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilSenjata(){
        System.out.println("Nama Senjata : " + nama);  
    }

    // overloading 
    public void tampilSenjata(String nama, String jenis){
        tampilSenjata();
        System.out.println("Jenis Senjata : " + jenis);  
    }

}
