/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST1;

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


