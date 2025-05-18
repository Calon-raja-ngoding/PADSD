package tugas;
public class StackSurat18 {
    Surat18[] stackSurat    ;
    int size, top = -1;

    public StackSurat18(int sz){
        size = sz;
        stackSurat = new Surat18[sz];
    }
    public void tampilSurat(Surat18 surat){
        System.out.println("====================");
        System.out.println(" - ID Surat           : " + surat.idSurat);
        System.out.println(" - Nama Mahasiswa     : " + surat.namaMahasiswa);
        System.out.println(" - Kelas              : " + surat.kelas);
        System.out.println(" - Jenis Izin         : " + surat.jenisIzin);
        System.out.println(" - Durasi             : " + surat.durasi);
        System.out.println("====================");
    }
    public boolean isFull(){
        return top == size -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void terimaSuratIzin(Surat18 surat){
        if (isFull()) {
            System.out.println(" !!! Stack Penuh");
        }else{
            top++;
            stackSurat[top] = surat;
        }
    }
    public Surat18 prosesSuratIzin(){
        if (isEmpty()) {
            System.out.println(" !!! Stack Kosong");
            return null;
        }else{
            top --;
            return stackSurat[top + 1];
        }
    }
    public void lihatSuratIzinTerakhir(){
        if (isEmpty()) {
            System.out.println(" !!! Stack Kosong");
        }else{
            tampilSurat(stackSurat[top]);
        }
    }
    public void cariSurat(String cari){
        for(int i = 0; i <= top; i++){
            if (stackSurat[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                tampilSurat(stackSurat[i]);
            }
        }
    }
}
