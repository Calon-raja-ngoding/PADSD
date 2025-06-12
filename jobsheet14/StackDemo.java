package jobsheet14;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        

        Book book1 = new Book("1234", "Dasar Pemoragraman");
        Book book2 = new Book("7145", "Hafalan Shalat Delisa");
        Book book3 = new Book("3562", "Muhammad Al-Fatih");

        Stack<Book> books = new Stack<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Book temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book temp2 = books.peek();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println(books);
        books.search(book2);
        
    }
}
