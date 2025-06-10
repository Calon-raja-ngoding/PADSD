package jobsheet13;

public class BinaryTreeMain18 {
    public static void main(String[] args) {
        BinaryTree18 bst = new BinaryTree18();

        bst.addRekursif(new Mahasiswa18("244160121", "Ali", "A", 3.57), bst.root);
        bst.addRekursif(new Mahasiswa18("244160221", "Badar", "B", 3.85), bst.root);
        bst.addRekursif(new Mahasiswa18("244160185", "Candra", "C", 3.21), bst.root);
        bst.addRekursif(new Mahasiswa18("244160220", "Dewi", "B", 3.54), bst.root);

        System.out.println("\nDaftar semua Mahasiswa (In oder traversal) :");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data Mahasiswa : ");
        System.out.println("cari Mahasiswa dengan ipk : 3.54 ");
        String hasilCari = bst.find(3.54)?"Ditemukan":"Tiidak Ditemukan";
        System.out.println(hasilCari);

        System.out.println("cari Mahasiswa dengan ipk : 3.22 ");
        hasilCari = bst.find(3.22)?"Ditemukan":"Tiidak Ditemukan";
        System.out.println(hasilCari);
        
        bst.addRekursif(new Mahasiswa18("244160131", "Devi", "A", 3.72), bst.root);
        bst.addRekursif(new Mahasiswa18("244160205", "Ehsan", "D", 3.37), bst.root);
        bst.addRekursif(new Mahasiswa18("244160170", "Fizi", "B", 3.46), bst.root);
        System.out.println("\nDaftar semua Mahasiswa setelah penambahan 3 Mahasiswa :");
        System.out.println("In Order Traversal :");
        bst.traverseInOrder(bst.root);
        System.out.println("Pre Order Traversal :");
        bst.traversePreOrder(bst.root);
        System.out.println("Post Oreder Traversal :");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan Mahasiswa");
        bst.delete(3.57);
        System.out.println("Daftar Mahahasiswa setelah penghapusan 1 Mahasiswa (In order Traversal)");
        bst.traverseInOrder(bst.root);
        System.out.println();
        bst.cariMaxIPK();
        bst.cariMinIPK();
        System.out.println();
        System.out.println("Data Mahasiswa dengan IPK diatas 3.40");
        bst.tampilMahasiswaIPKdiAtas(3.40, bst.root);
    }
}
