  
  
  

| | Algorithm and Data Structure |

|--|--|

| NIM | 244107020114|

| Nama | Nabil Hanief Mafazi |

| Kelas | TI - 1H |

| Repository | [link] (https://github.com/Calon-raja-ngoding/PADSD.git) |

  

# Tree

## 12.2.1 Percobaan 1

![Screenshot](/jobsheet13/img/Screenshot%202025-06-06%20211725.png)

***

  

**Pertanyaan :**

1.  **Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?**
- Karena urutan nilai dari **Binary search tree** tersusun sedangkan **Binary search** biasa acak.
2.  **Untuk apakah di class Node, kegunaan dari atribut left dan right?**
- **Left** dan **Right** berguna untuk menyimpan alamat anak dari node tersebut. Lebih spesifiknya **left** untuk menyimpan anak yg lebih kecil nilainya dari parent(node) dan **right** untuk yg lebih besar.
3.  **a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?**
- **root** berguna untuk menyimpan node pertama dan mebantu kita sebagai titik awal saat ingin mengelola data
**b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?**
- **root** akan bernilai null

4.  **Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?**
- akan terjadi proses node baru disimpan di root.

5.  **Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?**

	    parent  =  current;
	    if (mahasiswa.ipk  <  current.mahasiswa.ipk) {
		    current  =  current.left;
		    if (current  ==  null) {
			    parent.left  =  newNode;
			    return;
		    }
	    }else{
		    current  =  current.right;
		    if (current  ==  null) {
			    parent.right  =  newNode;
			    return;
		    }
	    }

- Untuk menentukan lokasi node yg akan kita tambahkan jika tree tidak kosong dengan perulangan, pertama kita inisialisasi `parent` sama dengan `root` karena kita akan mulai cek kondisinya mulai dari `root` setelah itu kita cek kondisinya apakah apakah nilai yg akan diinput lebih besar atau lebih kecil dari `parent` jika lebih besar maka kita pindahkan parent ke anak kanan(left) dari lokasi parent sekarang menggunakan `left`, sedangkan jika lebih kecil maka kita pindahkan ke anak kiri (right) menggunakan alamat `right`. Jika kita sudah memindahkan parent kita mengecek kondisinya apakah node dilokasi parent tersebut null atau tidak jika iya kita masukkan nilai yg akan diinput dilokasi parent saat ini, jika tidak kita lanjutkan lagi pengecekan seperti sebelumnya sampai menemukan lokasi node yg `null`. 

6.  **Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?**

- Saat sebuah node yang akan dihapus memiliki dua anak, metode `delete()` akan mencari node pengganti yang disebut _successor_. Successor adalah node dengan nilai terkecil di subtree kanan dari node yang akan dihapus. Fungsi `getSuccessor()` akan menelusuri anak kanan dari node tersebut, lalu mencari node paling kiri dari subtree itu. Jika successor bukan anak langsung dari node yang dihapus, maka struktur tree akan disesuaikan agar tetap seimbang. Setelah itu, node yang dihapus digantikan dengan successor, dan koneksi anak kiri dari node lama disambungkan ke successor. Dengan cara ini, struktur dan sifat Binary Search Tree tetap terjaga.
***

## 12.3.1 Tahapan Percobaan

![Screenshot](/jobsheet13/img/Screenshot%202025-06-07%20045735.png)

***

**Pertanyaan :**

1.  **Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?**
- data digunakan untuk menyimpan data data mahsiswa dan idxLast ntuk menunjukkan indeks kosong setelah indeks terakhir yg kita inputkan.

2.  **Apakah kegunaan dari method populateData()?**
- Untuk menambahkan data.
3. **Apakah kegunaan dari method traverseInOrder()?**
- Untuk menampilkan seluruh data secara In Order Traversal.
4. **Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masing-masing?**
-  Tergantung kita mulai darimana index jika 0 maka right childnya berada di ( 2 * indeks dari node + 2 ) dan left childnya di ( 2 * indeks dari node + 1 )  sedangkan kalau kita mulai dari 1 maka right childnya berada di ( 2 * indeks dari node ) dan left childnya berada di ( 2 * index dari node + 1 ).
5. **Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?**
- Untuk kita deklarasikan di idxLast nya kelas BinaryTreeArray dan kenapa kita deklarasikan pake 6? karna data yg kita masukkan berjumlah 6 yg tidak bernilai null dan kita mulai dari indeks 0 pemasukan datanya jadi otomatis indeks terakhir yg berisikan data tidak sama dengan null ada di index 6.
6. **Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?**
- Indeks `2 * idxStart + 1` dan `2 * idxStart + 2` digunakan dalam pemanggilan rekursif karena merupakan rumus untuk menentukan posisi anak kiri dan anak kanan pada binary tree yang disimpan dalam bentuk array.
***

  

## Tugas 1

  

![Screenshot](/jobsheet13/img/Screenshot%202025-06-11%20070133.png)

  

![Screenshot](/jobsheet13/img/Screenshot%202025-06-11%20070656.png)
***

  

***

## Terima Kasih :)