


|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020114|
| Nama |  Nabil Hanief Mafazi |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Calon-raja-ngoding/PADSD.git) |

# STACK
## Percobaan 1: Mahasiswa Mengumpulkan Tugas
 ![Screenshot](/jobsheet9/img/Screenshot%202025-05-03%20115832.png)	
***

  **Pertanyaan :**
  1. **Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?**
- urutan saat menampilkan menu 4, ubah kode pada method print menjadi seperti dibawah

	    public  void  print(){
		    for(int  i  =  top; i  >=  0; i--){
			    System.out.println(stack[i].nama  +  "\t"  +  stack[i].nim  +  "\t"  +  stack[i].kelas);
		    }
		    System.out.println("");
	    }

	 ![Screenshot](/jobsheet9/img/Screenshot%202025-05-03%20120709.png)	
 2. **Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!**
- Maksimal 5 seperti yg ditunjukkan kode dibawah.

	    StackTugasMahasiswa18  stack  =  new  StackTugasMahasiswa18(5);

 3. **Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?**
- Supaya tidak melewati batas pada array yg kita pesan, jika itu dihapus kita akan mmendapatkan error out of box ketika stacknya sudah penuh dan kita tetap push data baru.
4. **Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!**
- Tambahkan kode dibawah dalam class stackTugasMahasiswa()

	    public  Mahasiswa18  dataFirst(){
		    if (!isEmpty()) {
			    return  stack[0];
		    }else{
			    System.out.println("Stack kosong! Tidak ada tugas yang dikumpul.");
			    return  null;
		    }
	    }

-  Tambahkan juga case 5 di class MahasiswaDemo() seperti kode dibawah

	    case  5:
		    lihat  =  stack.dataFirst();
		    if (lihat  !=  null) {
			    System.out.println("Tugas terakhir dikumpulkan oleh "  +  lihat.nama);
		    }
		    break;
	 ![Screenshot](/jobsheet9/img/Screenshot%202025-05-03%20122836.png)	

5. **Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!**
- Tambahkan kode dibawah dalam class stackTugasMahasiswa()

	    public  int  jmlhTgs(){
		    return (top  +  1);
	    }

-  Tambahkan juga case 5 di class MahasiswaDemo() seperti kode dibawah

	    case  6:
		    System.out.println("Jumlah tugas saat ini adalah "  +  stack.jmlhTgs());
		    break;
	 ![Screenshot](/jobsheet9/img/Screenshot%202025-05-03%20123516.png)		
6. **Commit dan push kode program ke Github**
	 ![Screenshot](/jobsheet9/img/Screenshot%202025-05-03%20123759.png)		

***
## Percobaan 2: Konversi Nilai Tugas ke Biner


 ![Screenshot](/jobsheet9/img/Screenshot%202025-05-08%20062003.png)	
***
  **Pertanyaan :**
  1. **Jelaskan alur kerja dari method konversiDesimalKeBiner!**
- Pertama-tama kode membuat object dari class StackKonversi() lalu melakukan untuk mengkoversikan desimal ke biner dengan cara mengambil modulus 2 dari nilai dan memasukkannya ke object yg kita buat menggunakan method push(), lalu membagi 2 nilai setelah memasukkan hasil modulusnya, tahap itu akan berulang sampai nilai sama dengan 0 atau kurang. setelah itu kita buat variable biner bertipe data String untuk menampung tumpukan biner dari object, lalu membuat perulangan untuk memasukkan tumpukan biner di object ke variable biner menggunakan method pop() sampai tumpukan biner di object habis, lalu yg terkhir mereturn variable biner yg telah berisi tumpukan bilangan biner.
 2. **Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!**
- Hasilnya sama saja karena pada dasarnya selama nilai tidak sama dengan 0 maka perulangan akan terus mengulang dan nilai tidak mungkin kurang dari 0 karena pembagian dijava menghiraukan angka di belakang koma di hasilnya.
 ***

## Tugas 1

 ![Screenshot](/jobsheet9/img/Screenshot%202025-05-08%20065749.png)

 ![Screenshot](/jobsheet9/img/Screenshot%202025-05-08%20065803.png)

 ![Screenshot](/jobsheet9/img/Screenshot%202025-05-08%20065855.png)
 
 ![Screenshot](/jobsheet9/img/Screenshot%202025-05-08%20065906.png)

***

***
## Terima Kasih :)








