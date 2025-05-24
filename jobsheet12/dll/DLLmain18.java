package jobsheet12.dll;
import java.util.Scanner;
public class DLLmain18 {
    public static void main(String[] args) {
        DoubleLinkedlist18 list = new DoubleLinkedlist18();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu Double linked list Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah setelah data yg diinginkan");
            System.out.println("8. Tambah di indeks yg diinginkan");
            System.out.println("9. Hapus setelah data yg diinginkan");
            System.out.println("10. Hapus di indeks yg diinginkan");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data di indeks yg diinginkan");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. keluar");
            System.out.print("Masukkan Menu yg diinginkan : ");
            pilihan = scan.nextInt();
            scan.nextLine();
            switch (pilihan) {
                case 1 -> {
                    Mahasiswa18_2 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa18_2 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    list.removeFirst();
                }
                case 4 ->{
                    list.removeLast();
                }
                case 5 ->{
                    list.printAll();
                }
                case 6 ->{
                    System.out.print("Masukkan NIM yg ingin dicari : ");
                    String key = scan.nextLine();
                    Node18 found = list.search(key);
                    if (found != null) {
                        System.out.println("Data ditemukan : ");
                        found.data.tampil();
                    }else{
                        System.out.println("!! Data tidak ditemukan !!");
                    }
                }
                case 7 ->{
                    Mahasiswa18_2 mhs = inputMahasiswa(scan);
                    System.out.print("Masukkan NIM yg ingin ditambahkan setelahnya : ");
                    String key = scan.nextLine();
                    list.insertAfter(key, mhs);
                }
                case 8 ->{
                    Mahasiswa18_2 mhs = inputMahasiswa(scan);
                    System.out.print("Masukkan indeks yg diinginkan : ");
                    int indek = scan.nextInt();
                    scan.nextLine();
                    list.add(indek, mhs);
                }
                case 9 ->{
                    System.out.print("Masukkan NIM yg ingin dihapus setelahnya : ");
                    String key = scan.nextLine();
                    list.removeAfter(key);
                }
                case 10 ->{
                    System.out.print("Masukkan indeks yg diinginkan : ");
                    int indek = scan.nextInt();
                    scan.nextLine();
                    list.remove(indek);
                }
                case 11 ->{
                    Mahasiswa18_2 mhs = list.head.data;
                    mhs.tampil();
                }
                case 12 ->{
                    Mahasiswa18_2 mhs = list.tail.data;
                    mhs.tampil();
                }
                case 13 ->{
                    System.out.print("Masukkan indeks yg diinginkan : ");
                    int indek = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(indek);
                }
                case 14 ->{
                    System.out.println("Jumlah data adalah : " + list.size());
                }
                case 0 -> System.out.println("!! Keluar dari program !!");
                default -> System.out.println("!! Input tidak valid !!");
            }
        } while (pilihan != 0);
        scan.close();
    }
    public static Mahasiswa18_2 inputMahasiswa(Scanner sc){
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        Mahasiswa18_2 mhs = new Mahasiswa18_2(nim, nama, kelas, ipk);
        return mhs;
    }
}