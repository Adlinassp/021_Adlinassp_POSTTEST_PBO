package POSTTEST4;

public class Sarjana extends Wisuda{
    String jenjang_sarjana,judul_TA;

    public Sarjana(String nama, int nim, String jk, String prodi, String fakultas, double IPK, int lama_studi, int tahun_tamat, String jenjang_sarjana, String judul_TA) {
        super(nama, nim, jk, prodi, fakultas, IPK, lama_studi, tahun_tamat);
        this.jenjang_sarjana = jenjang_sarjana;
        this.judul_TA = judul_TA;
    }

    public String getJenjang_sarjana() {
        return jenjang_sarjana;
    }

    public void setJenjang_sarjana(String jenjang_sarjana) {
        this.jenjang_sarjana = jenjang_sarjana;
    }

    public String getJudul_TA() {
        return judul_TA;
    }

    public void setJudul_TA(String judul_TA) {
        this.judul_TA = judul_TA;
    }

    @Override
    public void tambahdata(){
        System.out.println("Nama " + this.nama.toUpperCase());
        System.out.println("NIM  " + this.nim);
        System.out.println("Dengan Jenjang Sarjana : " + this.jenjang_sarjana.toUpperCase());
        System.out.println("Judul Tugas Akhir : " + this.judul_TA.toUpperCase());
    }
    @Override
    public void editdata(){
        System.out.println("Nama " + this.nama.toUpperCase());
        System.out.println("NIM  " + this.nim);
        System.out.println("Dengan Jenjang Sarjana : " + this.jenjang_sarjana.toUpperCase());
        System.out.println("Judul Tugas Akhir : " + this.judul_TA.toUpperCase());
    }

    
        
}
