package jobsheet1;
import java.util.Scanner;
public class jobsheet1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nillai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas : ");
        Double nTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        Double nKuis = sc.nextDouble();
        System.out.print("Masukan Nilai UTS : ");
        Double nUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        Double nUAS = sc.nextDouble();
        System.out.println("===============================");
        System.out.println("===============================");
        String nHuruf = " ";
        if ((nKuis > 100 || nKuis < 0)||(nTugas > 100 || nTugas < 0)||(nUAS > 100 || nUAS < 0)||(nUTS > 100 || nUTS < 0)) {
            System.out.println("nilai tidak valid");
        }else{
            Double nAkhir = (nKuis * 0.2) + (nTugas * 0.2) + (nUTS * 0.3) + (nUAS * 0.4);
            System.out.println("nilai akhir : " + nAkhir);
            if (nAkhir > 80 && nAkhir <= 100) {
                nHuruf = "A";
            }else if (nAkhir > 73 && nAkhir <= 80) {
                nHuruf = "B+";
            }else if (nAkhir > 65 && nAkhir <= 73) {
                nHuruf = "B";
            }else if (nAkhir > 60 && nAkhir <= 65) {
                nHuruf = "C+";
            }else if (nAkhir > 50 && nAkhir <= 60) {
                nHuruf = "C";
            }else if (nAkhir > 39 && nAkhir <= 50) {
                nHuruf = "D";
            }else if (nAkhir <= 35) {
                nHuruf = "E";
            }
            System.out.println("Nilai Huruf : " + nHuruf);
        }
        System.out.println("===============================");
        System.out.println("===============================");
        if (nHuruf == "D" || nHuruf == "E") {
            System.out.println("TIDAK LULUS");
        }else{
            System.out.println("LULUS");
        }
        sc.close();
    }
}