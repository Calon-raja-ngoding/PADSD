package jobsheet12.dll;

public class DoubleLinkedlist18 {
    Node18 head;
    Node18 tail;
    public DoubleLinkedlist18(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Mahasiswa18_2 input){
        Node18 ndInput = new Node18(input);
        if (isEmpty()) {
            head = tail = ndInput;
        }else{
            ndInput.next = head;
            head.prev = ndInput;
            head = ndInput;
        }
    }
    public void addLast(Mahasiswa18_2 input){
        if (isEmpty()) {
            addFirst(input);
        }else{
            Node18 ndInput = new Node18(input);
            tail.next = ndInput;
            ndInput.prev = tail;
            tail = ndInput;
        }
    } 
    public void insertAfter(String key, Mahasiswa18_2 input){
        Node18 ndInput = new Node18(input);
        Node18 current = search(key);
        if (current != null) {
            if (current == tail) {
            addLast(input);
            }else{
                ndInput.prev = current;
                ndInput.next = current.next;
                current.next.prev = ndInput;
                current.next = ndInput;
            }
            System.out.println("!! Data berhasil dimasukkan setelah datanya " + key + " !!" );
        }else{
            System.out.println("!! Kata kunci yg anda masukkan tidak ditemuka !!");
        }
    }
    public void printAll(){
        if (!isEmpty()) {
            Node18 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }else{
            System.out.println("!! Data masih kosong !!");
        }
    }
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("!! Data masih kosong !!");
        }else{
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah :");
            head.data.tampil();
            if (head.next == null) {
                head = tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
        }
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("!! Data masih kosong !!");
        }else{
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah :");
            tail.data.tampil();
            if (tail.prev == null) {
                head = tail = null;
            }else{
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
    public Node18 search(String key){
        if (isEmpty()) {
            System.out.println("!! Data masih kosong !!");
            return null;
        }else{
            Node18 current = head;
            while (current != null) {
                if (current.data.nim.equals(key)) {
                    break;
                }
                current = current.next;
            }
            return current;
        }
    }
    public void add(int key, Mahasiswa18_2 input){
        Node18 newNode = new Node18(input);
        Node18 temp = head;
        for(int i = 0; i < key - 1; i++){
            temp = temp.next;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    public void removeAfter(String key){
        Node18 current = search(key);
        if (current != null) {
            if (current.next == tail) {
            removeLast();
            }else{
                System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah :");
                current.next.data.tampil();
                current.next = current.next.next;
                current.next.prev = current;
            }
        }else{
            System.out.println("!! Kata kunci yg anda masukkan tidak ditemuka !!");
        }
    }
    public void remove(int key){
        if (key == 0) {
            removeFirst();
        }else{
            Node18 temp = head;
            for(int i = 0; i < key - 1; i++){
                temp = temp.next;
            }
            if (temp.next == tail) {
                removeLast();
            }else{
                temp.next = temp.next.next;
                temp.next.prev = temp;
            }
        }
    }
    public void getIndex(int key){
        Node18 temp = head;
        for(int i = 0; i < key; i++){
            temp = temp.next;
        }
        temp.data.tampil();
    }
    public int size(){
        Node18 current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
