package POSTTEST2;

public class Wisudawan {
    String nama,jk,fakultas,prodi,judul;
    int nim,lama_studi,tahun_tamat;
    double IPK;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Wisudawan(String nama, int nim, String jk, String prodi, String fakultas, double IPK, String judul, int lama_studi, int tahun_tamat){
        this.nama = nama;
        this.nim = nim;
        this.jk = jk;
        this.prodi = prodi;   
        this.fakultas = fakultas;        
        this.IPK = IPK;
        this.judul = judul;
        this.lama_studi = lama_studi;
        this.tahun_tamat = tahun_tamat;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getLama_studi() {
        return lama_studi;
    }

    public void setLama_studi(int lama_studi) {
        this.lama_studi = lama_studi;
    }

    public int getTahun_tamat() {
        return tahun_tamat;
    }

    public void setTahun_tamat(int tahun_tamat) {
        this.tahun_tamat = tahun_tamat;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    // method
    public void tambahdata(){
        System.out.println("DATA CALON WISUDAWAN");
        System.out.println("Nama " + this.nama.toUpperCase());
        System.out.println("NIM  " + this.nim);
        System.out.println("BERHASIL DITAMBAHKAN!!");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("                                       ");
    }
    
    public void editdata(){
        System.out.println("DATA CALON WISUDAWAN");
        System.out.println("Nama        :" + this.nama.toUpperCase());
        System.out.println("NIM         :" + this.nim);
        System.out.println("P/L         :" + this.jk.toUpperCase());
        System.out.println("PRODI       :" + this.prodi.toUpperCase());
        System.out.println("FAKULTAS    :" + this.fakultas.toUpperCase());
        System.out.println("IPK         :" + this.IPK);
        System.out.println("JUDUL       :" + this.judul.toUpperCase());
        System.out.println("LAMA_STUDI  :" + this.lama_studi);
        System.out.println("TAHUN_TAMAT :" + this.tahun_tamat);
        System.out.println("BERHASIL DIUPDATE!!");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("                                       ");
    }
    public void hapusdata(){
        System.out.println("Data Calon Wisudawan dengan");
        System.out.println("Nama " + this.nama.toUpperCase());
        System.out.println("NIM  " + this.nim);
        System.out.println("BERHASIL DIHAPUS...");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("                                       ");
    }
}
