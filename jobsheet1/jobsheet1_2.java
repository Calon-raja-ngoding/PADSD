package jobsheet1;
import java.util.Scanner;
public class jobsheet1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        System.out.println("==================================");
        String duaAngkaTerakhir = "00";

        if (nim.length() >= 2) {
            duaAngkaTerakhir = nim.substring(nim.length() -2);
        }
        int n = Integer.parseInt(duaAngkaTerakhir);
        if (n < 10) {
            n = n + 10;
        }
        System.out.println("n : " + n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                System.out.print(" ");
            }else{
                if (i %  2 == 0) {
                    System.out.print(i + " ");
                }else{
                    System.out.print("* ");
                }
            } 
        }
        sc.close();
    }
}
