package jobsheet1;
import java.util.Scanner;
public class tugasJobsheet1_2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("========================");
            int choice = menu();
            int sisi;
            switch (choice) {
                case 1:
                    System.out.println("========================");
                    System.out.println("---------VOLUME---------");
                    System.out.println("========================");
                    System.out.print("Panjang sisi-sisi kubus : ");
                    sisi = sc.nextInt();
                    System.out.println("Volume : " + volume(sisi));
                    
                    break;
                case 2:
                    System.out.println("========================");
                    System.out.println("-----LUAS PERMUKAAN-----");
                    System.out.println("========================");
                    System.out.print("Panjang sisi-sisi kubus : ");
                    sisi = sc.nextInt();
                    System.out.println("Luas Permukaan : " + luasPermukaan(sisi));
                    
                    break;
                case 3:
                    System.out.println("========================");
                    System.out.println("--------KELILING--------");
                    System.out.println("========================");
                    System.out.print("Panjang sisi-sisi kubus : ");
                    sisi = sc.nextInt();
                    System.out.println("Keliling : " + keliling(sisi));

                    break;
                case 4:
                    System.out.println("========================");
                    System.out.println("*** TERIMA KASIH :) ***");
                    return;
                        
                default:
                    System.out.println("========================");
                    System.out.println("****inputan invalid*****");
                    System.out.println("========================");
                    break;
            }
        }   
    }
    static int menu(){
        System.out.println(" =======================");
        System.out.println("|      MENU KUBUS       |");
        System.out.println(" =======================");
        System.out.println("| 1. Volume             |");
        System.out.println("| 2. Luas Permukaan     |");
        System.out.println("| 3. Keliling           |");
        System.out.println("| 4. Keluar             |");
        System.out.println(" =======================");
        System.out.print("Masukkan Menu : ");
        int x = sc.nextInt();
        return x;
    }
    static int volume(int a){
        int volume = a * a * a;
        return volume;
    }
    static int luasPermukaan(int a){
        int luasPermukaan = 6 * (a * a);
        return luasPermukaan;
    }
    static int keliling(int a){
        int keliling = 6 * a;
        return keliling;
    }
}
