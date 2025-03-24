package jobsheet5.Tugas;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int elemen = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------");
        Mahasiswa[] mhs = new Mahasiswa[elemen];
        for(int i = 0; i < elemen; i++){
            System.out.println("Isi data Mahasiswa ke-" + (i + 1));
            System.out.print(" - Nama Mahasiswa : ");
            String nama = sc.nextLine();
            System.out.print(" - NIM Mahasiswa : ");
            String nim = sc.nextLine();
            System.out.print(" - Tahun masuk Mahasiswa : ");
            int tahun = sc.nextInt();
            System.out.print(" - Nilai UTS Mahasiswa : ");
            int uts = sc.nextInt();
            System.out.print(" - Nilai UAS Mahasiswa : ");
            int uas = sc.nextInt();
            sc.nextLine();
            mhs[i] = new Mahasiswa(nama, nim, tahun, uts, uas);
            System.out.println("---------------------");
        }
        System.out.println("Nilai UTS tertinggi ");
        System.out.println(" - Nama : " +  Mahasiswa.utsTertinggi(mhs, 0, mhs.length - 1).nama);
        System.out.println(" - Nilai UTS : " +  Mahasiswa.utsTertinggi(mhs, 0, mhs.length - 1).uts);
        System.out.println("---------------------");
        System.out.println("Nilai UTS terendah ");
        System.out.println(" - Nama : " +  Mahasiswa.utsTerendah(mhs, 0, mhs.length - 1).nama);
        System.out.println(" - Nilai UTS : " +  Mahasiswa.utsTerendah(mhs, 0, mhs.length - 1).uts);
        System.out.println("---------------------");
        System.out.printf("%-21s %.2f\n","Rata - rata nilai UAS : ", Mahasiswa.rataNilaiUAS(mhs));
        System.out.println("---------------------");
        sc.close();
    }
}
