package jobsheet13;
public class BinaryTreeArrayMain18 {
    public static void main(String[] args) {
        BinaryTreeArray18 bta = new BinaryTreeArray18();
        Mahasiswa18 mhs6 = new Mahasiswa18("244160205", "Ehsan", "D", 3.61);//5
        Mahasiswa18 mhs1 = new Mahasiswa18("244160121", "Ali", "A", 3.57);//4
        Mahasiswa18 mhs5 = new Mahasiswa18("244160131", "Devi", "A", 3.48);//3
        Mahasiswa18 mhs4 = new Mahasiswa18("244160220", "Dewi", "B", 3.35);//1
        Mahasiswa18 mhs7 = new Mahasiswa18("244160170", "Fizi", "B", 3.86);//7

        Mahasiswa18 mhs2 = new Mahasiswa18("244160221", "Badar", "B", 3.41);//2
        Mahasiswa18 mhs3 = new Mahasiswa18("244160185", "Candra", "C", 3.75);//6

        Mahasiswa18[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        for(int i = 0; i < 7; i++){
            bta.add(dataMahasiswa[i]);
            System.out.println("Berhasil memasukkan data dari " + dataMahasiswa[i].nama);
        }
        System.out.println("\nInOrder Traversal Mahasiswa :");
        bta.traverseInOrder(0);
        System.out.println("\nPreOrder Traversal Mahasiswa :");
        bta.traversePreOrder(0);
    }
}
