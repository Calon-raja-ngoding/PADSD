package jobsheet7;
import java.util.Scanner;
public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18(jumMhs);
        sc.nextLine();
        for(int i = 0; i < jumMhs; i++){
            System.out.println("Isi data mahasiswa ke-" + (i + 1));
            System.out.print(" - NIM : ");
            String nim = sc.nextLine();
            System.out.print(" - Nama : ");
            String nama = sc.nextLine();
            System.out.print(" - Kelas : ");
            String kelas = sc.nextLine();
            System.out.print(" - IPK : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            list.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
        }
        System.out.println("=========================");
        list.tampil();
        System.out.println("=========================");

        System.out.println("--------------------------------------");
        System.out.println("PENCARIAN DATA");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari : ");
        String cr = sc.nextLine();
        Double cari = Double.parseDouble(cr);
        System.out.println("=========================");

        System.out.println("Menggunakan sequential searching ");
        System.out.println("=========================");
        double posisi = list.sequntialSarching(cari);
        int pss = (int) posisi;

        list.tampilPosisi(cari, pss);
        list.tampillDatasearch(cari, pss);
        System.out.println("=========================");

        System.out.println("--------------------------------------");
        System.out.println("PENCARIAN DATA");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari : ");
        String cr2 = sc.nextLine();
        Double cari2 = Double.parseDouble(cr2);
        System.out.println("=========================");

        System.out.println("Menggunakan binary search ");
        System.out.println("=========================");
        double posisi2 = list.findBinarySearch(cari2, 0, jumMhs - 1);
        int pss2 = (int) posisi2;

        list.tampilPosisi(cari2, pss2);
        list.tampillDatasearch(cari2, pss2);

        sc.close();
    }
    
}