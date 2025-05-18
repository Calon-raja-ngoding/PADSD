


|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020114|
| Nama |  Nabil Hanief Mafazi |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Calon-raja-ngoding/PADSD.git) |

# QUEUE
## Percobaan 1 : Operasi Dasar Queue
 ![Screenshot](/jobsheet10/img/Screenshot%202025-05-08%20080945.png)	
***

  **Pertanyaan :**
  1. **Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?**
- Karna size menunjukkan jumlah dalam antrian makanya dikasih 0 karena pada saat program di run belum ada yg di inputkan, sedangkan front dan rear menunjukkan indeks awal antrian dan akhir antrian makanya dikasih -1, jika dikasih 0 berarti sudh  ada yg mulai mengantri.	
 2. **Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!**

	     if (rear  ==  max  -  1) {
		    rear  =  0;

- Untuk melanjutkan antrian jika ke indeks 0, kenapa kembali ke indeks 0? karena queue itu antrian yg ibarat lingkaran makanya dia akan berputar kembali ke 0 jika rear sudah mencapai batas dari array yg dipesan beda dengan size yg seperti antrian lurus.

 3. **Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!**

	     if (front  ==  max  -  1) {
		    front  =  1;

- Hampir sama dengan soal no2 bedanya rear patokan untuk menginput data sedangkan front untuk memberikan data.
4. **Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?**
- 

5. **Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut**
	    i  = (i  +  1) %  max;
-  kode itu digunakan untuk mengatur antrian untuk menampilkan data agar terus bertambah dan kembali ke 0 jika sudah mencapai max
6. **Tunjukkan potongan kode program yang merupakan queue overflow!**
         if (isFull()) {
            System.out.println("Queue sudah penuh");
         }
7. **Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!**
 ![Screenshot](/jobsheet10/img/Screenshot%202025-05-18%20181928.png)

***
## Percobaan 2 : Antrian Layanan Akademik


 ![Screenshot](/jobsheet10/img/Screenshot%202025-05-08%20125344.png)
 ![Screenshot](/jobsheet10/img/Screenshot%202025-05-08%20125400.png)	
***
  **Pertanyaan :**
  1. **Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga method LihatAkhir dapat dipanggil!**
 ![Screenshot](/jobsheet10/img/Screenshot%202025-05-18%20182439.png)
 ***

## Tugas 1

 ![Screenshot](/jobsheet10/img/Screenshot%202025-05-18%20173738.png)
 ![Screenshot](/jobsheet10/img/Screenshot%202025-05-18%20173757.png)
 ![Screenshot](/jobsheet10/img/Screenshot%202025-05-18%20173814.png)
 ![Screenshot](/jobsheet10/img/Screenshot%202025-05-18%20173831.png)
 ![Screenshot](/jobsheet10/img/Screenshot%202025-05-18%20173838.png)

***

***
## Terima Kasih :)








