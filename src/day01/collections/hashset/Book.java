package day01.collections.hashset;

public class Book {
        private String name,author;

        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Author: " + this.author ;
    }
}

