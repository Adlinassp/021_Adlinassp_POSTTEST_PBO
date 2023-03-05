package POSTTEST1; 
import java.io.*;
import java.util.*;

public class Main {
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     static ArrayList<Wisudawan> wisudawan = new ArrayList<>();
     public static void main(String[] args) throws IOException {
           while (true) {
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println("-                Pendataan Calon Wisudawan              -");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println("1. Tambah Data Calon Wisudawan");
                System.out.println("2. Baca Data Calon wisudawan");
                System.out.println("3. Edit Data Calon Wisudawan");
                System.out.println("4. Hapus Data Calon Wisudawan");
                System.out.println("5. Exit");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.print("Masukan Pilihan Anda : ");
                int pilihan = Integer.parseInt(br.readLine());
                   switch (pilihan) {
    //                create
                       case 1:
                           tambahWsdn();
                           break;
    //                read
                       case 2:
                           bacaWsdn();
                           break;
    //                update
                       case 3:
                           editWsdn();
                           break;
    //                delete
                       case 4:
                           hapusWsdn();
                           break;
                       case 5:
                           System.exit(0);
                       default:
                           System.out.println("Pilihan Tidak Tersedia");
                           break;
               }
        }

      }
     
      public static void tambahWsdn() throws IOException{
        System.out.println("                                       ");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("-              Tambah Data Calon Wisudawan              -");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.print("Nama Panjang Mahasiswa      : ");
        String addnama = br.readLine();
        System.out.print("NIM Mahasiswa               : ");
        int addnim = Integer.parseInt(br.readLine());
        System.out.print("Jenis Kelamin Mahasiswa(P/L): ");
        String addjk = br.readLine();
        System.out.print("Program Studi Mahasiswa     : ");
        String addprodi = br.readLine();
        System.out.print("Fakultas Mahasiswa          : ");
        String addfakultas = br.readLine();
        System.out.print("Input IPK Mahasiswa         : ");
        double addIPK = Double.parseDouble(br.readLine());
        System.out.print("Judul Skripsi Mahasiswa     : ");
        String addjudul = br.readLine();
        System.out.print("Lama Studi Mahasiswa        : ");
        int addlama_studi = Integer.parseInt(br.readLine());
        System.out.print("Tahun Tamat Mahasiswa       : ");
        int addtahun_tamat = Integer.parseInt(br.readLine());
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        
        Wisudawan calonwisudawan = new Wisudawan(addnama, addnim, addjk,  addprodi, addfakultas, addIPK, addjudul, addlama_studi, addtahun_tamat); 
        wisudawan.add(calonwisudawan);
        calonwisudawan.tambahdata();
    }

    public static void bacaWsdn() throws IOException{
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("-                      Data Wisudawan                   -");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        for (int i = 0; i < wisudawan.size(); i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("Nama Mahasiswa: " + wisudawan.get(i).nama.toUpperCase());
            System.out.println("NIM Mahasiswa : " + wisudawan.get(i).nim);
            System.out.println("Jenis Kelamin : " + wisudawan.get(i).jk.toUpperCase());
            System.out.println("Program Studi : " + wisudawan.get(i).prodi.toUpperCase());
            System.out.println("Fakultas      : " + wisudawan.get(i).fakultas.toUpperCase());
            System.out.println("IPK Mahasiswa : " + wisudawan.get(i).IPK);            
            System.out.println("Judul Skripsi : " + wisudawan.get(i).judul.toUpperCase());
            System.out.println("Lama Studi    : " + wisudawan.get(i).lama_studi);
            System.out.println("Tahun tamat   : " + wisudawan.get(i).tahun_tamat);

            System.out.print("\n");
        }
    }
    
    public static void editWsdn() throws IOException{

        bacaWsdn();
        
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("-                  Update Data Wisudawan                -");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.print("Masukan Data Mahasiswa ke-");
        int index = Integer.parseInt(br.readLine());
        
        System.out.print("Ingin Mengupah apa ? ");
        System.out.print("\n[1]Nama Mahasiswa\n[2]NIM Mahasiswa\n[3]Jenis Kelamin\n[4]Program Studi\n[5]Fakultas\n[6]IPK\n[7]Judul Skripsi\n[8]Lama Studi\n[9]Tahun Tamat\n=");
        int pilihan1 = Integer.parseInt(br.readLine());
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        
        switch (pilihan1) {
                       case 1 -> {
                           System.out.print("Nama Panjang Mahasiswa : ");
                           String setNAMA = br.readLine();
                           wisudawan.get(index-1).nama = setNAMA;
             }
                       case 2 -> {
                           System.out.print("NIM Mahasiswa : ");
                           int setNIM = Integer.parseInt(br.readLine());
                           wisudawan.get(index-1).nim = setNIM;
             }
                       case 3 -> {
                           System.out.print("Jenis Kelamin Mahasiswa(P/L): ");
                           String setJK = br.readLine(); 
                           wisudawan.get(index-1).jk = setJK;
             }
                       case 4 -> {
                           System.out.print("Program Studi Mahasiswa : ");
                           String setPRODI = br.readLine();
                           wisudawan.get(index-1).prodi = setPRODI;
             }
                       case 5 -> {
                           System.out.print("Fakultas Mahasiswa : ");
                           String setFAKULTAS = br.readLine();
                           wisudawan.get(index-1).fakultas = setFAKULTAS;
             }
                       case 6 -> {
                           System.out.print("IPK Mahasiswa : ");
                           double setIPK = Double.parseDouble(br.readLine());
                           wisudawan.get(index-1).IPK = setIPK;
             }
                       case 7 -> {
                           System.out.print("Judul Skripsi Mahasiswa : ");
                           String setJUDUL = br.readLine();
                           wisudawan.get(index-1).judul = setJUDUL;
             }
                       case 8 -> {
                           System.out.print("Lama Studi Mahasiswa : ");
                           int setLAMA_STUDI = Integer.parseInt(br.readLine());
                           wisudawan.get(index-1).lama_studi = setLAMA_STUDI;
             }
                       case 9 -> {
                           System.out.print("Tahun Tamat Mahasiswa : ");
                           int setTAHUN_TAMAT = Integer.parseInt(br.readLine());
                           wisudawan.get(index-1).tahun_tamat = setTAHUN_TAMAT;
             }
                       default -> System.out.println("Pilihan Tidak Tersedia");
               }
       System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        ///pemanggilan method editdata
        wisudawan.get(index-1).editdata();
    }

    public static void hapusWsdn() throws IOException{
        bacaWsdn();
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("-                 Hapus Data Wisudawan                  -");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.print("Masukan Data Mahasiswa ke-");
        int index = Integer.parseInt(br.readLine());
        wisudawan.remove(index-1).hapusdata();
    }

    
}
