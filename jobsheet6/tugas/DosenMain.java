package jobsheet6.tugas;

import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen list = new DataDosen();
        for(int i = 0; i < 10; i++){
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

        System.out.println("Data mahasiwa sebelum sorting : ");
        list.tampil();

        System.out.println("Data telah terurut menggunakan BUBBLE SORT (ASC) : ");
        list.sortingASC();
        list.tampil();

        System.out.println("Data telah terurut menggunakan SELECTION SORT (DSC) : ");
        list.sortingDsc();
        list.tampil();

        System.out.println("Data telah terurut menggunakan INSERTION SORT (DSC) : ");
        list.insertionSort();
        list.tampil();

        sc.close();
    }
}
