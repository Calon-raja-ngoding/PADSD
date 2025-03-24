|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020114|
| Nama |  Nabil Hanief Mafazi |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Calon-raja-ngoding/PADSD.git) |

# ARRAY OF OBJECT
## 5.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

![Screenshot](/jobsheet5/img/image.png)
***
**Penjelesan singkat:** 
Disini ada 8 step utama: 

1. **Mendeklarasikan class :**
   - `Faktorial.java`
2.  **Mendeklarasikan Methode :**
    -   **faktorialBF** int
    -   **faktorialDC** int
3.  **Mendeklarasikan class :**
    -   `faktorialMain` .
4. **Membuat object**
5. **Mendeklarasikan Scanner**
6. **Input Nilai Menggunakan Scanner**
7. **Menghitung Nilai Menggunakan Method Dari Objek**
8. **Menampilkan Hasil**
 ***
  **Pertanyaan :**
  1. **Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!**
   - Perbedaannya itu adalah if bekerja sebagai base casenya atau tanda berhentinya, jadi selama belum mencapai syarat base casenya maka perulangan rekursifnya maka terus berulang .
 2. **Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!**
  -  Bisa, kita bisa menggunakan while seperti code dibawah .

		    int  faktorialBF(int  n){
				    int  fakto  =  1;
					while (n  !=  0) {
						    fakto  =  fakto  * (n--);
				    }
				    return  fakto;
		    }

 
 3. **Jelaskan perbedaan antara `fakto *= i;` dan `int fakto = n * faktorialDC(n-1);` !**
`arrayOfMahasiswa = new Mahasiswa[3]` . 
  - `fakto *= i;` sama saja dengan `fakto = fakto * i;` nah itu adalah kode aritmatika biasa sedangkan `int fakto = n * faktorialDC(n-1);` adalah sebuah operasi dalam rekursif .  
 
4. **Buat Kesimpulan tentang perbedaan cara kerja method `faktorialBF()` dan `faktorialDC()`!**

-  `faktoBF()` adalah method yang menggunakanan perulangan biasa seperti for, while, dll untuk menghitung faktorial, sedangkan `faktoDC()` menggunakan rekursif untuk menghitung faktorialnya .

	
***
## 5.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer


 ![Screenshot](/jobsheet5/img/Screenshot%202025-03-24%20230800.png)	
***
**Penjelesan singkat:** 
Disini ada 9 step utama: 

1. **Mendeklarasikan class**
  - `Pangkat.java`
2.  **Mendeklarasikan attribute dan methodnya**
 - attribute :
	 - `int nilai;` .
	 - `int pangkat;` .
- method :
	- `int pangkatBF()` .
	- `int pangkatDC()`   
3. **Mendeklarasikan konstruktor**
4. **Mendeklarasikan class**
- `MainPangkat.java` .
5. **Mendeklarasikan Scanner**
6. **Membuat Object Dengan array**
7. **Melengkapi attribute dari object menggunakan Scanner**
8. **Menghitung Hasil menggunakan method dari object**
9. **Menampilkan Hasilnya**
 ***
  **Pertanyaan :**
  1. **Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!**
- Sama seperti percobaan 1, `pangkatBF()` menggunakan perulangan biasa untuk menghitung hasilnya, sedangkan `pangkatDC()` menggunakan rekursif untuk menghitung hasilnya .
 2. **Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!**

- Ada, terdapat di method `pangkatDC()` , karena di`pangkatDC()` kita menggabungkan sub masalah untuk mendapatkan hasil akhir, seperti kode dibawah .

	    return (pangkatDC(a, n  /  2) *  pangkatDC(a, n  /  2) *  a);
- seperti contoh diatas kita mengalikan 2 * 2 dan 2 * 2 lalu mengalikannya 2 untuk mendapat hasil akhir jika kita menginginkan hasil dari  2 ^ 5 .
3. **Pada method `pangkatBF()`terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method `pangkatBF()` yang tanpa parameter?**
- Menurut saya tidak relevan untuk menambahkan parameter karna tidak diperlukan pada percobaan ini, kita bisa menghapus paramameternya, seperti contoh dibawah .

	    int  pangkatBF(){
			 int  hasil  =  1;
			 for(int  i  =  0; i  <  pangkat; i++){
				   hasil  =  hasil  *  nilai;
			 }
			 return  hasil;
	    }
4. **Tarik tentang cara kerja method `pangkatBF()` dan `pangkatDC()`!**
- Metode `pangkatBF()` menghitung pangkat dengan mengalikan nilai secara berulang sebanyak pangkatnya, sedangkan `pangkatDC()` menggunakan metode divide and conquer dengan membagi pangkat menjadi setengah, menghitungnya secara rekursif, lalu menggabungkan hasilnya melalui perkalian, sehingga lebih efisien dari segi waktu.
 ***
## 3.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

 ![Screenshot](/jobsheet5/img/Screenshot%202025-03-24%20231020.png)

***
**Penjelesan singkat:** 
Disini ada 4 step utama: 



1.   **Buat class `Sum`**
-   Tambahkan atribut array `keuntungan[]`.
-   Buat constructor untuk inisialisasi array sesuai jumlah elemen.
-   Buat method `totalBF()` untuk menghitung total dengan perulangan.
-   Buat method `totalDC()` untuk menghitung total secara rekursif (divide and conquer).

