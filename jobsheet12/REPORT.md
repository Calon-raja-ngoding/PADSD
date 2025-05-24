


|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020114|
| Nama |  Nabil Hanief Mafazi |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Calon-raja-ngoding/PADSD.git) |

# Double Linked Lists
## 12.2.1 Percobaan 1
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20193942.png)	
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20193957.png)	
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20194016.png)	
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20194028.png)	
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20194037.png)	
***

  **Pertanyaan :**
  1. **Jelaskan perbedaan antara single linked list dengan double linked lists!**
- Single linked list hanya memiliki pointer ke node setelahnya, sedangkan double linkedlist memiliki pointer ke setelah dan sebelumnya.
 2. **Perhatikan class Node01, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?**
- Next berguna sebagai pointer ke node setelahnya, sedangkan prev sebagai pointer ke sebelumnya

 3. **Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan dari konstruktor tersebut?**

	    public  DoubleLinkedlist18(){
		    head  =  null;
		    tail  =  null;
	    }
- Untuk mendeklarasikan head dan tail null saat dipanggil
 4. **Pada method addFirst(), apa maksud dari kode berikut?**

	    if (isEmpty()) {
		    head  =  tail  =  newNode;

- Untuk Menambahkan data pertama kali saat linkedlist masih kosong.
5. **Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?**
- Untuk menghubungkan pointer prev head ke node yg terbaru.
6. **Modifikasi code pada fungsi print() agar dapat menampilkan warning/ pesan bahwa linked lists masih dalam kondisi kosong.**
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20195957.png)	
7. **Pada insertAfter(), apa maksud dari kode berikut ?**

	    current.next.prev  =  newNode;

- Untuk menghubungkan pointer sebelum setelahnya current ke newNode.
8. **Modifikasi menu pilihan dan switch-case agar fungsi insertAfter() masuk ke dalam menu pilihan dan dapat berjalan dengan baik.**
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20200917.png)	
***
## 12.3.1 Tahapan Percobaan


 **Pada screenshot percobaan 1 sudah mencakup percobaan 2**
***
  **Pertanyaan :**
  1. **Apakah maksud statement berikut pada method removeFirst()?**

		 head  =  head.next;
		 head.prev  =  null;
- Untuk memindahkan posisi head ke node setelah head lalu mengosongkan node sebelum head/ head yg lama.
2. **Modifikasi kode program untuk menampilkan pesan “Data sudah berhasil dihapus. Data yang terhapus adalah …**
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20201644.png)
 ***

## Tugas 1

 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20212210.png)
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20212229.png)
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20212247.png)
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20212305.png)
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20212324.png)
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20212343.png)
 ![Screenshot](/jobsheet12/img/Screenshot%202025-05-24%20212354.png)
***

***
## Terima Kasih :)
