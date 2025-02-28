package jobsheet3;
import java.util.Scanner;
public class MataKuliah18 {
    public Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    public MataKuliah18(){}
    public MataKuliah18(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tambahData(){
        String dummy;
        System.out.print("  - Kode                   : ");
        kode = sc.nextLine();
        System.out.print("  - Nama                   : ");
        nama = sc.nextLine();
        System.out.print("  - SKS                    : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("  - Jumlah Jam             : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
    }
    void cetakInfo(MataKuliah18 arrayOfMataKuliah){
        System.out.println("  - Kode                  : " + arrayOfMataKuliah.kode);
        System.out.println("  - Nama                  : " + arrayOfMataKuliah.nama);
        System.out.println("  - SKS                   : " + arrayOfMataKuliah.sks);
        System.out.println("  - Jumlah Jam            : " + arrayOfMataKuliah.jumlahJam);
        System.out.println("------------------------------");
    }
}
