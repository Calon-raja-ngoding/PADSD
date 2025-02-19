package jobsheet1;
import java.util.Scanner;
public class tugasJobsheet1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah MK : ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();
        int sks[] = new int[jumlahMK], semester[] = new int[jumlahMK];
        String namaMK[] = new String[jumlahMK], 
        hariKuliah[] = new String[jumlahMK];

        for(int i = 0; i < jumlahMK; i++){
            System.out.println("Mata Kuliah ke-" + (i+1));
            System.out.print(" - Masukkan nama MK ke-" + (i+1) + " : ");
            namaMK[i] = sc.nextLine();
            System.out.print(" - Masukkan jumlah SKS MK ke-" + (i+1) + " : ");
            sks[i] = sc.nextInt();
            System.out.print(" - Masukkan semester MK ke-" + (i+1) + " : ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print(" - Masukkan hari kuliah  MK ke-" + (i+1) + " : ");
            hariKuliah[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("------------------------");
            System.out.println(" =============================================");
            System.out.println("|                MENU LAYANAN                  |");
            System.out.println(" ==============================================");
            System.out.println("| 1. Menampilkan seluruh jadwal                |");
            System.out.println("| 2. Menampilkan jadwal hari tertentu          |");
            System.out.println("| 3. Menampilkan jadwal semester tertentu      |");
            System.out.println("| 4. Mencari Mata Kuliah                       |");
            System.out.println("| 5. Keluar                                    |");
            System.out.println(" ==============================================");
            System.out.print("Masukkan menu : ");
            int menu = sc.nextInt();
            sc.nextLine();
            boolean keluar = false;

            switch (menu) {
                case 1:    
                    System.out.println("========================");
                    System.out.println("Seluruh Jadwal : ");
                    System.out.println("========================");
                    System.out.printf("%-45s %-10s %-15s %-10s%n", "MK","SKS","Semester","Hari");
                    
                    for(int i = 0; i < jumlahMK; i++){
                        System.out.printf("%-45s %-10s %-15s %-10s%n", namaMK[i],sks[i],semester[i],hariKuliah[i]);
                    }
                    

                    break;

                case 2:    
                    System.out.println("========================");
                    System.out.println("Jadwal Hari : ");
                    System.out.println("========================");
                    System.out.print("Masukkan Hari : ");
                    String day = sc.nextLine();
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("%-45s %-10s %-15s %-10s%n", "MK","SKS","Semester","Hari");
                    System.out.println("-----------------------------------------------------------------------------");
                    int[] daftarH = daftarHari(hariKuliah, jumlahMK, jumlahHari(hariKuliah, day, jumlahMK), day);
                    for(int i = 0; i < jumlahHari(hariKuliah, day, jumlahMK); i++){
                        System.out.printf("%-45s %-10s %-15s %-10s%n", namaMK[daftarH[i]],sks[daftarH[i]],semester[daftarH[i]],hariKuliah[daftarH[i]]);
                    }
                    

                    break;

                case 3:    
                    System.out.println("========================");
                    System.out.println("Jadwal Hari : ");
                    System.out.println("========================");
                    System.out.print("Masukkan Semester : ");
                    int semes = sc.nextInt();
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.printf("%-45s %-10s %-15s %-10s%n", "MK","SKS","Semester","Hari");
                    System.out.println("-------------------------------------------------------------------------------");
                    int[] daftar = daftarSemester(semester, jumlahMK,jumlahSemester(semester, semes, jumlahMK), semes);
                    for(int i = 0; i < jumlahSemester(semester, semes, jumlahMK); i++){
                        System.out.printf("%-45s %-10s %-15s %-10s%n", namaMK[daftar[i]],sks[daftar[i]],semester[daftar[i]],hariKuliah[daftar[i]]);
                    }
                    

                    break;
                
                case 4:    
                    System.out.println("========================");
                    System.out.println("Jadwal Hari : ");
                    System.out.println("========================");
                    System.out.print("Masukkan Hari : ");
                    String name = sc.nextLine();
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("%-45s %-10s %-15s %-10s%n", "MK","SKS","Semester","Hari");
                    System.out.println("-----------------------------------------------------------------------------");
                    int daftarN = indexMK(namaMK, jumlahMK, name);
                    System.out.printf("%-45s %-10s %-15s %-10s%n", namaMK[daftarN],sks[daftarN],semester[daftarN],hariKuliah[daftarN]);
                    

                    break;
                
                case 5 :
                    System.out.println("==================");
                    System.out.println("TERIMA KASIH :)   |");
                    System.out.println("==================");
                    keluar = true;
            
                default:
                    System.out.println("========================");
                    System.out.println("menu tidak terdaftar    |");
                    System.out.println("========================");

                    break;
            }
            if (keluar == true) {
                break;
            }
            sc.close();
        }
    }
    
    static int jumlahSemester(int[] a,int b, int c){
        int jumlah = 0;
        for(int i = 0; i < c; i++){
            if (a[i] == b) {
                jumlah++;
            }
        }
        return jumlah;
    }
    static int[] daftarSemester(int[] a, int b,int c, int d){
        int daftar[] = new int[c];
        int k = 0;
        for(int i = 0; i < b; i++){
            if (a[i] == d) {
                daftar[k] = i;
                k++;
            }
        }
        return daftar;
    }
    static int jumlahHari(String[] a,String b, int c){
        int jumlah = 0;
        for(int i = 0; i < c; i++){
            if (a[i].equalsIgnoreCase(b)) {
                jumlah++;
            }
        }
        return jumlah;
    }
    static int[] daftarHari(String[] a, int b,int c, String d){
        int daftar[] = new int[c];
        int k = 0;
        for(int i = 0; i < b; i++){
            if (a[i].equalsIgnoreCase(d)) {
                daftar[k] = i;
                k++;
            }
        }
        return daftar;
    }
    static int indexMK(String[] a, int b, String c){
        int daftar = 0;
        for(int i = 0; i < b; i++){
            if (a[i].equalsIgnoreCase(c)) {
                daftar = i;
                break;
            }
        }
        return daftar;
    }
}