3.    **Buat class `MainSum`**
-   Gunakan `Scanner` untuk input jumlah elemen.
-   Buat objek dari class `Sum`.
-   Input nilai-nilai keuntungan dan simpan ke array.
-   Panggil dan tampilkan hasil dari `totalBF()` dan `totalDC()`.

4.    **Jalankan program untuk melihat perbandingan hasil antara metode brute force dan divide & conquer.**
 ***
  **Pertanyaan :**
  1. **Kenapa dibutuhkan variable `mid` pada method `TotalDC()` ?**
 - Variable `mid` dibutuhkan untuk mencapai base case dalam fungsi rekursif di method `TotalDC()` dan sebagai nilai tengah untuk pemisah perhitungan `lsum` dan `rsum` karna `lsum` akan menjumlah kan semua keuntungan dari indeks <= (`mid` atau `mid` + 1) sedangkan `rsum` menjumlahkan semua indeks > (`mid` atau `mid` + 1) baru akhirsnya keduanya dijumlahkan .
 2. **Untuk apakah statement di bawah ini dilakukan dalam `TotalDC()` ?**

	    double  lsum  =  totalDC(arr, l, mid);
	    double  rsum  =  totalDC(arr, mid  +  1, r);
- Statement diatas digunakan menghitung total keuntungan dari suatu objek menggunakan rekursif.

3. **Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?**

	    return lsum+ rsum;

  - Seperti penjelasan saya dijawaban nomor 1, karna `lsum` digunakan untuk menjumlahkan semua keuntungan dari indeks <= (`mid` atau `mid` + 1) sedangkan `rsum` digunakan untuk menjumlahkan semua keuntungan dari indeks > (`mid` atau `mid` + 1) maka dari itu kita harus menjumlahkan keduanya untuk mendapatkan total keuluruhan dari semua indeks.

4. **Apakah base case dari totalDC()?**


- Base casenya adalah l == r seperti yg tertera pada kode dibawah

	    if (l  ==  r) {
	    return  arr[l];
	    }

5. **Tarik Kesimpulan tentang cara kerja totalDC()**
- TotalDC() digunakan untuk mendapatkan total keuntunga dari suatu objek dengan cara devide and conquer, di mehtod ini ada 3 variable yaitu mid, lsum, dan rsum dimana mid digunakan untuk nilai tengah dari elemen sekaligus variable yang membantu untuk mencapai base case dari fungsi rekursif di method ini. sedangkan untuk lsum dan rsum digunakan untuk menghitung semua total keuntungan menggunakan fungsi rekursif dimana  `lsum` digunakan untuk menjumlahkan semua keuntungan dari indeks <= (`mid` atau `mid` + 1) sedangkan `rsum` digunakan untuk menjumlahkan semua keuntungan dari indeks > (`mid` atau `mid` + 1). maka dari itu hasil akhirnya didapatkan dari menjumlah `lsum` dan `rsum`.
	
***
## Tugas 1

 ![Screenshot](/jobsheet5/img/Screenshot%202025-03-24%20231549.png)
 ![Screenshot](/jobsheet5/img/Screenshot%202025-03-24%20231607.png)

***
**Penjelesan singkat:** 
Disini ada 7 step utama: 

**1. Buat class `Mahasiswa`**

Class ini adalah blueprint atau cetakan objek mahasiswa.

-   **Deklarasikan atribut:**
    
    -   `nama` → bertipe `String`
    -   `nim` → bertipe `String`
    -   `thnMasuk` → bertipe `int`
    -   `uts` → bertipe `int`
    -   `uas` → bertipe `int`
-   **Buat constructor:**
    
    -   Untuk mengisi nilai atribut saat objek dibuat.

 **2. Tambahkan method di class `Mahasiswa`**

 a. **utsTertinggi(Mahasiswa[] array, int awal, int akhir):**

-   Tujuannya mencari mahasiswa dengan nilai UTS tertinggi.
-   Gunakan konsep **rekursi + divide and conquer.**
-   Pecah array jadi dua bagian, lalu bandingkan hasilnya.

b. **utsTerendah(Mahasiswa[] array, int awal, int akhir):**

-   Sama seperti di atas, tapi mencari nilai UTS terendah.

c. **rataNilaiUAS(Mahasiswa[] array):**

-   Hitung total nilai UAS semua mahasiswa.
-   Bagi total tersebut dengan jumlah mahasiswa.
-   Kembalikan hasil berupa nilai rata-rata.

 **3. Buat class `MahasiswaMain` sebagai class utama**

Ini tempat di mana program akan dijalankan.

**4. Di dalam `main`: ambil input dari user**

-   Gunakan `Scanner` untuk meminta jumlah mahasiswa.
-   Buat array `Mahasiswa[]` sebanyak jumlah tersebut.
-   Gunakan perulangan `for` untuk:
    -   Input nama
    -   Input NIM
    -   Input tahun masuk
    -   Input nilai UTS
    -   Input nilai UAS
    -   Simpan data ke dalam array mahasiswa.

 **5. Panggil dan tampilkan hasil:**

-   Cetak nama dan nilai mahasiswa dengan **UTS tertinggi**.
-   Cetak nama dan nilai mahasiswa dengan **UTS terendah**.
-   Tampilkan **rata-rata nilai UAS** seluruh mahasiswa.

**6. Selesai!**

Tutup `Scanner`, dan program sudah bisa dijalankan dengan fitur-fitur yang kamu buat.
***
## Terima Kasih :)








