package jobsheet9;
public class Mahasiswa18 {
    String nama, nim, kelas;
    int nilai;

    Mahasiswa18(String nm, String n, String kls){
        nama = nm;
        nim = n;
        kelas = kls;
        nilai = -1;
    }
    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}
