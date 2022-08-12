package day01.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class MyBookCollection {

    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();

        books.add(new Book("Let us C", "Yashwant Kanetkar"));
        books.add(new Book("Operating System", "Galvin"));
        books.add(new Book("Data Communications & Networking", "Forouzan"));

        Iterator<Book> b = books.iterator();
        System.out.println("----------------------Books-----------------------------------");
        while(b.hasNext()){
            System.out.println(b.next());
        }
        System.out.println("--------------------------------------------------------------");

    }
}
