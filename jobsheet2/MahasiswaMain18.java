public class MahasiswaMain18 {
    public static void main(String[] args) {
        Mahasiswa18 mhs1 = new Mahasiswa18();
        mhs1.nama = "Nabil Hanief Mafazi";
        mhs1.nim = "244107020114";
        mhs1.ipk = 3.67;
        mhs1.kelas = "TI-1H";

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB-1E");
        mhs1.updateIPK(4.00);
        mhs1.tampilkanInformasi();;

        Mahasiswa18 mhs2 = new Mahasiswa18("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();
    }
}
