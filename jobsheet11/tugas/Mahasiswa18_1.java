package jobsheet11.tugas;

public class Mahasiswa18_1 {
    String nim, nama, prodi, kelas;
    public Mahasiswa18_1(String nim, String nm, String prd, String kls){
        this.nim = nim;
        nama = nm;
        prodi = prd;
        kelas = kls;
    }
    public void tampilkanInformasi(){
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
