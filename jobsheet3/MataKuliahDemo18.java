package jobsheet3;
import java.util.Scanner;
public class MataKuliahDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mata Kuliah : ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();
        MataKuliah18[] arrayOfMataKuliah = new MataKuliah18[jumlahMataKuliah];

        for(int i = 0; i < jumlahMataKuliah; i++){
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah18();
            arrayOfMataKuliah[i].tambahData();
            System.out.println("------------------------------");
        }
        for(int i = 0; i < jumlahMataKuliah; i++){
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo(arrayOfMataKuliah[i]);
        }
        sc.close();
    }
}
