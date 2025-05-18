package jobsheet10.p1;
public class Quueue {
    int data[], front, rear, size, max;
    public Quueue(int n){
        max = n;
        data = new int[n];
        size = 0;
        front = rear = -1;

    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == max;
    }
    public void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] +  " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public boolean Enqueue(int dt){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            return true;
        }else{
            if (isEmpty()) {
                front = rear = 0;    
            }else{
                if (rear == max - 1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            return false;
        }
    }
    public int Dequeue(){
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }else{
                if (front == max - 1) {
                    front = 1;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
    public void  clear(){
        size = 0;
        front = rear = -1;
    }
}
