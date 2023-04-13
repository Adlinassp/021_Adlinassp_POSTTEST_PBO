package POSTTEST6;


public abstract class Wisuda {
    String nama,jk,fakultas,prodi;
    int nim,lama_studi,tahun_tamat;
    double IPK;
    //Keyword final variable
    public final String univ = "Universitas Mulawarman";
    
    // constructor
    public Wisuda(String nama, int nim, String jk, String univ, String prodi, String fakultas, double IPK, int lama_studi, int tahun_tamat){
        this.nama = nama;
        this.nim = nim;
        this.jk = jk;
        this.prodi = prodi;   
        this.fakultas = fakultas;        
        this.IPK = IPK;
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
    
    public String getUniv() {
        return univ;
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
    public abstract void tambahdata();
    public abstract void tampildata();
    public abstract void editdata();
  
    public void hapusdata(){
        System.out.println("Nama " + this.nama.toUpperCase());
        System.out.println("NIM  " + this.nim);
    }  
}

//Keyword Final Class
final class Notif{
    //Keyword Final Method
    public final void header(){
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("-                      Selamat Datang                     -");
            System.out.println("-                Pendataan Calon Wisudawan                -");
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

    }
    
    
    public void user(){
        System.out.println("Anda Masuk Sebagai : ");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.println("4. Exit");
        System.out.println("Masukkan Pilihan : ");
    }

    //method notifikasi
    //overloading
    //Keyword Final Method
    public final void notif(String Tingkat){
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("Data Calon Wisuda "+ Tingkat +" dengan");
    }
    
    //overloading
    //Keyword Final Method
    public final void notif(int pilihan){
        switch (pilihan) {
            case 1 -> {
                System.out.println("--!!!!BERHASIL DITAMBAHKAN!!!!--");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println("                                       ");
            }
            case 3 -> {
                System.out.println("--!!!!BERHASIL DIUPDATE!!!!--");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println("                                       ");
            }
            case 4 -> {            
                System.out.println("--!!!!BERHASIL DIHAPUS!!!!--");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println("                                       ");
            }
            default -> {
            }
        }
    }
}