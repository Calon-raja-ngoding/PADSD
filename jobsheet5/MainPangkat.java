package jobsheet5;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Elemen : ");
        int elemen = sc.nextInt();
        Pangkat[] png = new Pangkat[elemen];
        for(int i = 0; i < elemen; i ++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + " : ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }
        System.out.println("===========================");
        System.out.println("HASIL PANGKAT BRUTEFORCE : ");
        for (Pangkat p : png) {
            System.out.println("  - " + p.nilai + " ^ " + p.pangkat + " : " + p.pangkatBF());
        }
        System.out.println("===========================");
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER : ");
        for (Pangkat p : png) {
            System.out.println("  - " + p.nilai + " ^ " + p.pangkat + " : " + p.pangkatDC(p.nilai, p.pangkat));
        }
        sc.close();
    }
}
