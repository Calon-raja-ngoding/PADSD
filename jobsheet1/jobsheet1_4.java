package jobsheet1;
import java.util.Scanner;
public class jobsheet1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga[] = {75000,50000,60000,10000}, tokoBunga[][] = new int[4][4], total[] = new int[4], mati[] = new int[4];
        String jenisBunga[] = {"Aglonema","Keladi","Alocosia","Mawar"};
        
        
        System.out.println("TOKO BUNGA ROYAL GARDEN");
        System.out.println("=======================");
        for(int i = 0; i < tokoBunga.length; i++){
            System.out.println("Cabang ke-" + (i+1) + " : ");
            for(int j = 0; j < tokoBunga[i].length; j++){
                System.out.print("Masukkan jumlah bunga " + jenisBunga[j] + " : ");
                tokoBunga[i][j] = sc.nextInt();
                total[i] += (tokoBunga[i][j] * harga[j]);
            }
        }           
        
        while (true) {
            System.out.println("=======================");
            System.out.println(" ---------------------------");
            System.out.println("|       MENU LAYANAN        |");
            System.out.println(" ---------------------------");
            System.out.println("| 1. Data penjualan         |");
            System.out.println("| 2. Data cabang 4          |");
            System.out.println("| 3. Kelauar                |");
            System.out.println(" ---------------------------");
            System.out.print("Masukkan angka dari menu : ");
            int menu = sc.nextInt();
            sc.nextLine();
            boolean keluar = false;

            if (menu == 1) {
                System.out.println("=======================");
                System.out.println("Data penjualan");
                System.out.println("=======================");
                System.out.print("Masukkan cabang : ");
                int x = sc.nextInt();
                menu1(tokoBunga, jenisBunga, harga, x, total);
            }else if (menu == 2) {
                System.out.print("Ingin menambah informasi (y/n) : ");
                String add = sc.nextLine();
                if (add.equalsIgnoreCase("y")) {
                    for(int i = 0; i < jenisBunga.length; i++){
                        System.out.print(jenisBunga[i] + " mati : ");
                        mati[i] = sc.nextInt();
                    }
                }
                System.out.println("=======================");
                tokoBunga[3] = menu2(tokoBunga[3], mati, jenisBunga);
            }else if (menu == 3) {
                System.out.println("==================");
                System.out.println("TERIMA KASIH :)   |");
                System.out.println("==================");
                keluar = true;
            }else{
                System.out.println("** inputan invalid **");
            }
            if ( keluar == true) {
                break;
            }
        }
        sc.close();
    }
    static void menu1(int[][] a, String[] b, int[] c,int d,int[] e ){
        System.out.println(" ==============================================================");
        System.out.printf("%-3s %-13s %-3s %-7s %-3s %-10s %-3s %-13s %-3s%n","|","CABANG KE-" + d,"|","JUMLAH","|","HARGA","|","TOTAL HARGA","|");
        System.out.println(" ==============================================================");
        for(int i = 0; i < a[d-1].length; i++){
            System.out.printf("%-3s %-13s %-3s %-7s %-3s %-10s %-3s %-13s %-3s%n","|",b[i],"|",a[d-1][i],"|",c[i],"|",(a[d-1][i] * c[i]),"|");
        }
        System.out.println(" --------------------------------------------------------------");
        System.out.printf("%-3s %-13s %-3s %-7s %-3s %-10s %-3s %-13s %-3s%n","|"," "," "," "," ","TOTAL",":",e[d-1],"|");
        System.out.println(" --------------------------------------------------------------");
    }
    static int[] menu2(int[] a, int[] b,String[] c ){
        int[] jumlahBaru = new int[4];
        for(int i = 0; i < jumlahBaru.length; i++){
            jumlahBaru[i] = a[i] - b[i];
        }
        System.out.println("TABEL DATA CABANG KE-4");
        System.out.println(" ==============================================================");
        System.out.printf("%-3s %-13s %-3s %-13s %-3s %-6s %-3s %-13s %-3s%n","|","CABANG KE-4","|","JUMLAH LAMA","|","MATI","|","JUMLAH BARU","|");
        System.out.println(" ==============================================================");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%-3s %-13s %-3s %-13s %-3s %-6s %-3s %-13s %-3s%n","|",c[i],"|",a[i],"|",b[i],"|",jumlahBaru[i],"|");
        }
        System.out.println(" --------------------------------------------------------------");
        return jumlahBaru;
    }
}
