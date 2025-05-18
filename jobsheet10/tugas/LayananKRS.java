package jobsheet10.tugas;
import java.util.Scanner;
public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayananKRS antrian = new AntrianLayananKRS(10);
        int pilihan = 0, mahasiswaSdhKRS = 0;
        
        do {System.out.println("\n=== Academic Service Menu ===");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Front");
            System.out.println("4. Display All Data");
            System.out.println("5. Queue Size");
            System.out.println("6. Display Last");
            System.out.println("7. Print Amount Of Students have Done KRS");
            System.out.println("8. Print Amount Of Students not yet KRS");
            System.out.println("9. Print jumlah sisa kuota DPA");
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
                    Mahasiswa18_1 mhs = new Mahasiswa18_1(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa18_1 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayanai mahasiswa : ");
                        dilayani.tampilkanData();
                        dilayani = antrian.layaniMahasiswa();
                        dilayani.tampilkanData();
                        mahasiswaSdhKRS += 2;
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian : " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 7:
                    System.out.println("Jumlah Mahasiswa yg sudah memproses KRS : "  + (antrian.getJumlahAntrian()  + mahasiswaSdhKRS));;
                    break;
                case 8:
                    System.out.println("Jumlah Mahasiswa yg belum memproses KRS : "  + ( 30 - antrian.getJumlahAntrian()  - mahasiswaSdhKRS));;
                    break;
                case 9:
                    System.out.println("Jumlah sisa kuota DPA : "  + antrian.jthDPA);;
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
