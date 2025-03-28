package jobsheet7.tugas;

public class Dosen {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen(String kd, String nm, boolean jns, int us){
        kode = kd;
        nama = nm;
        jenisKelamin = jns;
        usia = us;
    }
    void tampil(){
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis kelamin : " + jnsKlminBooleanToString(jenisKelamin));
        System.out.println("Usia : " + usia);
    }
    String jnsKlminBooleanToString(boolean jns){
        String gender;
        if ( jns != true) {
            gender = "Pria";
        }else{
            gender = "Wanita";
        }
        return gender;
    }
}
