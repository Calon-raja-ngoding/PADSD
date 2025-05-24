package jobsheet12.dll;

public class Mahasiswa18_2 {
    public String nim, nama, kelas;
    public double ipk;

    public Mahasiswa18_2(String nim, String nm, String kls, double ip){
        this.nim = nim;
        nama = nm;
        kelas = kls;
        ipk = ip;
    }
    public void tampil(){
        System.out.println("NIM - NAMA - KELAS - IPK");
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}
