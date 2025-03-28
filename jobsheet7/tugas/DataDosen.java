package jobsheet7.tugas;

public class DataDosen {
    int elemen;
    Dosen[] dataDosen;
    DataDosen(int elm){
        this.elemen = elm;
        dataDosen = new Dosen[elm];
    }
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
    int[] sequntialSarching(String cari){
        int jumlah = 0;
        for(int i = 0; i < elemen; i++){
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                jumlah++;
            }
        }
        int posisi[] = new int[jumlah];
        int index = 0;
        for(int i = 0; i < elemen; i++){
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                posisi[index] = i;
                index++;
            }
        }
        return posisi;
    }
    void tampilDataSearch(String x, int[] pos){
        if (pos.length != 0) {
            System.out.println("Data dosen dengan nama : " + x + " ditemukan di : ");
            for(int i = 0; i < pos.length; i++){
                System.out.println("  - Index " + pos[i]);
                System.out.println("    - kode\t : " + dataDosen[pos[i]].kode);
                System.out.println("    - nama\t : " + dataDosen[pos[i]].nama);
                System.out.println("    - jenis kelamin\t : " + dataDosen[pos[i]].jnsKlminBooleanToString(dataDosen[pos[i]].jenisKelamin));
                System.out.println("    - usia\t : " + dataDosen[pos[i]].usia);
                System.out.println("------------");
            }
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    int[] findBinarySearch(int cari, int left, int right){
        int jumlah = 0;
        for(int i = 0; i < elemen; i++){
            if (dataDosen[i].usia == cari) {
                jumlah++;
            }
        }
        int mid;
        int[] pss = new int[jumlah];
        int index = 0;
        if (right >= left){
            mid = (left + right) / 2;
            if (cari == dataDosen[mid].usia){
                pss[index] = mid;
                index ++;
                int idx = mid + 1;
                while (true) {
                    if (idx < elemen && dataDosen[idx].usia == cari) {
                        pss[index] = idx;
                        index ++;
                        idx ++;
                    }else{
                        break;
                    }
                }
                idx = mid - 1;
                while (true) {
                    if (idx > -1 && dataDosen[idx].usia == cari) {
                        pss[index] = idx;
                        index ++;
                        idx --;
                    }else{
                        break;
                    }
                }
                return pss;
            }else if (dataDosen[mid].usia > cari) {
                return findBinarySearch(cari, left, mid - 1);
            }else{
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return pss;
    }
    void tampilDataSearch2(int x, int[] pos){
        if (pos.length != 0) {
            System.out.println("Data dosen dengan usia : " + x + " ditemukan di : ");
            for(int i = 0; i < pos.length; i++){
                System.out.println("  - Index " + pos[i]);
                System.out.println("    - kode\t : " + dataDosen[pos[i]].kode);
                System.out.println("    - nama\t : " + dataDosen[pos[i]].nama);
                System.out.println("    - jenis kelamin\t : " + dataDosen[pos[i]].jnsKlminBooleanToString(dataDosen[pos[i]].jenisKelamin));
                System.out.println("    - usia\t : " + dataDosen[pos[i]].usia);
                System.out.println("------------");
            }
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
