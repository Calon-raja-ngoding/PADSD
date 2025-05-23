package jobsheet11.tugas;
import java.util.Scanner;
public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayananKRS antrian = new AntrianLayananKRS();
        int pilihan = 0, size = -1;
        
        do {System.out.println("\n=== Academic Service Menu ===");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Front");
            System.out.println("4. Queue Size");
            System.out.println("5. Display Last");
            System.out.println("0. Exit");
            System.out.print("Choise a menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    size++;
                    Mahasiswa18_1 mhs = new Mahasiswa18_1(nim, nama, prodi, kelas);
                    antrian.insertAt(size, mhs);
                    break;
                case 2:
                    Mahasiswa18_1 dilayani = antrian.memanggil();
                    if (dilayani != null) {
                        System.out.println("Melayanai mahasiswa : ");
                        dilayani.tampilkanInformasi();
                        size --;
                    }
                    break;
                case 3:
                    antrian.getData(0);
                    break;
                case 4:
                    System.out.println("Jumlah antrian saat ini adalah " + (size + 1));
                    break;
                case 5:
                    antrian.getData(size);
                    break;
                case 0:
                    System.out.println("Terima Kasih :)");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            
        } while (pilihan != 0);
        sc.close();
    }
}
