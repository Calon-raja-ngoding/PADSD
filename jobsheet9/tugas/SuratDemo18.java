package tugas;
import java.util.Scanner;
public class SuratDemo18 {
    public static void main(String[] args) {
    StackSurat18 stack = new StackSurat18(10);
    Scanner scan = new Scanner(System.in);
    int pilih;
    Integer id = 0;
    do {
        System.out.println("\nMenu:");
        System.out.println("1. Terima Surat Izin");
        System.out.println("2. Proses Surat Izin");
        System.out.println("3. Lihat Surat Izin Terakhir");
        System.out.println("4. Cari Surat ");
        System.out.print("Pilih: ");
        pilih = scan.nextInt();
        scan.nextLine();
        System.out.println("---------------------------------");
        switch (pilih) {
            case 1:
                if (stack.isFull()) {
                    System.out.println(" !!! Stack Penuh");
                    break;
                }else{
                    System.out.print(" - Nama : ");
                    String nama = scan.nextLine();
                    System.out.print(" - Kelas : ");
                    String kelas = scan.nextLine();
                    char jenis;
                    while (true) {
                        System.out.print(" - Jenis Izin ( S / I )? : ");
                        jenis = scan.next().charAt(0);
                        if (Character.toLowerCase(jenis) == 's' || Character.toLowerCase(jenis) == 'i') {
                            break;
                        }else{
                            System.out.println(" !!! Input Invalid");
                        }
                    }
                    scan.nextLine();
                    System.out.print(" - Durasi : ");
                    String drs = scan.nextLine();
                    Integer durasi = Integer.parseInt(drs);
                    Surat18 surat = new Surat18(Integer.toString(id++), nama, kelas , jenis, durasi);
                    stack.terimaSuratIzin(surat);
                    System.out.printf(" ** Surat %s berhasil dikumpulkan\n ", surat.namaMahasiswa, " **");
                    System.out.println("---------------------------------");
                    break;
                }
            case 2:
                Surat18 diproses = stack.prosesSuratIzin();
                if (diproses != null) {
                    System.out.println(" ** Memproses Surat Izin " + diproses.namaMahasiswa + " **");
                }
                System.out.println("---------------------------------");
                break;
            case 3:
                stack.lihatSuratIzinTerakhir();
                System.out.println("---------------------------------");
                break;
            case 4:
                System.out.print("Masukkan nama mahasiswa dari surat yang dicari : ");
                String cari = scan.nextLine();
                stack.cariSurat(cari);
                System.out.println("---------------------------------");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.out.println("---------------------------------");
        }
    } while (pilih >= 1 && pilih <= 4);
    System.out.println(" --- TERIMA KASIH :) ---");
    scan.close();
    }
}
