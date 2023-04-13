package POSTTEST6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static Notif ntf = new Notif();
    
    public static void main(String[] args) throws IOException {
        Admin admin = new Admin ("Adlina Safa Sephia Putri","admin", "admin","Admin");
        while(true){
            ntf.header();
            ntf.user();
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
                        break;
                        
                    }else {
                        System.out.println("Coba Lagi");
                        
                    }
                }         
                case 2 -> {
                    Mahasiswa.Menu();
                    break;
                    
                }
                case 3 -> {
                    System.exit(0); 
                }
            }
        }
    }
    
}
      
    
