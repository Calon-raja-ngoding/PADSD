package jobsheet6;

public class SortingMain {
    public static void main(String[] args) {
        int[] a = {20, 10, 2, 7, 1}, b = {30, 20, 2, 8, 14}, c = {40, 10, 4, 9, 3};
        

        Sorting18 dataurut1 = new Sorting18(a, a.length);
        Sorting18 dataurut2 = new Sorting18(b, b.length);
        Sorting18 dataurut3 = new Sorting18(c, c.length);

        System.out.println("Data awal 1");
        System.out.println("-----------");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("------------------------");
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
        System.out.println("========================");
        System.out.println("Data awal 2");
        System.out.println("-----------");
        dataurut2.tampil();
        dataurut2.bubbleSort();
        System.out.println("------------------------");
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut2.tampil();
        System.out.println("========================");
        System.out.println("Data awal 3");
        System.out.println("-----------");
        dataurut3.tampil();
        dataurut3.bubbleSort();
        System.out.println("------------------------");
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut3.tampil();
    }
}
