package Tugas2;

public class DosenMain18 {
    public static void main(String[] args) {
        Dosen18 dosen1 = new Dosen18();
        dosen1.idDosen = "P90";
        dosen1.nama = "Nabil Hanief Mafazi";
        dosen1.bidangKeahlian = "Main Game";
        dosen1.tahunBergabung = 2000;
        dosen1.statusAktif = false;
        dosen1.tampilInformasi();
        dosen1.ubahKeahlian("Tidur");
        dosen1.setStatus(true); 
        dosen1.hitungMasaKerja(2025);
        dosen1.tampilInformasi();

        System.out.println("==================================================");

        Dosen18 dosen2 = new Dosen18("P90", "Dimas Handayana", true, 2015, "Makan");
        dosen2.tampilInformasi();
        dosen2.ubahKeahlian("Main");
        dosen2.setStatus(false);
        dosen2.hitungMasaKerja(2010);
        dosen2.tampilInformasi();
    }
}
