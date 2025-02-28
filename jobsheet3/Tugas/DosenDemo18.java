package jobsheet3.Tugas;
import java.util.Scanner;
public class DosenDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen : ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();
        System.out.println("===================================");
        Dosen18[] arrayOfDosen18 = new Dosen18[jumlahDosen];
        DataDosen18 methode = new DataDosen18();
        String kode, nama, dummy;
        int usia;
        boolean jenisKelamin = true;
        for(int i = 0; i < jumlahDosen; i++){
            System.out.println("Masukkan data Dosen ke-" + (i + 1));
            System.out.print("  - Kode                      : ");
            kode = sc.nextLine();
            System.out.print("  - Nama                      : ");
            nama = sc.nextLine();
            while (true) {
                System.out.print("  - Jenis kelamin (L/P) ?     : ");
                dummy = sc.nextLine();
                if (dummy.equalsIgnoreCase("L")) {
                    jenisKelamin = false;
                    break;
                }else if (dummy.equalsIgnoreCase("P")) {
                    jenisKelamin = true;
                    break;
                }else{
                    System.out.println("*** Anda Hanya Bisa Menginput (L) atau (P) ***");
                }
            }
            System.out.print("  - Usia                      : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            arrayOfDosen18[i] = new Dosen18(kode, nama, jenisKelamin, usia);
            System.out.println("-------------------------------");
        }
        while (true) {
            System.out.println("===================================");
            System.out.println(" ===================================================================");
            System.out.println("|                       MENU LAYANAN PROGRAM                        |");
            System.out.println(" ===================================================================");
            System.out.println("| 1. Menampilkan semua data Dosen                                   |");
            System.out.println("| 2. Menampilkan jumlah Dosen per jenis kelamin                     |");
            System.out.println("| 3. Menampilkan rata rata usia Dosen per jenis kelamin             |");
            System.out.println("| 4. Menampilkan data Dosen paling tua                              |");
            System.out.println("| 5. Menampilkan data Dosen paling muda                             |");
            System.out.println("| 6. Keluar                                                         |");
            System.out.println(" ===================================================================");
            System.out.print("Masukkan Menu : ");
            int menu = sc.nextInt();
            boolean keluar = false;
            switch (menu) {
                case 1:
                    System.out.println("===================================");
                    methode.dataSemuaDosen(arrayOfDosen18);

                    break;
                
                case 2:
                    System.out.println("===================================");
                    methode.jumlahDosenPerJenisKelamin(arrayOfDosen18);

                    break;

                case 3:
                    System.out.println("===================================");
                    methode.rerataUsiaDosenPerJenisKelamin(arrayOfDosen18);

                    break;

                case 4:
                    System.out.println("===================================");
                    methode.infoDosenPalingTua(arrayOfDosen18, jumlahDosen);

                    break;

                case 5:
                    System.out.println("===================================");
                    methode.infoDosenPalingMuda(arrayOfDosen18, jumlahDosen);

                    break;
                
                case 6:
                    System.out.println("===================================");
                    keluar = true;
                    System.out.println("***  TERIMA KASIH :)  ***");

                    break;

                default:
                    System.out.println();
                    System.out.println("*** Menu Tidak Valid ***");
                    System.out.println();
                    break;
            }
            if (keluar) {
                break;
            }
        }
        sc.close();
    }
}
