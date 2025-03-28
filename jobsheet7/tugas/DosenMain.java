package jobsheet7.tugas;

import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen : ");
        int jumDsn = sc.nextInt();
        sc.nextLine();
        DataDosen list = new DataDosen(jumDsn);
        for(int i = 0; i < jumDsn; i++){
            boolean jns = true;
            System.out.println("Isi data dosen ke-" + (i + 1));
            System.out.print(" - Kode : ");
            String kode = sc.nextLine();
            System.out.print(" - Nama: ");
            String nama = sc.nextLine();
            System.out.print(" - Jenis Kelamin (L/P)? : ");
            String jenisKelamin = sc.nextLine();
            if (jenisKelamin.equalsIgnoreCase("l")) {
                jns = false;
            }else{
                jns = true;
            }
            System.out.print(" - Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------");
            Dosen dsn = new Dosen(kode, nama, jns, usia);
            list.tambah(dsn);
        }

        list.sortingASC();

        System.out.println("--------------------------------------");
        System.out.println("PENCARIAN DATA");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan nama dosen yang dicari : ");
        String cari = sc.nextLine();
        System.out.println("=========================");
        System.out.println("Menggunakan sequential searching ");
        System.out.println("=========================");
        int[] posisi = list.sequntialSarching(cari);
        list.tampilDataSearch(cari, posisi);
        System.out.println("=========================");

        System.out.println("--------------------------------------");
        System.out.println("PENCARIAN DATA");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan usia dosen yang dicari : ");
        int cari2 = sc.nextInt();
        System.out.println("=========================");
        System.out.println("Menggunakan binary search ");
        System.out.println("=========================");
        int[] posisi2 = list.findBinarySearch(cari2, 0, jumDsn - 1);
        list.tampilDataSearch2(cari2, posisi2);

        sc.close();
    }
}
