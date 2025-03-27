package jobsheet6.tugas;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx;
    void tambah(Dosen dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }else{
            System.out.println("Jumlah maksimal dosen telah tercapai");
        }
    }
    void tampil(){
        for (Dosen dosen : dataDosen) {
            dosen.tampil();
            System.out.println("----------------");
        }
    }
    void sortingASC(){
        for(int i = 0; i < dataDosen.length; i++){
            for(int j = 1; j < dataDosen.length; j++){
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }
    void sortingDsc(){
        for(int i = 0; i < dataDosen.length; i++){
            int idxMin = i;
            for(int j = i + 1; j < dataDosen.length; j++){
                if (dataDosen[j].usia > dataDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen temp = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
    void insertionSort(){
        for(int i = 1; i < dataDosen.length; i++){
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
