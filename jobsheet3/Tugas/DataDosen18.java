package jobsheet3.Tugas;
public class DataDosen18 {
    void dataSemuaDosen(Dosen18[] arrayOfDosen18){
        int j = 1;
        for (Dosen18 dosen18 : arrayOfDosen18) {
            System.out.println("Data Dosen ke-" + (j++));
            System.out.println("  - Kode                  : " + dosen18.kode);
            System.out.println("  - Nama                  : " + dosen18.nama);
            String jK;
            if (dosen18.jenisKelamin == true) {
                jK = "Wanita";
            }else{ jK = "Pria"; }
            System.out.println("  - Jenis Kelamin         : " + jK);
            System.out.println("  - Usia                  : " + dosen18.usia);
            System.out.println("---------------------------");
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen18[] arrayOfDosen18s){
        int l = 0, p = 0;
        for (Dosen18 dosen18 : arrayOfDosen18s) {
            if (dosen18.jenisKelamin == true) {
                p++;
            }else{ l++; }
        }
        System.out.println("Jumlah Dosen Pria     : " + l);
        System.out.println("Jumlah Dosen Wanita   : " + p);
    }
    void rerataUsiaDosenPerJenisKelamin(Dosen18[] arrayOfDosen18s){
        int l = 0, p = 0, jL = 0, jP = 0;
        double rL = 0, rP = 0;
        for (Dosen18 dosen18 : arrayOfDosen18s) {
            if (dosen18.jenisKelamin == true) {
                p++;
                jP += dosen18.usia;
            }else{ 
                l++;
                jL += dosen18.usia;
            }
        }
        rL = (double) jL / l;
        rP = (double) jP / p;
        System.out.println("Rata - rata usia Dosen Pria     : " + rL);
        System.out.println("Rata - rata usia Dosen Wanita   : " + rP);
    }
    void infoDosenPalingTua(Dosen18[] arrayOfDosen18s, int jumlahDosen){
        int index = 0;
        for(int i = 0; i < jumlahDosen; i++){
            if (arrayOfDosen18s[index].usia < arrayOfDosen18s[i].usia) {
                index = i;
            }
        }
        System.out.println("Data Dosen paling tua ");
        System.out.println("  - Kode                  : " + arrayOfDosen18s[index].kode);
        System.out.println("  - Nama                  : " + arrayOfDosen18s[index].nama);
        String jK;
        if (arrayOfDosen18s[index].jenisKelamin == true) {
            jK = "Wanita";
        }else{ jK = "Pria"; }
        System.out.println("  - Jenis Kelamin         : " + jK);
        System.out.println("  - Usia                  : " + arrayOfDosen18s[index].usia);
        System.out.println("---------------------------");
    }
    void infoDosenPalingMuda(Dosen18[] arrayOfDosen18s, int jumlahDosen){
        int index = 0;
        for(int i = 0; i < jumlahDosen; i++){
            if (arrayOfDosen18s[index].usia > arrayOfDosen18s[i].usia) {
                index = i;
            }
        }
        System.out.println("Data Dosen paling muda ");
        System.out.println("  - Kode                  : " + arrayOfDosen18s[index].kode);
        System.out.println("  - Nama                  : " + arrayOfDosen18s[index].nama);
        String jK;
        if (arrayOfDosen18s[index].jenisKelamin == true) {
            jK = "Wanita";
        }else{ jK = "Pria"; }
        System.out.println("  - Jenis Kelamin         : " + jK);
        System.out.println("  - Usia                  : " + arrayOfDosen18s[index].usia);
        System.out.println("---------------------------");
    }
}
