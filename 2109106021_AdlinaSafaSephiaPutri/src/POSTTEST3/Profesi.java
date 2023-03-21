package POSTTEST3;

public class Profesi extends Wisuda{
    String program_profesi;

    public Profesi(String nama, int nim, String jk, String prodi, String fakultas, double IPK, int lama_studi, int tahun_tamat, String program_profesi) {
        super(nama, nim, jk, prodi, fakultas, IPK, lama_studi, tahun_tamat);
        this.program_profesi = program_profesi;
    }

    public String getProgram_profesi() {
        return program_profesi;
    }

    public void setProgram_profesi(String program_profesi) {
        this.program_profesi = program_profesi;
    }
    
}
