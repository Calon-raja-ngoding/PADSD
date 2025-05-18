package jobsheet10.p2;

public class AntrianLayana {
    Mahasiswa data[];
    int front, rear, size, max;
    public AntrianLayana(int max){
        this.max = max;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;

    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == max;
    }
    public void lihatTerdepan(){
        if (!isEmpty()) {
            System.out.println("Mahasiswa terdepan :");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }else{
            System.out.println("Antrian kosong");
        }
    }
    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }
        System.out.println("Daftar Mahasiswa dalam Antrian : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for(int i = 0; i < size; i++){
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public void tambahAntrian(Mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size ++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }
    public Mahasiswa layaniMahasiswa(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size --;
        return mhs;
    }
    public void  clear(){
        size = 0;
        front = rear = -1;
    }
    public int getJumlahAntrian(){
        return size;
    }
    public void lihatAkhir(){
        if (!isEmpty()) {
            System.out.println("Mahasiswa terakhir :");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }else{
            System.out.println("Antrian kosong");
        }
    }
}
