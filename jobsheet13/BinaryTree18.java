package jobsheet13;
public class BinaryTree18 {
    Node18 root;
    public BinaryTree18(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void add(Mahasiswa18 mahasiswa){
        Node18 newNode = new Node18(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        }else{
            Node18 current = root;
            Node18 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    boolean find(double ipk){
        boolean result = false;
        Node18 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            }else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            }else{
                current = current.left;
            }
        }
        return result;
    }void traversePreOrder(Node18 node){
        if (node != null) {
            node.mahasiswa.tampilkanInfomarmasi();
            traverseInOrder(node.left);
            traverseInOrder(node.right);
        }
    }
    void traverseInOrder(Node18 node){
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilkanInfomarmasi();
            traverseInOrder(node.right);
        }
    }
    void traversePostOrder(Node18 node){
        if (node != null) {
            traverseInOrder(node.left);
            traverseInOrder(node.right);
            node.mahasiswa.tampilkanInfomarmasi();
        }
    }
    Node18 getSuccesor(Node18 del){
        Node18 successor = del.right;
        Node18 successorParent = del;
        while (successor.left != null) {
            successorParent =successor;
            successor = successor.left; 
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(double ipk){
        if (isEmpty()) {
            System.out.println("Binary Tree kosong");
            return;
        }
        // Cari Node yg akan dihapus
        Node18 parent = root;
        Node18 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            }else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }else{
                parent = current;
                current = current.left;
                isLeftChild = true;
            }
        }
        // Penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }else{
            // Jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null &&  current.right == null) {
                if (current == root) {
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if (current.left == null) {// Jika hanya punya 1 anak ( kanan )
                if (current == root) {
                    root = current.right;
                }else{
                    if (isLeftChild) {
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if (current.right == null) {// Jika hanya punya 1 anak ( kiri )
                if (current == root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{// Jika 2 anak
                Node18 successor = getSuccesor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilkanInfomarmasi();
                if (current == root) {
                    root = successor;
                }else {
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
    void addRekursif(Mahasiswa18 mhs, Node18 node){
        if (!isEmpty()) {
                if (mhs.ipk <= node.mahasiswa.ipk) {
                    if (node.left != null) {
                        addRekursif(mhs, node.left);
                    }else{
                        node.left = new Node18(mhs);}
                }else{
                    if (node.right != null) {
                        addRekursif(mhs, node.right);
                    }else{
                        node.right = new Node18(mhs);}
                }
        }else{
            root = new Node18(mhs);
        }
    }
    void cariMinIPK(){
        Node18 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Data mahasiswa dengan IPK terkecil :");
        current.mahasiswa.tampilkanInfomarmasi();
    }
    void cariMaxIPK(){
        Node18 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Data mahasiswa dengan IPK terbesar :");
        current.mahasiswa.tampilkanInfomarmasi();
    }
    void tampilMahasiswaIPKdiAtas(double ipkBatas,Node18 node){
        if (node != null) {
            tampilMahasiswaIPKdiAtas(ipkBatas, node.left);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilkanInfomarmasi();
            }
            tampilMahasiswaIPKdiAtas(ipkBatas, node.right);
        }
    }
}    