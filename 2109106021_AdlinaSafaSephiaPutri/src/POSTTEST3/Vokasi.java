package POSTTEST3;

public class Vokasi extends Wisuda{

    String jenjang_vokasi,judul_laporan;

    public Vokasi(String nama, int nim, String jk, String prodi, String fakultas, double IPK, int lama_studi, int tahun_tamat, String jenjang_vokasi, String judul_laporan) {
        super(nama, nim, jk, prodi, fakultas, IPK, lama_studi, tahun_tamat);
        this.jenjang_vokasi = jenjang_vokasi;
        this.judul_laporan = judul_laporan;
    }

    public String getJenjang_vokasi() {
        return jenjang_vokasi;
    }

    public void setJenjang_vokasi(String jenjang_vokasi) {
        this.jenjang_vokasi = jenjang_vokasi;
    }

    public String getJudul_laporan() {
        return judul_laporan;
    }

    public void setJudul_laporan(String judul_laporan) {
        this.judul_laporan = judul_laporan;
    }


}
