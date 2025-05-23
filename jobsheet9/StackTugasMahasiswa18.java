public class StackTugasMahasiswa18 {
    Mahasiswa18 stack[];
    int size, top;

    public StackTugasMahasiswa18(int sz){
        size = sz;
        stack = new Mahasiswa18[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size - 1) {
            return true;
        }else{ return false; }
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{ return false; }
    }
    public void push(Mahasiswa18 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Mahasiswa18 pop(){
        if (!isEmpty()) {
            Mahasiswa18 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Mahasiswa18 peek(){
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpul.");
            return null;
        }
    }
    public void print(){
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    public Mahasiswa18 dataFirst(){
        if (!isEmpty()) {
            return stack[0];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpul.");
            return null;
        }
    }
    public int jmlhTgs(){
        return (top + 1);
    }
    String konversiDesimalKeBiner(int nilai) {
        StackKonversi stack = new StackKonversi();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai /= 2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}