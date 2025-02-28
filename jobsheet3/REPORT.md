|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020114|
| Nama |  Nabil Hanief Mafazi |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Calon-raja-ngoding/PADSD.git) |

# ARRAY OF OBJECT
## 3.2 Membuat Array dari Object, Mengisi dan Menampilkan


![Screenshot](/jobsheet3/img/Screenshot%202025-02-26%20165735.png)
***
**Penjelesan singkat:** 
Disini ada 5 step utama: 

1. **Mendeklarasikan class :**
   - `Mahasiswa18.java`
2.  **Mendeklarasikan Attribute :**
    -   nim String
    -   nama String
    -   kelas String
    -   ipk double
3.  **Mendeklarasikan class :**
    -   `MahasiswaDemo18` .
4. **Membuat object menggunakan array**
5. **Menampilkan attribut attribut object**
 ***
  **Pertanyaan :**
  1. **Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!**
   - Tidak Harus, bahkan bisa tidak memakai keduanya tapi tak ada gunanya .
 2. **Apa yang dilakukan oleh kode program berikut?**
 `Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3]` .
  -  Untuk membuat object dalam bentuk array .
 
 3. **Apakah class `Mahasiswa` memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?**
`arrayOfMahasiswa = new Mahasiswa[3]` . 
  - Ada, tapi karna default jadi tidak wajib di inisiasi
 
4. **Apa yang dilakukan oleh kode program berikut?**

       arrayOfMahasiswa[0] =  new  Mahasiswa18();
       arrayOfMahasiswa[0].nim  =  "244107060033";
       arrayOfMahasiswa[0].nama  =  "AGNES TITANIA KINANTI";
       arrayOfMahasiswa[0].kelas  =  "SIB-1E";
       arrayOfMahasiswa[0].ipk  = (float) 3.75;
-  Mengisi Attribute dari object
  
  5. **Mengapa class `Mahasiswa` dan `MahasiswaDemo` dipisahkan pada uji coba 3.2?**
  - Karna class `mahasiswa` bekerja sebagai class sedangkan `mahasiswaDemo` untuk membuat object
	
***
## 3.3 Menerima Input Isian Array Menggunakan Looping


 ![Screenshot](/jobsheet3/img/Screenshot%202025-02-27%20113430.png)	
***
**Penjelesan singkat:** 
Disini ada 2 step utama: 

1. **Mendeklarasikan Scanner diclass `MahasiswaDemo18`**
   - `MahasiswaMain18.java`
2.  **Mengubah pengisian dan penampilan attribute menjadi menggunakan `for` dan khusus pengisian kita ubah menjadi inputan**
 ***
  **Pertanyaan :**
  1. **Tambahkan method `cetakInfo()` pada class `Mahasiswa` kemudian modifikasi kode program pada langkah no 3.**
- Method `cetakInfo()` .

      void  cetakInfo(){
           System.out.println("Nim : "  +  nim);
           System.out.println("Nama : "  +  nama);
           System.out.println("Kelas : "  +  kelas);
           System.out.println("IPK : "  +  ipk);
           System.out.println("--------------------------------------------");
      }
      
 -  Modifikasi no3. 
   
        for(int  i  =  0; i  <  3; i++){
               arrayOfMahasiswa[i].cetakInfo();
        }  

 2. **Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama `myArrayOfMahasiswa`. Mengapa kode berikut menyebabkan error?**

        Mahasiswa[] myArrayOfMahasiswa  =  new  Mahasiswa[3];
        myArrayOfMahasiswa[0].nim  =  "244107060033";
        myArrayOfMahasiswa[0].nama  =  "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas  =  "SIB-1E";
        myArrayOfMahasiswa[0].ipk  = (float) 3.75;
- Karna kita baru menginisiasi arraynya bukan objectnya, jika ingin tidak erro kita harus manambahkan `myArrayOfMahasiswa[0] =  new  Mahasiswa();` sebelum mengisi attributenya

 ***
## 3.4 Constructor Berparameter

 ![Screenshot](/jobsheet3/img/Screenshot%202025-02-27%20115424.png)

***
**Penjelesan singkat:** 
Disini ada 4 step utama: 


1. **Mendeklarasikan class**
- `MataKuliah18()` .
- `MataKuliahDemo18()` .
2.  **Mendeklarasikan attribute dan konstruktor diclass `MataKuliah18()`**
3. **Mendeklarasikan Scanner diclass `MataKuliahDemo18()`**
4. **Membuat object dalam bentuk array**
- `arrayOfMataKuliah` .
5.  **Mengisi serta menampilkan attribute menggunakan `for`**
 ***
  **Pertanyaan :**
  1. **Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya**
 - Bisa, contohnya ada pada jobsheet pekan lalu
 2. **Tambahkan method `tambahData()` pada class `Matakuliah`, kemudian gunakan method tersebut di class `MatakuliahDemo` untuk menambahkan data `Matakuliah`**
