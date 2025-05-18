package jobsheet10.p2;

public class Mahasiswa {
    String nim, nama, prodi, kelas;
    public Mahasiswa(String nim, String nm, String prd, String kls){
        this.nim = nim;
        nama = nm;
        prodi = prd;
        kelas = kls;
    }
    public void tampilkanData(){
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
