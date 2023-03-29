package POSTTEST4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     static ArrayList<Vokasi> vokasi = new ArrayList<Vokasi>();
     static ArrayList<Sarjana> sarjana = new ArrayList<Sarjana>();
     static ArrayList<Profesi> profesi = new ArrayList<Profesi>();
     static Notif ntf = new Notif();
     
     public static void main(String[] args) throws IOException {
           while (true) {
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println("-                Pendataan Calon Wisudawan              -");
                System.out.println("---------------------------------------------------------");
                System.out.println("-                       Reminder                        -");
                System.out.println("-         Pendataan ini hanya bisa diisi oleh Admin!    -");
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
                           tambahWsd();
                           break;
    //                read
                       case 2:
                           bacaWsd();
                           break;
    //                update
                       case 3:
                           editWsd();
                           break;
    //                delete
                       case 4:
                           hapusWsd();
                           break;
                       case 5:
                           System.exit(0);
                       default:
                           System.out.println("Pilihan Tidak Tersedia");
                           break;
               }
        }

      }
     
      public static void tambahWsd() throws IOException{
        System.out.println("                                       ");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("-              Tambah Data Calon Wisudawan              -");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("1. Vokasi");
        System.out.println("2. Sarjana");
        System.out.println("3. Profesi");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1 -> {
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
                    System.out.print("Lama Studi Mahasiswa        : ");
                    int addlama_studi = Integer.parseInt(br.readLine());
                    System.out.print("Tahun Tamat Mahasiswa       : ");
                    int addtahun_tamat = Integer.parseInt(br.readLine());
                    System.out.print("Jenjang Vokasi              : ");
                    String addjenjang_vokasi= br.readLine();
                    System.out.print("Judul Laporan               : ");
                    String addjudul_laporan = br.readLine();
                    
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    Vokasi wsdVokasi = new Vokasi(addnama, addnim, addjk,
                            addprodi, addfakultas, addIPK, addlama_studi,
                            addtahun_tamat, addjenjang_vokasi,
                            addjudul_laporan); 
                    vokasi.add(wsdVokasi);
                    ntf.notif("Vokasi");
                    wsdVokasi.tambahdata();
                    ntf.notif(1);
                }
                case 2 -> {
                    System.out.print("Nama Panjang Mahasiswa      : ");
                    String addnama1 = br.readLine();
                    System.out.print("NIM Mahasiswa               : ");
                    int addnim1 = Integer.parseInt(br.readLine());
                    System.out.print("Jenis Kelamin Mahasiswa(P/L): ");
                    String addjk1 = br.readLine();
                    System.out.print("Program Studi Mahasiswa     : ");
                    String addprodi1 = br.readLine();
                    System.out.print("Fakultas Mahasiswa          : ");
                    String addfakultas1 = br.readLine();
                    System.out.print("Input IPK Mahasiswa         : ");
                    double addIPK1 = Double.parseDouble(br.readLine());
                    System.out.print("Lama Studi Mahasiswa        : ");
                    int addlama_studi1 = Integer.parseInt(br.readLine());
                    System.out.print("Tahun Tamat Mahasiswa       : ");
                    int addtahun_tamat1 = Integer.parseInt(br.readLine());
                    System.out.print("Jenjang Sarjana             : ");
                    String addjenjang_sarjana = br.readLine();
                    System.out.print("Judul Tugas Akhir           : ");
                    String addjudul_TA = br.readLine();
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

                    Sarjana wsdSarjana = new Sarjana(addnama1, addnim1, addjk1,  addprodi1, 
                            addfakultas1, addIPK1, addlama_studi1, addtahun_tamat1, 
                            addjenjang_sarjana, addjudul_TA); 
                    sarjana.add(wsdSarjana);
                    ntf.notif("Sarjana");
                    wsdSarjana.tambahdata(); 
                    ntf.notif(1);
                }
                case 3 -> {
                    System.out.print("Nama Panjang Mahasiswa      : ");
                    String addnama2 = br.readLine();
                    System.out.print("NIM Mahasiswa               : ");
                    int addnim2 = Integer.parseInt(br.readLine());
                    System.out.print("Jenis Kelamin Mahasiswa(P/L): ");
                    String addjk2 = br.readLine();
                    System.out.print("Program Studi Mahasiswa     : ");
                    String addprodi2 = br.readLine();
                    System.out.print("Fakultas Mahasiswa          : ");
                    String addfakultas2 = br.readLine();
                    System.out.print("Input IPK Mahasiswa         : ");
                    double addIPK2 = Double.parseDouble(br.readLine());
                    System.out.print("Lama Studi Mahasiswa        : ");
                    int addlama_studi2 = Integer.parseInt(br.readLine());
                    System.out.print("Tahun Tamat Mahasiswa       : ");
                    int addtahun_tamat2 = Integer.parseInt(br.readLine());
                    System.out.print("Program Profesi             : ");
                    String addprogram_profesi= br.readLine();
                    
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    Profesi wsdProfesi = new Profesi(addnama2, addnim2, addjk2,
                            addprodi2, addfakultas2, addIPK2, addlama_studi2,
                            addtahun_tamat2, addprogram_profesi); 
                    profesi.add(wsdProfesi);
                    ntf.notif("Profesi");
                    wsdProfesi.tambahdata();
                    ntf.notif(1);
                }
                default -> System.out.println("Pilihan Tidak Tersedia");           
            }
        
    }

    public static void bacaWsd() throws IOException{
        System.out.println("-Laporan Data Wisuda-");
        System.out.println("1. Vokasi");
        System.out.println("2. Sarjana");
        System.out.println("3. Profesi");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1 -> {
                    if (vokasi.isEmpty()){
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println("-                 Data Wisuda Kosong                    -");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println(" ");
                    } else {
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println("-                     Data Wisuda                       -");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        for (int i = 0; i < vokasi.size(); i++) {
                            System.out.println("Mahasiswa ke-" + (i+1));
                            System.out.println("Nama Mahasiswa: " + vokasi.get(i).getNama().toUpperCase());
                            System.out.println("NIM Mahasiswa : " + vokasi.get(i).getNim());
                            System.out.println("Jenis Kelamin : " + vokasi.get(i).getJk().toUpperCase());
                            System.out.println("Program Studi : " + vokasi.get(i).getProdi().toUpperCase());
                            System.out.println("Fakultas      : " + vokasi.get(i).getFakultas().toUpperCase());
                            System.out.println("IPK Mahasiswa : " + vokasi.get(i).getIPK());            
                            System.out.println("Lama Studi    : " + vokasi.get(i).getLama_studi());
                            System.out.println("Tahun tamat   : " + vokasi.get(i).getTahun_tamat());
                            System.out.println("Jenjang Vokasi: " + vokasi.get(i).getJenjang_vokasi().toUpperCase());
                            System.out.println("Judul Laporan : " + vokasi.get(i).getJudul_laporan().toUpperCase());
                            

                            System.out.print("\n");
                        }
                    }                        
                } 
                case 2 -> {
                    if (sarjana.isEmpty()){
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println("-                 Data Wisuda Kosong                    -");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println(" ");
                    } else {
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println("-                     Data Wisuda                       -");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        for (int i = 0; i < sarjana.size(); i++) {
                            System.out.println("Mahasiswa ke-" + (i+1));
                            System.out.println("Nama Mahasiswa   : " + sarjana.get(i).getNama().toUpperCase());
                            System.out.println("NIM Mahasiswa    : " + sarjana.get(i).getNim());
                            System.out.println("Jenis Kelamin    : " + sarjana.get(i).getJk().toUpperCase());
                            System.out.println("Program Studi    : " + sarjana.get(i).getProdi().toUpperCase());
                            System.out.println("Fakultas         : " + sarjana.get(i).getFakultas().toUpperCase());
                            System.out.println("IPK Mahasiswa    : " + sarjana.get(i).getIPK());            
                            System.out.println("Lama Studi       : " + sarjana.get(i).getLama_studi());
                            System.out.println("Tahun tamat      : " + sarjana.get(i).getTahun_tamat());
                            System.out.println("Jenjang Sarjana  : " + sarjana.get(i).getJenjang_sarjana().toUpperCase());
                            System.out.println("Judul Tugas Akhir: " + sarjana.get(i).getJudul_TA().toUpperCase());
                            

                            System.out.print("\n");
                        }                     
                    }
                }
                case 3 ->{
                    if (profesi.isEmpty()){
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println("-                 Data Wisuda Kosong                    -");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println(" ");
                    } else {
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        System.out.println("-                     Data Wisuda                       -");
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                        for (int i = 0; i < profesi.size(); i++) {
                            System.out.println("Mahasiswa ke-" + (i+1));
                            System.out.println("Nama Mahasiswa   : " + profesi.get(i).getNama().toUpperCase());
                            System.out.println("NIM Mahasiswa    : " + profesi.get(i).getNim());
                            System.out.println("Jenis Kelamin    : " + profesi.get(i).getJk().toUpperCase());
                            System.out.println("Program Studi    : " + profesi.get(i).getProdi().toUpperCase());
                            System.out.println("Fakultas         : " + profesi.get(i).getFakultas().toUpperCase());
                            System.out.println("IPK Mahasiswa    : " + profesi.get(i).getIPK());            
                            System.out.println("Lama Studi       : " + profesi.get(i).getLama_studi());
                            System.out.println("Tahun tamat      : " + profesi.get(i).getTahun_tamat());
                            System.out.println("Program Profesi  : " + profesi.get(i).getProgram_profesi().toUpperCase());
                            

                            System.out.print("\n");
                        }
                    }
                }
                default -> System.out.println("Pilihan Tidak Tersedia");
            }
    }
    
    public static void editWsd() throws IOException{
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("-                  Update Data Wisudawan                -");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");     
        System.out.println("1. Vokasi");
        System.out.println("2. Sarjana");
        System.out.println("3. Profesi");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukan Data Mahasiswa ke-");
                    int index = Integer.parseInt(br.readLine());
                            System.out.print("Ingin Mengupah apa ? ");
                            System.out.print("\n[1]Nama Mahasiswa\n[2]NIM Mahasiswa\n[3]Jenis Kelamin\n[4]Program Studi\n[5]Fakultas\n[6]IPK\n[7]Lama Studi\n[8]Tahun Tamat\n[9]Jenjang Vokasi\n[10]Judul Laporan\n=");
                            int pilihan1 = Integer.parseInt(br.readLine());
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

                                switch (pilihan1) {
                                           case 1 -> {
                                               System.out.print("Nama Panjang Mahasiswa : ");
                                               String setNAMA = br.readLine();
                                               vokasi.get(index-1).setNama(setNAMA);
                                           }
                                           case 2 -> {
                                               System.out.print("NIM Mahasiswa : ");
                                               int setNIM = Integer.parseInt(br.readLine());
                                               vokasi.get(index-1).setNim(setNIM) ;
                                           }
                                           case 3 -> {
                                               System.out.print("Jenis Kelamin Mahasiswa(P/L): ");
                                               String setJK = br.readLine(); 
                                               vokasi.get(index-1).setJk(setJK);
                                           }
                                           case 4 -> {
                                               System.out.print("Program Studi Mahasiswa : ");
                                               String setPRODI = br.readLine();
                                               vokasi.get(index-1).setProdi(setPRODI);
                                           }
                                           case 5 -> {
                                               System.out.print("Fakultas Mahasiswa : ");
                                               String setFAKULTAS = br.readLine();
                                               vokasi.get(index-1).setFakultas(setFAKULTAS);
                                           }
                                           case 6 -> {
                                               System.out.print("IPK Mahasiswa : ");
                                               double setIPK = Double.parseDouble(br.readLine());
                                               vokasi.get(index-1).setIPK(setIPK);
                                           }
                                           case 7 -> {
                                               System.out.print("Lama Studi Mahasiswa : ");
                                               int setLAMA_STUDI = Integer.parseInt(br.readLine());
                                               vokasi.get(index-1).setLama_studi(setLAMA_STUDI);
                                            }
                                           case 8 -> {
                                               System.out.print("Tahun Tamat Mahasiswa : ");
                                               int setTAHUN_TAMAT = Integer.parseInt(br.readLine());
                                               vokasi.get(index-1).setTahun_tamat(setTAHUN_TAMAT);
                                            }
                                            case 9 -> {
                                               System.out.print("Jenjang Vokasi : ");
                                               String setJENJANG_VOKASI = br.readLine();
                                               vokasi.get(index-1).setJenjang_vokasi(setJENJANG_VOKASI);
                                             }
                                            case 10 -> {
                                               System.out.print("Judul Laporan  : ");
                                               String setJUDUL_LAPORAN = br.readLine();
                                               vokasi.get(index-1).setJudul_laporan(setJUDUL_LAPORAN);
                                            }
                                           default -> System.out.println("Pilihan Tidak Tersedia");
                                }                           
                                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                                //pemanggilan method editdata
                                ntf.notif("Vokasi");
                                vokasi.get(index-1).editdata();
                                ntf.notif(3);
                }
                case 2 ->{
                    System.out.print("Masukan Data Mahasiswa ke-");
                    int index = Integer.parseInt(br.readLine());
                            System.out.print("Ingin Mengupah apa ? ");
                            System.out.print("\n[1]Nama Mahasiswa\n[2]NIM Mahasiswa\n[3]Jenis Kelamin\n[4]Program Studi\n[5]Fakultas\n[6]IPK\n[7]Lama Studi\n[8]Tahun Tamat\n[9]Jenjang Sarjana\n[10]Judul Tugas Akhir\n=");
                            int pilihan1 = Integer.parseInt(br.readLine());
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

                                switch (pilihan1) {
                                           case 1 -> {
                                               System.out.print("Nama Panjang Mahasiswa : ");
                                               String setNAMA = br.readLine();
                                               sarjana.get(index-1).setNama(setNAMA);
                                           }
                                           case 2 -> {
                                               System.out.print("NIM Mahasiswa : ");
                                               int setNIM = Integer.parseInt(br.readLine());
                                               sarjana.get(index-1).setNim(setNIM) ;
                                           }
                                           case 3 -> {
                                               System.out.print("Jenis Kelamin Mahasiswa(P/L): ");
                                               String setJK = br.readLine(); 
                                               sarjana.get(index-1).setJk(setJK);
                                           }
                                           case 4 -> {
                                               System.out.print("Program Studi Mahasiswa : ");
                                               String setPRODI = br.readLine();
                                               sarjana.get(index-1).setProdi(setPRODI);
                                           }
                                           case 5 -> {
                                               System.out.print("Fakultas Mahasiswa : ");
                                               String setFAKULTAS = br.readLine();
                                               sarjana.get(index-1).setFakultas(setFAKULTAS);
                                           }
                                           case 6 -> {
                                               System.out.print("IPK Mahasiswa : ");
                                               double setIPK = Double.parseDouble(br.readLine());
                                               sarjana.get(index-1).setIPK(setIPK);
                                           }
                                           case 7 -> {
                                               System.out.print("Lama Studi Mahasiswa : ");
                                               int setLAMA_STUDI = Integer.parseInt(br.readLine());
                                               sarjana.get(index-1).setLama_studi(setLAMA_STUDI);
                                            }
                                           case 8 -> {
                                               System.out.print("Tahun Tamat Mahasiswa : ");
                                               int setTAHUN_TAMAT = Integer.parseInt(br.readLine());
                                               vokasi.get(index-1).setTahun_tamat(setTAHUN_TAMAT);
                                            }
                                            case 9 -> {
                                               System.out.print("Jenjang Vokasi : ");
                                               String setJENJANG_SARJANA = br.readLine();
                                               sarjana.get(index-1).setJenjang_sarjana(setJENJANG_SARJANA);
                                             }
                                            case 10 -> {
                                               System.out.print("Judul Laporan  : ");
                                               String setJUDUL_TA = br.readLine();
                                               sarjana.get(index-1).setJudul_TA(setJUDUL_TA);
                                            }
                                           default -> System.out.println("Pilihan Tidak Tersedia");
                                }                           
                                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                                //pemanggilan method editdata
                                ntf.notif("Sarjana");
                                sarjana.get(index-1).editdata();
                                ntf.notif(3);
                }
                case 3 -> {
                    System.out.print("Masukan Data Mahasiswa ke-");
                    int index = Integer.parseInt(br.readLine());
                            System.out.print("Ingin Mengupah apa ? ");
                            System.out.print("\n[1]Nama Mahasiswa\n[2]NIM Mahasiswa\n[3]Jenis Kelamin\n[4]Program Studi\n[5]Fakultas\n[6]IPK\n[7]Lama Studi\n[8]Tahun Tamat\n[9]Program Profesi\n=");
                            int pilihan2 = Integer.parseInt(br.readLine());
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

                                switch (pilihan2) {
                                           case 1 -> {
                                               System.out.print("Nama Panjang Mahasiswa : ");
                                               String setNAMA = br.readLine();
                                               profesi.get(index-1).setNama(setNAMA);
                                           }
                                           case 2 -> {
                                               System.out.print("NIM Mahasiswa : ");
                                               int setNIM = Integer.parseInt(br.readLine());
                                               profesi.get(index-1).setNim(setNIM) ;
                                           }
                                           case 3 -> {
                                               System.out.print("Jenis Kelamin Mahasiswa(P/L): ");
                                               String setJK = br.readLine(); 
                                               profesi.get(index-1).setJk(setJK);
                                           }
                                           case 4 -> {
                                               System.out.print("Program Studi Mahasiswa : ");
                                               String setPRODI = br.readLine();
                                               profesi.get(index-1).setProdi(setPRODI);
                                           }
                                           case 5 -> {
                                               System.out.print("Fakultas Mahasiswa : ");
                                               String setFAKULTAS = br.readLine();
                                               profesi.get(index-1).setFakultas(setFAKULTAS);
                                           }
                                           case 6 -> {
                                               System.out.print("IPK Mahasiswa : ");
                                               double setIPK = Double.parseDouble(br.readLine());
                                               profesi.get(index-1).setIPK(setIPK);
                                           }
                                           case 7 -> {
                                               System.out.print("Lama Studi Mahasiswa : ");
                                               int setLAMA_STUDI = Integer.parseInt(br.readLine());
                                               profesi.get(index-1).setLama_studi(setLAMA_STUDI);
                                            }
                                           case 8 -> {
                                               System.out.print("Tahun Tamat Mahasiswa : ");
                                               int setTAHUN_TAMAT = Integer.parseInt(br.readLine());
                                               profesi.get(index-1).setTahun_tamat(setTAHUN_TAMAT);
                                            }
                                            case 9 -> {
                                               System.out.print("Jenjang Vokasi : ");
                                               String setPROGRAM_PROFESI = br.readLine();
                                               profesi.get(index-1).setProgram_profesi(setPROGRAM_PROFESI);
                                             }
                                           default -> System.out.println("Pilihan Tidak Tersedia");
                                }                           
                                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                                //pemanggilan method editdata
                                ntf.notif("Profesi");
                                profesi.get(index-1).editdata();
                                ntf.notif(3);
                }
                default -> System.out.println("Pilihan Tidak Tersedia");
            }
    }

    public static void hapusWsd() throws IOException{
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("-                 Hapus Data Wisudawan                  -");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("1. Vokasi");
        System.out.println("2. Sarjana");
        System.out.println("3. Profesi");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukan Data Mahasiswa ke-");
                    int index = Integer.parseInt(br.readLine());
                    ntf.notif("Vokasi");
                    vokasi.remove(index-1).hapusdata();
                    ntf.notif(4);
                }
                case 2 -> {
                    System.out.print("Masukan Data Mahasiswa ke-");
                    int index = Integer.parseInt(br.readLine());
                    ntf.notif("Sarjana");
                    sarjana.remove(index-1).hapusdata();
                    ntf.notif(4);
                }   
                case 3 -> {
                    System.out.print("Masukan Data Mahasiswa ke-");
                    int index = Integer.parseInt(br.readLine());
                    ntf.notif("Profesi");
                    profesi.remove(index-1).hapusdata();
                    ntf.notif(4);
                }
                default -> System.out.println("Pilihan Tidak Tersedia"); 
            }

    }

    
}
