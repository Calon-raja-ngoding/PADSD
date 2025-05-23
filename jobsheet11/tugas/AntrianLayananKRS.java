package jobsheet11.tugas;

public class AntrianLayananKRS {
    Mahasiswa18_1 data[];
    Node head;
    Node tail;
    int size, max, jthDPA;
    public AntrianLayananKRS(){
        this.max = 10;
        size = 0;
        jthDPA = 30;

    }
    public boolean isEmpty(){
        return head == null;
    }
    public boolean isFull(){
        return size == max;
    }
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi linked list :");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Antrian kosong");
        }
    }
    public void addFirst(Mahasiswa18_1 input){
        if (!isFull()) {
                Node ndInput = new Node(input, null);
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
            } else{
                ndInput.next = head;
                head = ndInput;
            }
            size++;
        }else{
            System.out.println("Antrian penuh");
        }
    }
    public void insertAt(int index, Mahasiswa18_1 input){
        if (!isFull() ) {
            if (index < 0) {
                System.out.println("indeks salah");
            }else if (index == 0) {
                addFirst(input);
            }else{
                Node temp = head;
                for(int i = 0; i < index - 1; i++){
                    temp = temp.next;
                }
                temp.next = new Node(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;  
                }
            }
        }else{
            System.out.println("Antrian penuh");
        }
    }
    public void getData(int index){
        if (!isEmpty()) {
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            temp.data.tampilkanInformasi();
        }else{
            System.out.println("Antrian kosong");
        }
    }
    public Mahasiswa18_1 memanggil(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
            return null;
        }else if (head == tail) {
            Node temp = tail;
            head = tail = null;
            return temp.data;
        }else{
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            Node rtrn = tail;
            temp.next = null;
            tail = temp;
            return rtrn.data;
        }
    }
}
