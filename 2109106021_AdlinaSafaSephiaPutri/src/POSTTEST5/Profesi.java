package POSTTEST5;

public class Profesi extends Wisuda{
    String program_profesi;

    public Profesi(String nama, int nim, String jk, String univ, String prodi, String fakultas, double IPK, int lama_studi, int tahun_tamat, String program_profesi) {
        super(nama, nim, jk, univ, prodi, fakultas, IPK, lama_studi, tahun_tamat);
        this.program_profesi = program_profesi;
    }

    public String getProgram_profesi() {
        return program_profesi;
    }

    public void setProgram_profesi(String program_profesi) {
        this.program_profesi = program_profesi;
    }
    
    @Override
        public void tambahdata(){
        System.out.println("Nama " + this.nama.toUpperCase());
        System.out.println("NIM  " + this.nim);
        System.out.println("Dengan Program Profesi : " + this.program_profesi.toUpperCase());
    }
    @Override
    public void tampildata(){
    System.out.println("Nama Mahasiswa   : " + this.nama.toUpperCase());
    System.out.println("NIM Mahasiswa    : " + this.nim);
    System.out.println("Jenis Kelamin    : " + this.jk.toUpperCase());
    System.out.println("Universitas      : " + this.univ);
    System.out.println("Program Studi    : " + this.prodi.toUpperCase());
    System.out.println("Fakultas         : " + this.fakultas.toUpperCase());
    System.out.println("IPK Mahasiswa    : " + this.IPK);            
    System.out.println("Lama Studi       : " + this.lama_studi);
    System.out.println("Tahun tamat      : " + this.tahun_tamat);
    System.out.println("Program Profesi  : " + this.program_profesi.toUpperCase());
 } 
    @Override
    public void editdata(){
        System.out.println("Nama " + this.nama.toUpperCase());
        System.out.println("NIM  " + this.nim);
        System.out.println("Dengan Program Profesi : " + this.program_profesi.toUpperCase());
    }
}
