import java.util.Scanner;
public class modifikasipercobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        
        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            
            int menu = sc.nextInt();
            sc.nextLine();
            
            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan baris (1-4): ");
                int baris = sc.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                int kolom = sc.nextInt();
                sc.nextLine();
                
                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Mohon maaf kursi tidak tersedia!");
                    continue;
                }
                if (penonton[baris-1][kolom-1] != null) {
                    System.out.println("Mohon maaf kursi sudah terisi!");
                    continue;
                }
                
                penonton[baris-1][kolom-1] = nama;
                
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": ***");
                        } else {
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                          }
                      }
                  }
                
                } else if (menu == 3) {
                    System.out.println("Program selesai");
                 break;
            }
        }
    }
}