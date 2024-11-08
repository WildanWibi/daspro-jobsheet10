import java.util.Scanner;

public class Tugasjobsheet10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arraySurvey = new int[10][6]; 
        double total = 0, hitung = 0;
        double rata2responden, rata2pertanyaan, rata2keseluruhan;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Data Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Masukkan nilai pertanyaan ke-" + (j + 1) + ": ");
                arraySurvey[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\nRata-rata per Responden:");
        for (int i = 0; i < 10; i++) {
            double sum = 0;
            for (int j = 0; j < 6; j++) {
                sum += arraySurvey[i][j];
            }
            rata2responden = sum / 6;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata2responden);
        }
        
        System.out.println("\nRata-rata per Pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += arraySurvey[i][j];
            }
            rata2pertanyaan = sum / 10;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata2pertanyaan);
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += arraySurvey[i][j];
                hitung += 60;
            }
        }
        rata2keseluruhan = total / hitung;
        
        System.out.println("\nRata-rata Keseluruhan: " + rata2keseluruhan);
        
    }
}