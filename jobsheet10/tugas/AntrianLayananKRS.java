package jobsheet10.tugas;

public class AntrianLayananKRS {
    Mahasiswa18_1 data[];
    int front, rear, size, max, jthDPA;
    public AntrianLayananKRS(int max){
        this.max = max;
        data = new Mahasiswa18_1[max];
        size = 0;
        front = 0;
        rear = -1;
        jthDPA = 30;

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
            for(int i = 0; i < 2; i++){
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
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
    public void tambahAntrian(Mahasiswa18_1 mhs){
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        if (jtahDPA()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size ++;
            jthDPA --;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }else{
            System.out.println("Kuota DPA penuh");
        }
        
    }
    public Mahasiswa18_1 layaniMahasiswa(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa18_1 mhs = data[front];
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
    public boolean jtahDPA(){
        return jthDPA != 0;
    }
}
