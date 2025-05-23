package jobsheet11;

public class Mahasiswa00 {
    String nim, nama, kelas;
    double ipk;
    public Mahasiswa00(String nim, String nm, String kls, double ip){
        nama = nm;
        this.nim = nim;
        kelas = kls;
        ipk = ip;
    }
    public void tampilkanInformasi(){
        System.out.printf("%-15s %-20s %-10s %.2f\n", nim, nama, kelas, ipk);
    }
}
