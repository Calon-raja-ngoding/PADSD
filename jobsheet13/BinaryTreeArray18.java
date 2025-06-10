package jobsheet13;

public class BinaryTreeArray18 {
    Mahasiswa18 dataMahasiswa[];
    int idxLast;

    public BinaryTreeArray18(){
        this.dataMahasiswa = new Mahasiswa18[10];
    }

    void populateData(Mahasiswa18 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if (idxStart < 10) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                this.dataMahasiswa[idxStart].tampilkanInfomarmasi();
                traverseInOrder(2 * idxStart + 2);
            } 
        }
    }
     void traversePreOrder(int idxStart){
        if (idxStart < 10) {
            if (dataMahasiswa[idxStart] != null) {
                this.dataMahasiswa[idxStart].tampilkanInfomarmasi();
                traverseInOrder(2 * idxStart + 1);
                traverseInOrder(2 * idxStart + 2);
            } 
        }
    }
    void add(Mahasiswa18 dataMhs){
        int i = 0;
        while (i < this.dataMahasiswa.length && dataMahasiswa[i] != null) {
            if (dataMahasiswa[i].ipk >= dataMhs.ipk) {
                i = 2 * i + 1;
            }else{
                i = 2 * i + 2;
            }
        }
        this.dataMahasiswa[i] = dataMhs;
    }
}
