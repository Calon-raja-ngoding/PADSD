|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020114|
| Nama |  Nabil Hanief Mafazi |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Calon-raja-ngoding/PADSD.git) |

# SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)
## 6.2 Mengimplementasikan Sorting menggunakan object

 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20193636.png)
***
**Penjelesan singkat:** 
Disini ada 4 step utama: 

1.  **Menyiapkan Struktur Data**
    -   Gunakan array untuk menyimpan angka yang akan diurutkan.
    -   Buat kelas `Sorting18` untuk mengelola sorting.
2.  **Membuat Kelas `Sorting18`**
    -   Konstruktor untuk mengisi array.
    -   Metode `bubbleSort()`, `selectionSort()`, dan `insertionSort()` untuk sorting
    -   Metode `tampil()` untuk menampilkan data.
3.  **Membuat Kelas `SortingMain`**
    -   Inisialisasi array data.
    -   Buat objek `Sorting18` untuk tiap array.
    -   Tampilkan data awal, urutkan dengan `bubbleSort()`, lalu tampilkan hasilnya.
4.  **Menjalankan dan Memeriksa Hasil**
    -   Jalankan program, periksa apakah sorting berfungsi dengan benar.
 ***
  **Pertanyaan :**
  1. **Jelaskan fungsi kode program berikut**

	     if (data[j  -  1] >  data[j]){
		    temp  =  data[j];
		    data[j] =  data[j  -  1];
		    data[j  -  1] =  temp;
		 }

   - Kode itu menukar dua elemen dalam array jika elemen sebelumnya lebih besar dari elemen sekarang. Ini digunakan dalam algoritma **Bubble Sort** untuk mengurutkan data dengan cara menggeser nilai yang lebih besar ke posisi yang lebih tinggi.
 2. **Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!**

	    int  j  =  i  +  1; j  <  jumData; j++

 3. **Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan .** 

	     while (j  >=  0  &&  data[j] >  temp){

  - program akan terus mengulang sampai tidak memenuhi syarat `(j  >=  0  &&  data[j] >  temp)` untuk melakukan langkah selanjutnya.
 
4. **Pada Insertion sort, apakah tujuan dari perintah**

	    data[j  +  1] =  data[j];

-  Mengubah isi dari `data[j +1]` menjadi isi dari `data[j]` .

	
***
## 6.3 (Sorting Menggunakan Array of Object)


 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20191507.png)	
***
**Penjelesan singkat:** 
Disini ada 4 step utama: 
1.  **Membuat Kelas `Mahasiswa18`**
    -   Menyediakan atribut `nim`, `nama`, `kelas`, dan `ipk`.
    -   Konstruktor untuk menginisialisasi atribut.
    -   Metode `tampilInformasi()` untuk menampilkan data mahasiswa.
2.  **Membuat Kelas `MahasiswaBerprestasi18`**
    -   Menyediakan array `listMhs` untuk menyimpan daftar mahasiswa.
    -   Metode `tambah()` untuk menambahkan mahasiswa ke dalam array.
    -   Metode `tampil()` untuk menampilkan daftar mahasiswa.
    -   Metode `bubbleSort()` untuk mengurutkan mahasiswa berdasarkan IPK secara **descending**.
    -   Metode `selectionSort()` untuk mengurutkan mahasiswa berdasarkan IPK secara **ascending**.
3.  **Membuat Kelas `MahasiswaDemo18` (Main Class)**
    -   Membuat objek `MahasiswaBerprestasi18`.
    -   Menambahkan beberapa mahasiswa ke dalam daftar.
    -   Menampilkan data sebelum sorting
    -   Mengurutkan data dengan **Bubble Sort (Descending)** lalu menampilkannya.
    -   Mengurutkan data dengan **Selection Sort (Ascending)** lalu menampilkannya.
