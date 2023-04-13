package POSTTEST6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Admin extends User implements WaktuWsd{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Waktu> waktu = new ArrayList<Waktu>();
    
    private String nama;
    private String Username;
    private String password;

    public Admin(String nama, String Username, String password, String pengguna) {
        super(pengguna);
        this.nama = nama;
        this.Username = Username;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    
    @Override
     public void Menu() throws IOException {
        Admin admin = new Admin ("Adlina Safa Sephia Putri","admin", "admin","Admin");
        while (true) {
            System.out.println("+++ ADMIN MENU +++");
            System.out.println("1. Create Gelombang Wisuda");
            System.out.println("2. Read Gelombang Wisuda");
            System.out.println("3. Update Gelombang Wisuda");
            System.out.println("4. Delete Gelombang Wisuda");
            System.out.println("5. Menu Utama");
            System.out.println("6. Exit");
            System.out.print("Masukan Pilihan :");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1 -> addWaktuWsd();
                case 2 -> tampilkanWaktuWsd();
                case 3 -> updateWaktuWsd();
                case 4 -> deleteWaktuWsd();
                                    case 5 -> {
                        Main.ntf.user();
                        int pilihanUser = Integer.parseInt(br.readLine());
                        switch (pilihanUser) {
                            case 1 -> {
                                System.out.println("Masukkan Username : ");
                                String username = br.readLine();
                                System.out.println("Masukkan Password : ");
                                String password = br.readLine();
                                if( username.equals(admin.getUsername()) &&
                                        password.equals(admin.getPassword())
                                        ){
                                    System.out.println("Selamat datang Admin " + admin.getNama());
                                    admin.Menu();

                                }else {
                                    System.out.println("Coba Lagi");
                                        }
                                    }         
                                    case 2 -> {
                                        Mahasiswa.Menu();
                                    }
                                }
                                }
                case 6 -> System.exit(0);
                default -> System.out.println("Pilihan tidak ada");
            }
        }
    }

    @Override
    public void addWaktuWsd() throws IOException {
        System.out.println("Masukan Gelombang Wisuda : ");
        String gelombangWisuda = br.readLine();
        System.out.println("Masukan Tanggal Wisuda : ");
        String tglWisuda = br.readLine();
        System.out.println("Masukan Bulan Wisuda : ");
        String blnWisuda = br.readLine();
        System.out.println("Masukan Tahun Wisuda : ");
        String thnWisuda = br.readLine();

        Waktu addWaktu = new Waktu(gelombangWisuda, tglWisuda, blnWisuda, thnWisuda);
        waktu.add(addWaktu);
    }
    
    @Override
    public void tampilkanWaktuWsd() throws IOException {
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("-                  Gelombang Wisuda                     -");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        for (int i = 0; i < waktu.size(); i++) {
            System.out.println("Gelombang Wisuda : " + waktu.get(i).getGelombang());
            System.out.println("Tanggal Wisuda : " + waktu.get(i).getTanggal());
            System.out.println("Bulan Wisuda : " + waktu.get(i).getBulan());
            System.out.println("Tahun Wisuda : " + waktu.get(i).getTahun());
        }
    }
    @Override
    public void updateWaktuWsd() throws IOException {
        System.out.println("Masukan Indeks Waktu Gelombang Wisuda :");
        int index = Integer.parseInt(br.readLine());
        System.out.print("Ingin Mengupah apa ? ");
        System.out.print("\n[1]Gelombang Wisuda\n[2]tanggal Wisuda\n[3]Bulan Wisuda\n[4]Tahun Wisuda\n=");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        switch (pilihan) {
            case 1 -> {
                System.out.print("Gelombang Wisuda : ");
                String setGELOMBANG = br.readLine();
                waktu.get(index-1).setGelombang(setGELOMBANG);
        }   case 2 -> {
                System.out.print("Tanggal Wisuda : ");
                String setTANGGAL = br.readLine();
                waktu.get(index-1).setTanggal(setTANGGAL);
        }   case 3 -> {
                System.out.print("Bulan Wisuda : ");
                String setBULAN = br.readLine();
                waktu.get(index-1).setBulan(setBULAN);
        }
        case 4 -> {
                System.out.print("Tahun Wisuda : ");
                String setTAHUN = br.readLine();
                waktu.get(index-1).setTahun(setTAHUN);
        }default -> System.out.println("Pilihan Tidak Tersedia");
        
        }
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("              --!!!!BERHASIL DIUPDATE!!!!--              ");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("                                       ");
    }
    @Override
    public void deleteWaktuWsd() throws IOException {
        System.out.print("Masukan Indeks Waktu Gelombang Wisuda :");
        int index = Integer.parseInt(br.readLine());
        waktu.remove(index-1);
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("              --!!!!BERHASIL DIHAPUS!!!!--               ");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("                                       ");
    }
    
    
}