- Membuat method `tambahData()` di class `mataKuliah18` dengan kode seperti dibawah .

	    void  tambahData(){
		    String  dummy;
		    System.out.print(" - Kode : ");
		    kode  =  sc.nextLine();
		    System.out.print(" - Nama : ");
		    nama  =  sc.nextLine();
		    System.out.print(" - SKS : ");
		    dummy  =  sc.nextLine();
		    sks  =  Integer.parseInt(dummy);
		    System.out.print(" - Jumlah Jam : ");
		    dummy  =  sc.nextLine();
		    jumlahJam  =  Integer.parseInt(dummy);
	    }
- Lalu isi dari for untuk menambahkan data dengan meamanggil method yang baru dibuat seperti kode dibawah .

	    for(int  i  =  0; i  <  3; i++){
		    System.out.println("Masukkan Data Mata Kuliah ke-"  + (i  +  1));
		    arrayOfMataKuliah[i] =  new  MataKuliah18();
		    arrayOfMataKuliah[i].tambahData();
		    System.out.println("------------------------------");
	    }

3. **Tambahkan method `cetakInfo()` pada class `Matakuliah`, kemudian gunakan method tersebut di class `MatakuliahDemo` untuk menampilkan data hasil inputan di layar**
  -  Membuat method `cetakInfo()` di class `MataKuliah18` dengan kode seperti dibawah .

		    void  cetakInfo(MataKuliah18  arrayOfMataKuliah){
		        System.out.println(" - Kode : "  +  arrayOfMataKuliah.kode);
		        System.out.println(" - Nama : "  +  arrayOfMataKuliah.nama);
		        System.out.println(" - SKS : "  +  arrayOfMataKuliah.sks);
		        System.out.println(" - Jumlah Jam : "  +  arrayOfMataKuliah.jumlahJam);
	    	    System.out.println("------------------------------");
	        }

 
4. **Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari array of object Matakuliah ditentukan oleh user melalui input dengan Scanner**
- Menambahkan variable didalam fungsi main class `MataKuliahDemo()` sebelum pembuatan object dengan array yang diinput sesuai  keinginan panjang (jumlah elemen) dari user seperti kode dibawah .

	    System.out.print("Masukkan jumlah Mata Kuliah : ");
		    int  jumlahMataKuliah  =  sc.nextInt();
- Modifikasi kode saat pembuatan object dibagian panjang (jumlah elemen) menjadi variable yang baru dibuat seperti kode dibawah .

	    MataKuliah18[] arrayOfMataKuliah  =  new  MataKuliah18[jumlahMataKuliah];

5. **Screenshot hasil akhir setelah dimodifikasi**
 ![Screenshot](/jobsheet3/img/Screenshot%202025-02-28%20102911.png)
	
***
## Tugas 1

 ![Screenshot](/jobsheet3/img/Screenshot%202025-02-28%20100759.png)

***
**Penjelesan singkat:** 
Disini ada 7 step utama: 


1. **Mendeklarasikan class serta attributenya**
- `Dosen18()` .
- Attribute :
	- `String kode` . 
	- `String nama` .
	- `Boolean jenisKelamin` .
	- `int usia` .
2.  **Mendeklarasikan  class baru**
- `DosenDemo18()` .
3. **Mendelarasikan Konstruktor parameter**
4. **Mendaklarasikan `Scanner` di class `DosenDemo18()`**
5.  **Membuat object dengan array dengan panjang (jumlah elemen) dari user**
- `arrayOfDosen18` .
6. **Melengkapi nilai object menggunakan for**
7. **Menampilkan data dosen menggunakan for juga** 
***
## Tugas 2
 ![Screenshot](/jobsheet3/img/Screenshot%202025-02-28%20011434.png)
 ![Screenshot](/jobsheet3/img/Screenshot%202025-02-28%20011447.png)
 ![Screenshot](/jobsheet3/img/Screenshot%202025-02-28%20011500.png)
 ![Screenshot](/jobsheet3/img/Screenshot%202025-02-28%20011513.png)
 ![Screenshot](/jobsheet3/img/Screenshot%202025-02-28%20011518.png)

***
**Penjelesan singkat:** 
Disini ada 7 step utama: 


1. **Mendeklarasikan class**
- `DataDosen18()` .
2.  **Mendeklarasikan method**
- `dataSemuaDosen(Dosen[] arrayOfDosen)` .
- `jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen)` .
- `rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen)` .
- `infoDosenPalingTua(Dosen[] arrayOfDosen)` .
- `infoDosenPalingMuda(Dosen[] arrayOfDosen)` .
3. **Membuat menu untuk user memilih informasi dosen yang di inginkan**
4.  **Menampilkan informasi dosen yang user inginkan dengan cara memanggil method dari class `DataDosen18()` yang sesuai dengan informasi yang user inginkan**
5. **Program akan berulang terus dari poin 3 sampai 4 diatas sampai user memilih keluar di pilihan menu**
6. **Commit dan push ke github**
 ![Screenshot](Screenshot%202025-02-19%20134841.png)
 ***
## Terima Kasih :)








