package jobsheet6;
import java.util.Scanner;
public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();
        for(int i = 0; i < 5; i++){
            Mahasiswa18 mhs = new Mahasiswa18();
            System.out.println("Isi data mahasiswa ke-" + (i + 1));
            System.out.print(" - Nama : ");
            mhs.nama = sc.nextLine();
            System.out.print(" - NIM : ");
            mhs.nim = sc.nextLine();
            System.out.print(" - Kelas : ");
            mhs.kelas = sc.nextLine();
            System.out.print(" - IPK : ");
            mhs.ipk = sc.nextDouble();
            sc.nextLine();
            list.tambah(mhs);
        }

        System.out.println("Data mahasiwa sebelum sorting : ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data telah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data telah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        sc.close();
    }
    
}