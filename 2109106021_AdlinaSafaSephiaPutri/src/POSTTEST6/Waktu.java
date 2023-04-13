package POSTTEST6;

public class Waktu {
    protected String Gelombang;
    protected String Tanggal;
    protected String Bulan;
    protected String Tahun;

    public Waktu(String Gelombang, String Tanggal, String Bulan, String Tahun) {
        this.Gelombang = Gelombang;
        this.Tanggal = Tanggal;
        this.Bulan = Bulan;
        this.Tahun = Tahun;
    }

    public String getGelombang() {
        return Gelombang;
    }

    public void setGelombang(String Gelombang) {
        this.Gelombang = Gelombang;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }

    public String getBulan() {
        return Bulan;
    }

    public void setBulan(String Bulan) {
        this.Bulan = Bulan;
    }

    public String getTahun() {
        return Tahun;
    }

    public void setTahun(String Tahun) {
        this.Tahun = Tahun;
    }
    
    public void bacaWaktu(){ 
        
        System.out.println("Gelombang Wisuda : "+this.Gelombang);
        System.out.println("Tanggal Wisuda   : "+this.Tanggal ) ;
        System.out.println("Bulan Wisuda     : "+this.Bulan );
        System.out.println("Tahun Wisuda     : "+this.Tahun  );
        

    
    }
}
