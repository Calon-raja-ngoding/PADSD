package jobsheet2;
public class Mahasiswa18 {
    String nama;
    String nim;
    double ipk;
    String kelas;
    
    void tampilkanInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
        
    }
    public Mahasiswa18(){}
    public Mahasiswa18(String nama, String nim, double ipk, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIPK(double ipkBaru){
        ipk = ipkBaru;
    }
    String nilaiKinerja(){
        if (ipk <= 4.0 && ipk >= 0.0) {
            if (ipk >= 3.5) {
                return "Kinerja sangat baik";
            }else if (ipk >= 3.0) {
                return "Kinerja baik";
            }else if (ipk >= 2.0) {
                return "Kinerja cukup";
            }else { return "Kinerja kurang "; }
        }else { return "IPK tidak valid. Harus diantara 0.0 dan 4.0"; }
        
    }
}