4.  **Menjalankan Program**
    -   Menampilkan data mahasiswa sebelum sorting.
    -   Menampilkan hasil pengurutan berdasarkan IPK dari tinggi ke rendah (**Bubble Sort**).
    -   Menampilkan hasil pengurutan berdasarkan IPK dari rendah ke tinggi (**Selection Sort**). ***
  **Pertanyaan :**
  1. **Perhatikan perulangan di dalam bubbleSort() di bawah ini:**

	      for(int  i  =  0; i  <  listMhs.length; i++){
		    for(int  j  =  1; j  <  listMhs.length; j++){

- a. Mengapa syarat dari perulangan `i` adalah `i < listMhs.lenght - 1` ?
	- karena Perulangan `i` berjalan hingga `listMhs.length - 1` karena setelah `n-1` iterasi, seluruh elemen sudah berada di posisi yang benar, jadi tidak perlu iterasi tambahan.
- b. Mengapa syarat dari perulangan `j` adalah `j < listMhs.lenght` ?
	- Perulangan `j` berjalan hingga `listMhs.length - i` karena setelah setiap iterasi `i`, elemen terbesar sudah berada di posisi akhirnya, sehingga jumlah perbandingan berkurang seiring iterasi.
- c. Jika banyak data di dalam `listMhs` adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?  
	- Perulangan `i` berlangsung **49 kali** (`50 - 1`).
	- Tahap (pass) Bubble Sort yang ditempuh juga **49 tahap**, karena setiap iterasi `i` disebut sebagai satu tahap pengurutan. 
 2. **Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!**
 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20211050.png)
  ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20214153.png)
 ***
## 6.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20193448.png)
 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20193505.png)
 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20193534.png)
 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20193541.png)

***
**Penjelesan singkat:** 
Disini ada 3 step utama: 
1.  **Menambahkan Metode `insertionSort()` di Kelas `MahasiswaBerprestasi18`**
    -   Metode ini mengurutkan mahasiswa berdasarkan **IPK secara ascending** menggunakan **Insertion Sort**.
    -   Algoritma membandingkan elemen saat ini dengan elemen sebelumnya dan menyisipkannya pada posisi yang sesuai.
2.  **Memperbarui Kelas `MahasiswaDemo18`**
    -   Menambahkan pemanggilan `insertionSort()` setelah `selectionSort()`.
    -   Menampilkan hasil pengurutan menggunakan **Insertion Sort (Ascending)**.
3.  **Menjalankan Program**
    -   Menampilkan data mahasiswa sebelum sorting.
    -   Mengurutkan data dengan **Bubble Sort (Descending)** dan menampilkannya.
    -   Mengurutkan data dengan **Selection Sort (Ascending)** dan menampilkannya.
    -   Mengurutkan data dengan **Insertion Sort (Ascending)** dan menampilkannya.
 ***
  **Pertanyaan :**
  1. **Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending**

		    void  insertionSort(){
					for(int  i  =  1; i  <  listMhs.length; i++){
						Mahasiswa18  temp  =  listMhs[i];
						int  j  =  i;
						while (j  >  0  &&  listMhs[j  -  1].ipk  <  temp.ipk) {
							listMhs[j] =  listMhs[j  -  1];
							j--;
						}
						listMhs[j] =  temp;
					}
			}

 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20235729.png)
***
## Tugas 1

 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20231201.png)
  ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20231233.png)
 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20231306.png)
 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20231341.png)
 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20231400.png)
 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20231418.png)
 ![Screenshot](/jobsheet6/img/Screenshot%202025-03-27%20231428.png)

***
**Penjelesan singkat:** 
Disini ada 3 step utama: 
### **Alur Pembuatan Program**
1.  **Membuat Class `Dosen`**
    -   Menyimpan atribut dosen: `kode`, `nama`, `jenisKelamin`, `usia`.
    -   Metode `tampil()` untuk menampilkan informasi dosen.
    -   Metode `jnsKlminBooleanToString()` untuk mengonversi jenis kelamin dari boolean ke teks ("Pria"/"Wanita").
2.  **Membuat Class `DataDosen`**
    -   Array `dataDosen` untuk menyimpan maksimal 10 data dosen.
    -   Metode `tambah(Dosen dsn)` untuk menambahkan data dosen ke dalam array.
    -   Metode `tampil()` untuk menampilkan seluruh data dosen.
    -   **Sorting Methods**:
        -   `sortingASC()` → Bubble Sort **(Usia ASCENDING - dari muda ke tua)**.
        -   `sortingDsc()` → Selection Sort **(Usia DESCENDING - dari tua ke muda)**.
        -   `insertionSort()` → Insertion Sort **(Usia DESCENDING - dari tua ke muda)**.
3.  **Membuat Class `DosenMain` (Main Program)**
    -   Menggunakan `Scanner` untuk input data 10 dosen dari user.
    -   Data dosen dimasukkan ke dalam objek `Dosen` dan ditambahkan ke `DataDosen`.
    -   Menampilkan **data sebelum sorting**.
    -   Menjalankan **Bubble Sort (ASC), Selection Sort (DSC), dan Insertion Sort (DSC)** untuk mengurutkan data berdasarkan usia.
    -   Menampilkan **data setelah sorting**.
***
## Terima Kasih :)








 