package jobsheet6;

public class MahasiswaBerprestasi18 {
    Mahasiswa18[] listMhs = new Mahasiswa18[5];
    int idx;
    void tambah(Mahasiswa18 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }
    void tampil(){
        for (Mahasiswa18 m : listMhs){
            m.tampilInformasi();
            System.out.println("-----------------");
        }
    }
    void bubbleSort(){
        for(int i = 0; i < listMhs.length; i++){
            for(int j = 1; j < listMhs.length; j++){
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa18 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i = 0; i < listMhs.length; i++){
            int idxMin = i;
            for(int j = i + 1; j < listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa18 temp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = temp;
        }
    }
    void insertionSort(){
        for(int i = 1; i < listMhs.length; i++){
            Mahasiswa18 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}