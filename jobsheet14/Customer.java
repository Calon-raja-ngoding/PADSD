package jobsheet14;
public class Customer {
    int id;
    String nama;
    public Customer(){

    }
    public Customer(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    public String toString(){
        return "ID : " + this.id + " Nama : " + this.nama;
    }
}