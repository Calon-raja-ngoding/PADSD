
|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020114|
| Nama |  Nabil Hanief Mafazi |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Calon-raja-ngoding/PADSD.git) |
# Searching / Pencarian Menggunakan Agoritma Sequential Search
## 7.2 Mengimplementasikan Sorting menggunakan object

 ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20181514.png)
***
**Penjelesan singkat:** 
Disini ada 3 step utama: 
#### **1. Membuat Class `Mahasiswa18`**
-   Berisi atribut: `nim`, `nama`, `kelas`, dan `ipk`.
-   Konstruktor untuk inisialisasi data mahasiswa.
-   Metode `tampilInformasi()` untuk menampilkan data mahasiswa.
#### **2. Membuat Class `MahasiswaBerprestasi18`**
-   Menyimpan array `listMhs` untuk menampung 5 mahasiswa.
-   Metode `tambah(Mahasiswa18 m)` untuk menambahkan mahasiswa ke dalam array.
-   Metode `tampil()` untuk menampilkan seluruh data mahasiswa.
-   Metode `sequentialSearching(double cari)` untuk mencari mahasiswa berdasarkan IPK menggunakan pencarian linear.
-   Metode `tampilPosisi()` dan `tampilDatasearch()` untuk menampilkan hasil pencarian.
#### **3. Membuat Class `MahasiswaDemo18` (Main Program)**
-   Menggunakan `Scanner` untuk input data mahasiswa dari user.
-   Memasukkan data mahasiswa ke dalam objek `MahasiswaBerprestasi18`.
-   Menampilkan seluruh data mahasiswa yang telah dimasukkan.
-   Meminta user untuk memasukkan IPK yang ingin dicari.
-   Mencari IPK menggunakan metode sequential search dan menampilkan hasilnya.
 ***
  **Pertanyaan :**
  1. **Jelaskan perbedaan metod tampil`DataSearch` dan `tampilPosisi` pada class**
	   - Perbedaannya ada dibagian yg akan ditampilkan, `tampilDataSearch()` menampilkan data data dari mahasiswa yang memiliki ipk yg sama dengan yang dicari sedangkan `tampilPosisi()` hanya menampilkan posisi dari index yg memiliki ipk yg sama dengan yang dicari.
 2. **Jelaskan fungsi break pada kode program dibawah ini!**

	    if (listMhs[i].ipk  ==  cari) {
	    posisi  =  i;
	    break;
	    }
	- untuk memberhentikan program jika sudah menemukan ipk yg sama dengan yg dicari.
***
## 7.3 Searching / Pencarian Menggunakan Binary Search


 ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20142332.png)
 
![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20142350.png)	
***
**Penjelesan singkat:** 
Disini ada 2 step utama: 
1.  **Menambahkan Binary Search**
    -   Ditambahkan metode `findBinarySearch(double cari, int left, int right)` dalam `MahasiswaBerprestasi18`.
    -   Metode ini mencari mahasiswa berdasarkan IPK menggunakan **rekursi** dan membandingkan nilai tengah.
2.  **Memperbarui `MahasiswaDemo18`**
    -   Setelah **Sequential Search**, ditambahkan proses pencarian menggunakan **Binary Search**.
    -   User diminta memasukkan kembali IPK yang ingin dicari dengan Binary Search.
    ***
  **Pertanyaan :**
  1. **Tunjukkan pada kode program yang mana proses divide dijalankan!**
	
		-	mid  = (left  +  right) /  2;

 2. **Tunjukkan pada kode program yang mana proses conquer dijalankan!**

	- 		if (cari  ==  listMhs[mid].ipk){
				   return (mid);
			    }else  if (listMhs[mid].ipk  >  cari) {
			   	   return  findBinarySearch(cari, left, mid  -  1);
			    }else{
				   return  findBinarySearch(cari, mid  +  1, right);
		    }
3. **Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian!**
	- Program akan tetap berjalan tapi hasilnya tidak akan benar karna  cara kerja binary search itu mencari nilai tengah dari array lalu membandingkannya dengan data yang dicari apakah sama atau tidak jika tidak dia akan membandingkannya lagi apakah lebih besar atau lebih kecil jika lebih besar maka dia akan  mencari ke bagian lebih besar begitupun sebaliknya. maka dari itu data harus terurut. tapi ada beberapa kasus program akan benar walaupun data tidak terurut, salah satunya adalah data yang dicari berada pas di indeks ditengah.
4. **Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (missal : 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai**
	- tidak akan sesusai, agar sesuai modifikasi sedikit method findBinarySearch() seperti kode  dibawah :

		    int  findBinarySearch(double  cari, int  left, int  right){
			    int  mid;
			    if (right  >=  left){
					  mid  = (left  +  right) /  2;
				    if (cari  ==  listMhs[mid].ipk){
					    return (mid);
				    }else  if (listMhs[mid].ipk  <  cari) {
					    return  findBinarySearch(cari, left, mid  -  1);
				    }else{
					    return  findBinarySearch(cari, mid  +  1, right);
				    }
			    }
			    return  -1;
		    }
	-  ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20152059.png)
 5. **Modifikasilah program diatas yang mana jumlah mahasiswa yang di inputkan sesuai dengan masukan dari keyboard.**
	-  ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20161452.png)
***
## Tugas 1

 ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20175058.png)

 ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20175115.png)

***
**Penjelesan singkat:** 
Disini ada 4 step utama: 
1.  **Buat Kelas `Dosen`**
    -   Atribut: `kode`, `nama`, `jenisKelamin` (boolean), `usia`.
    -   Method:
        -   `tampil()` → Menampilkan data dosen.
        -   `jnsKlminBooleanToString()` → Konversi gender boolean ke string.
2.  **Buat Kelas `DataDosen`**
    -   Atribut: Array `dataDosen`, `elemen`, `idx`.
    -   Method:
        -   `tambah(Dosen dsn)` → Menambah dosen ke array.
        -   `tampil()` → Menampilkan semua dosen.
        -   Sorting: `sortingASC()`, `sortingDsc()`, `insertionSort()`.
        -   Searching: `sequentialSearching(nama)`, `findBinarySearch(usia)`.
        -   `tampilDataSearch()` & `tampilDataSearch2()` → Menampilkan hasil pencarian.
3.  **Buat Kelas `DosenMain`** (Program Utama)
    -   Input jumlah dosen & data.
    -   Sorting data sebelum Binary Search.
    -   Cari dosen berdasarkan **nama (Sequential Search)** & **usia (Binary Search)**.
    -   Tampilkan hasil pencarian.
4.  **Uji Coba*****
## Terima Kasih :)

