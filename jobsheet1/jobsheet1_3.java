package jobsheet1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class jobsheet1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        String[] namaMK = new String[20], nilainHuruf = new String[20];
        int[] nilai = new int[20], bobotSKS = new int[20];
        Double bobotNilai[] = new Double[20],totalNilai = 0.0, totalSKS = 0.0; 

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah MK : ");  
        int jumlahMK = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < jumlahMK; i++){
            System.out.print("Masukkan nama MK ke-" + (i+1) + " : ");
            namaMK[i] = sc.nextLine();
            System.out.print(" - Masukkan bobot SKS : ");
            bobotSKS[i] = sc.nextInt();
            totalSKS += bobotSKS[i];
            System.out.print(" - Masukkan nilai : ");
            nilai[i] = sc.nextInt();
            sc.nextLine();
            if (nilai[i] > 80 && nilai[i] <= 100) {
                nilainHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            }else if (nilai[i] > 73 && nilai[i] <= 80) {
                nilainHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            }else if (nilai[i] > 65 && nilai[i] <= 73) {
                nilainHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            }else if (nilai[i] > 60 && nilai[i] <= 65) {
                nilainHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            }else if (nilai[i] > 50 && nilai[i] <= 60) {
                nilainHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            }else if (nilai[i] > 39 && nilai[i] <= 50) {
                nilainHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            }else if (nilai[i] <= 35) {
                nilainHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
            totalNilai += (bobotNilai[i] * bobotSKS[i]);
            sc.close();
        }
        System.out.println("==============================");
        System.out.println("Tabel Nilai : ");
        System.out.println(" ============================================================================================================");
        System.out.printf("%-3s %-40s %-3s %-11s %-3s %-7s %-3s %-13s %-3s %-13s %-3s%n", "|","MATA KULIAH","|","BOBOT SKS","|","NILAI","|","NILAI HURUF","|","BOBOT NILAI","|");
        System.out.println(" ============================================================================================================");
        for(int i = 0; i < jumlahMK; i++){
            System.out.printf("%-3s %-40s %-3s %-11s %-3s %-7s %-3s %-13s %-3s %-13s %-3s%n", "|",namaMK[i],"|",bobotSKS[i],"|",nilai[i],"|",nilainHuruf[i],"|",bobotNilai[i],"|");
        }
        System.out.println(" ------------------------------------------------------------------------------------------------------------");
        Double ip = totalNilai / totalSKS;
        String ip2 = df.format(ip);
        System.out.println(" =====================");
        System.out.printf("%-3s %-6s %-3s %-6s %-3s%n", "|","IP",":",ip2,"|");
        System.out.println(" =====================");
    }
}
