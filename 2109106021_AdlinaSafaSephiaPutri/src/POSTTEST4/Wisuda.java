package POSTTEST4;


public class Wisuda {
    String nama,jk,fakultas,prodi;
    int nim,lama_studi,tahun_tamat;
    double IPK;
    
    // constructor
    public Wisuda(String nama, int nim, String jk, String prodi, String fakultas, double IPK, int lama_studi, int tahun_tamat){
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
    public void tambahdata(){
        System.out.println("Nama " + this.nama.toUpperCase());
        System.out.println("NIM  " + this.nim);
    }  
    public void editdata(){
        System.out.println("Nama " + this.nama.toUpperCase());
        System.out.println("NIM  " + this.nim);
    }
    public void hapusdata(){
        System.out.println("Nama " + this.nama.toUpperCase());
        System.out.println("NIM  " + this.nim);
    }

    
    
}
class Notif{
    //method notifikasi
    //overloading
    public void notif(String Tingkat){
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("Data Calon Wisuda "+ Tingkat +" dengan");
        
 
        
}
    //overloading
    public void notif(int pilihan){
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